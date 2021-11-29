package ru.gb.beans.repository;

import org.springframework.stereotype.Component;
import ru.gb.beans.entity.Product;
import ru.gb.beans.service.ProductCreator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ProductRepository {

    private final List<Product> productList = new ArrayList<>();

    public Optional<Product> returnByID(int id){
        if(id < productList.size()) {
            return Optional.ofNullable(productList.get(id));
        }else{
            return Optional.empty();
        }
    }

    public List<Product> returnAll(){
        return productList;
    }

    public void add(Product product){
        product.setId(productList.size());
        productList.add(product);
    }

    public void edit(Product product){
        productList.set(product.getId(), product);
    }

    public void deleteByID(int id){
        if(id < productList.size()) {
            productList.remove(id);
        }
    }

    public int size(){
        return productList.size();
    }
}
