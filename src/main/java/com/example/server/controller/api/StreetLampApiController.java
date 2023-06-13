package com.example.server.controller.api;

import com.example.server.data.dto.StreetLampDto;
import org.springframework.web.bind.annotation.*;
import com.example.server.service.StreetLampService;

import java.util.List;

@RestController
@RequestMapping("/rest-api/streetlamps")
public class StreetLampApiController {

    private final StreetLampService streetLampService;

    public StreetLampApiController(StreetLampService streetLampService) {
        this.streetLampService = streetLampService;
    }

    @GetMapping
    public List<StreetLampDto> getStreetLamps() {
        return streetLampService.getStreetLamps();
    }

    @GetMapping("/{id}")
    public StreetLampDto getStreetLamp(@PathVariable("id") Long id) {
        return streetLampService.getStreetLampById(id);
    }

    @PostMapping
    public void postStreetLamp(@RequestBody StreetLampDto streetLampDto) {
        streetLampService.addStreetLamp(streetLampDto);
    }

    @PutMapping("/{id}")
    public void putStreetLamp(@PathVariable("id") Long id, @RequestBody StreetLampDto streetLampDto) {
        streetLampService.putStreetLamp(streetLampDto, id);
    }

    @DeleteMapping("/{id}")
    public void deleteStreetLamp(@PathVariable("id") Long id) {
        streetLampService.deleteStreetLamp(id);
    }

}
