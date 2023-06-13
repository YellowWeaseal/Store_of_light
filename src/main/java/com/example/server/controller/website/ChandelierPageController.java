package com.example.server.controller.website;

import com.example.server.data.dto.ChandelierDto;
import com.example.server.service.ChandelierService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/chandeliers")
public class ChandelierPageController {

    private final ChandelierService chandelierService;

    public ChandelierPageController(ChandelierService chandelierService) {
        this.chandelierService = chandelierService;
    }

    @GetMapping("/{id}")
    public ModelAndView getChandelierPage(@PathVariable(value = "id") Long id) {
        ModelAndView modelAndView = new ModelAndView("chandelier.html");
        ChandelierDto chandelier = chandelierService.getChandelierById(id);
        modelAndView.addObject("chandelier", chandelier);
        return modelAndView;
    }
}
