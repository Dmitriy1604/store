package com.example.store.service;

import com.example.store.component.ShoppingCart;
import com.example.store.model.Item;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service

public class ShoppingCartServiceImpl implements ShoppingCartService {

    private final ShoppingCart shoppingCart;

    public ShoppingCartServiceImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public Set<Item> addProduct(Set<Integer> ids) {
       return shoppingCart.add(ids.stream()
               .map(Item::new)
               .collect(Collectors.toSet()));
    }

    public Set<Item> getAllProduct() {
        return shoppingCart.getProductIdList();
    }
}