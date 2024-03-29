package ru.victor.springmvc.firstboot.services;

import org.springframework.stereotype.Service;
import ru.victor.springmvc.firstboot.models.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    public void addProduct(Product product){
        products.add(product);
    }
    public List<Product> findAll(){
        return products;
    }
}
