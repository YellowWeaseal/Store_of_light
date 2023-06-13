package com.example.server.service;

import com.example.server.repository.LampRepository;
import com.example.server.data.dto.LampDto;
import com.example.server.data.entity.Lamp;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class LampService {

    private final LampRepository lampRepository;

    public LampService(LampRepository lampRepository) {
        this.lampRepository = lampRepository;
    }

    private List<LampDto> getLampDtoListFromLampList (List<Lamp> lampList) {
        List<LampDto> lampDtoList = new ArrayList<>();
        lampList.forEach(lamp -> {
            lampDtoList.add(new LampDto(lamp));
        });
        return lampDtoList;
    }

    public List<LampDto> getLamps() {
        return getLampDtoListFromLampList(lampRepository.findByOrderById());
    }

    public LampDto getLampById(Long id) {
        return new LampDto(lampRepository.findById(id).
                orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));
    }

    public Lamp getLampEntityById(Long id) {
        return lampRepository.findById(id).
                orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public void addLamp(LampDto lampDto) {
        lampRepository.save(new Lamp(lampDto));
    }

    public void putLamp(LampDto lampDto, Long id) {
        Lamp lamp = new Lamp(lampDto);
        lamp.setId(id);
        lampRepository.save(lamp);
    }

    public void deleteLamp(Long id) {
        lampRepository.delete(lampRepository.findById(id).
                orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));
    }
}
