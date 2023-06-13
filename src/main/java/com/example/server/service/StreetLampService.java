package com.example.server.service;

import com.example.server.data.dto.StreetLampDto;
import com.example.server.data.entity.Lamp;
import com.example.server.data.entity.StreetLamp;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.example.server.repository.StreetLampRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class StreetLampService {

    private final StreetLampRepository streetLampRepository;
    private final LampService lampService;

    public StreetLampService(StreetLampRepository streetLampRepository, LampService lampService) {
        this.streetLampRepository = streetLampRepository;
        this.lampService = lampService;
    }

    private List<StreetLampDto> getStreetLampDtoListFromStreetLampList (List<StreetLamp> streetLampList) {
        List<StreetLampDto> streetLampDtoList = new ArrayList<>();
        streetLampList.forEach(streetLamp -> {
            streetLampDtoList.add(new StreetLampDto(streetLamp));
        });
        return streetLampDtoList;
    }

    public List<StreetLampDto> getStreetLamps() {
        return getStreetLampDtoListFromStreetLampList(streetLampRepository.findByOrderById());
    }

    public StreetLampDto getStreetLampById(Long id) {
        return new StreetLampDto(streetLampRepository.findById(id).
                orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));
    }

    public void addStreetLamp(StreetLampDto streetLampDto) {
        Lamp lamp = lampService.getLampEntityById(streetLampDto.getLampId());
        streetLampRepository.save(new StreetLamp(streetLampDto, lamp));
    }

    public void putStreetLamp(StreetLampDto streetLampDto, Long id) {
        Lamp lamp = lampService.getLampEntityById(streetLampDto.getLampId());
        StreetLamp streetLamp = new StreetLamp(streetLampDto, lamp);
        streetLamp.setId(id);
        streetLampRepository.save(streetLamp);
    }

    public void deleteStreetLamp(Long id) {
        streetLampRepository.delete(streetLampRepository.findById(id).
                orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));
    }
}
