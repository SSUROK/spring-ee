package ru.gb.service;

import ru.gb.entity.Product;


public class ProductService {

    public Product createNewProduct(int id){
        return new Product(id, "Product #" + String.valueOf(id), (int) (Math.random() * 1000));
    }
}
