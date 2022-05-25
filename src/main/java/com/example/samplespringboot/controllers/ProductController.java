package com.example.samplespringboot.controllers;

import com.example.samplespringboot.entities.Product;
import com.example.samplespringboot.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "product")
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping(value = "/")
    public String getAll(ModelMap map) {
        map.addAttribute("products", this.service.getAll());
        return "/product-list";
    }

    @RequestMapping(value = "/add")
    public String add(ModelMap map, Product product) {
        if (this.service.add(product) != null) {
            map.addAttribute("product", product);
            return "/product-detail";
        }
        return "/error";
    }
}
