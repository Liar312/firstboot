package ru.victor.springmvc.firstboot.rest.restcontrollers;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;
import org.springframework.web.servlet.function.ServerResponse;
import ru.victor.springmvc.firstboot.modelDto.Country;

import java.util.List;

@Controller
@RestController
public class CountryController {
    @GetMapping("/france")
    public Country france(){
        Country country=Country.of("France",67);
        return country;
    }

    @GetMapping("/Spain")
    public ResponseEntity<Country> Spain(){
        Country country = Country.of("France",67);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("continent","Europe")
                .header("capital","Madrid")
                .body(country);
    }
    @GetMapping("/all")
    public List<Country> all(){
        Country country1 = Country.of("France",67);
        Country country2 = Country.of("Spain",47);
        return List.of(country1,country2);
    }
}
