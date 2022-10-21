package com.example.store.service;

import com.example.store.model.Item;

import java.util.Set;

public interface ShoppingCartService {
    Set<Item> addProduct(Set<Integer> productList);

    Set<Item> getAllProduct();
}