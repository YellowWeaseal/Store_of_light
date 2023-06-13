package com.example.server.controller.website;

import com.example.server.data.dto.LampDto;
import com.example.server.data.dto.StreetLampDto;
import com.example.server.service.LampService;
import com.example.server.service.StreetLampService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/streetlamps")
public class StreetLampPageController {

    private final StreetLampService streetLampService;
    private final LampService lampService;

    public StreetLampPageController(StreetLampService streetLampService, LampService lampService) {
        this.streetLampService = streetLampService;
        this.lampService = lampService;
    }

    @GetMapping("/{id}")
    public ModelAndView getStreetLampPage(@PathVariable(value = "id") Long id) {
        ModelAndView modelAndView = new ModelAndView("streetlamp.html");
        StreetLampDto streetLamp = streetLampService.getStreetLampById(id);
        LampDto lamp = lampService.getLampById(streetLamp.getLampId());
        modelAndView.addObject("streetlamp", streetLamp);
        modelAndView.addObject("lamp", lamp);
        return modelAndView;
    }
}
