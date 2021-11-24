package ru.gb.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Scope("prototype")
public class Cart {

    private final HashMap<Product, Integer> cart = new HashMap<>();

    public void addOne(Integer id, Integer quantity){
        Product product = ProductRepository.returnByID(id);
        if (cart.containsKey(id)){
            cart.put(product, cart.get(id) + quantity);
        }else
            cart.put(product, quantity);
    }

    public void remove(Integer id){
        Product product = ProductRepository.returnByID(id);
        cart.remove(product);
    }

    public HashMap<Product, Integer> show(){
        return cart;
    }
}
