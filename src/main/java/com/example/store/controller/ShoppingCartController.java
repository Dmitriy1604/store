package com.example.store.controller;

import com.example.store.model.Item;
import com.example.store.service.ShoppingCartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/order")
public class ShoppingCartController {

    private final ShoppingCartService service;

    public ShoppingCartController(ShoppingCartService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public Set<Item> addProductToShoppingCart(@RequestParam(name = "productId", required = false) Set<Integer> productIdList) {
        return service.addProduct(productIdList);
    }

    @GetMapping("/get")
    public Set<Item> getAllProductsFromShoppingCart() {
        return service.getAllProduct();
    }
}