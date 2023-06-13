package com.example.server.controller.website;

import com.example.server.data.dto.LampDto;
import com.example.server.service.LampService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/lamps")
public class LampPageController {

    private final LampService lampService;

    public LampPageController(LampService lampService) {
        this.lampService = lampService;
    }

    @GetMapping("/{id}")
    public ModelAndView getLampPage(@PathVariable(value = "id") Long id) {
        ModelAndView modelAndView = new ModelAndView("lamp.html");
        LampDto lamp = lampService.getLampById(id);
        modelAndView.addObject("lamp", lamp);
        return modelAndView;
    }
}
