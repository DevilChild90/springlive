package net.nvsoftware.springmono.controller;

import net.nvsoftware.springmono.model.Product;
import net.nvsoftware.springmono.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("/save")
    public Product save(@RequestBody Product product){
        productService.save(product);
        return product;
    }
}
