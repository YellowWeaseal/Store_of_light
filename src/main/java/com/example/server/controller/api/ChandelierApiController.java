package com.example.server.controller.api;

import com.example.server.service.ChandelierService;
import com.example.server.data.dto.ChandelierDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest-api/chandeliers")
public class ChandelierApiController {

    private final ChandelierService chandelierService;

    public ChandelierApiController(ChandelierService chandelierService) {
        this.chandelierService = chandelierService;
    }

    @GetMapping
    public List<ChandelierDto> getChandeliers() {
        return chandelierService.getChandeliers();
    }

    @GetMapping("/{id}")
    public ChandelierDto getChandelier(@PathVariable("id") Long id) {
        return chandelierService.getChandelierById(id);
    }

    @PostMapping
    public void postChandelier(@RequestBody ChandelierDto chandelierDto) {
        chandelierService.addChandelier(chandelierDto);
    }

    @PutMapping("/{id}")
    public void putChandelier(@PathVariable("id") Long id, @RequestBody ChandelierDto chandelierDto) {
        chandelierService.putChandelier(chandelierDto, id);
    }

    @DeleteMapping("/{id}")
    public void deleteChandelier(@PathVariable("id") Long id) {
        chandelierService.deleteChandelier(id);
    }

}
