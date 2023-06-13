package com.example.server.controller.website;

import com.example.server.data.dto.ChandelierDto;
import com.example.server.data.dto.LampDto;
import com.example.server.data.dto.StreetLampDto;
import com.example.server.data.entity.Chandelier;
import com.example.server.service.ChandelierService;
import com.example.server.service.LampService;
import com.example.server.service.StreetLampService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/catalog")
public class CatalogPageController {

    private final ChandelierService chandelierService;
    private final LampService lampService;
    private final StreetLampService streetLampService;

    public CatalogPageController(ChandelierService chandelierService,
                                 LampService lampService,
                                 StreetLampService streetLampService
    ) {
        this.chandelierService = chandelierService;
        this.lampService = lampService;
        this.streetLampService = streetLampService;
    }

    @GetMapping
    public ModelAndView getCatalogPage() {
        ModelAndView modelAndView = new ModelAndView("catalog.html");
        List<ChandelierDto> chandelierList = chandelierService.getChandeliers();
        List<StreetLampDto> streetLampList = streetLampService.getStreetLamps();
        List<LampDto> lampList = lampService.getLamps();
        modelAndView.addObject("chandeliers", chandelierList);
        modelAndView.addObject("streetlamps", streetLampList);
        modelAndView.addObject("lamps", lampList);
        return modelAndView;
    }
}
