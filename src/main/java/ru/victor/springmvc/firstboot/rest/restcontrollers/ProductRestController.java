package ru.victor.springmvc.firstboot.rest.restcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.victor.springmvc.firstboot.modelDto.ProductDto;

@Controller
@RestController
public class ProductRestController {
    @GetMapping("/iphone")
    public ProductDto iphone(){
        ProductDto productDto = ProductDto.offer("Iphone",1000);
        return productDto;
    }
}
