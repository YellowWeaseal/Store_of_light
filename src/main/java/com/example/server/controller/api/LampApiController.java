package com.example.server.controller.api;

import com.example.server.data.dto.LampDto;
import org.springframework.web.bind.annotation.*;
import com.example.server.service.LampService;

import java.util.List;

@RestController
@RequestMapping("/rest-api/lamps")
public class LampApiController {

    private final LampService lampService;

    public LampApiController(LampService lampService) {
        this.lampService = lampService;
    }

    @GetMapping
    public List<LampDto> getLamps() {
        return lampService.getLamps();
    }

    @GetMapping("/{id}")
    public LampDto getLamp(@PathVariable("id") Long id) {
        return lampService.getLampById(id);
    }

    @PostMapping
    public void postLamp(@RequestBody LampDto lampDto) {
        lampService.addLamp(lampDto);
    }

    @PutMapping("/{id}")
    public void putLamp(@PathVariable("id") Long id, @RequestBody LampDto lampDto) {
        lampService.putLamp(lampDto, id);
    }

    @DeleteMapping("/{id}")
    public void deleteLamp(@PathVariable("id") Long id) {
        lampService.deleteLamp(id);
    }

}
