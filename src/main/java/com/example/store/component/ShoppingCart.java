package com.example.store.component;

import com.example.store.model.Item;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Component
@SessionScope
public class ShoppingCart {
    private Set<Item> productIdList;

    public ShoppingCart() {
        this.productIdList = new HashSet<> ();
    }

    public Set<Item> add(Set<Item> resultList) {
        this.productIdList.addAll ( resultList );
        return this.productIdList;
    }

    public Set<Item> add(Item item) {
        this.productIdList.add ( item );
        return this.productIdList;

    }

    public Set<Item> getProductIdList() {
        return Collections.unmodifiableSet(productIdList);
    }
}
