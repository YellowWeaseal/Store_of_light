package com.example.server.service;

import com.example.server.data.dto.ChandelierDto;
import com.example.server.data.entity.Chandelier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.example.server.repository.ChandelierRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChandelierService {

    private final ChandelierRepository chandelierRepository;

    public ChandelierService(ChandelierRepository chandelierRepository) {
        this.chandelierRepository = chandelierRepository;
    }

    private List<ChandelierDto> getChandelierDtoListFromChandelierList (List<Chandelier> chandelierList) {
        List<ChandelierDto> chandelierDtoList = new ArrayList<>();
        chandelierList.forEach(chandelier -> {
            chandelierDtoList.add(new ChandelierDto(chandelier));
        });
        return chandelierDtoList;
    }

    public List<ChandelierDto> getChandeliers() {
        return getChandelierDtoListFromChandelierList(chandelierRepository.findByOrderById());
    }

    public ChandelierDto getChandelierById(Long id) {
        return new ChandelierDto(chandelierRepository.findById(id).
                orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));
    }

    public void addChandelier(ChandelierDto chandelierDto) {
        chandelierRepository.save(new Chandelier(chandelierDto));
    }

    public void putChandelier(ChandelierDto chandelierDto, Long id) {
        Chandelier chandelier = new Chandelier(chandelierDto);
        chandelier.setId(id);
        chandelierRepository.save(chandelier);
    }

    public void deleteChandelier(Long id) {
        chandelierRepository.delete(chandelierRepository.findById(id).
                orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));
    }
}
