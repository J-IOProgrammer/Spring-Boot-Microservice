package io.jcoder.onlineshop.controller;

import io.jcoder.onlineshop.dto.ProductRequest;
import io.jcoder.onlineshop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void creatProduct(@RequestBody ProductRequest request) {
        productService.creatProduct(request);
    }
}
