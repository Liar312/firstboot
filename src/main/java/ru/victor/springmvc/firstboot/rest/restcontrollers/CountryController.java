package ru.victor.springmvc.firstboot.rest.restcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.victor.springmvc.firstboot.modelDto.Country;

@Controller
@RestController
public class CountryController {
    @GetMapping("/france")
    public Country france(){
        Country country=Country.of("France",67);
        return country;
    }
}
