package ru.gb.beans;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductRepository {

    @ProductCreator
    private static List<Product> productList;

    public static Product returnByID(int id){
        return productList.get(id);
    }

    public List<Product> returnAll(){
        return productList;
    }
}
