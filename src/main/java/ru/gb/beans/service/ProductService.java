package ru.gb.beans.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.beans.entity.Product;
import ru.gb.beans.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Product returnByID(int id){
        return productRepository.returnByID(id).orElse(new Product());
    }

    public List<Product> returnAll(){
        return productRepository.returnAll();
    }

    public void add(Product product){
        productRepository.add(product);
    }

    public void edit(Product product){
        productRepository.edit(product);
    }

    public void deleteByID(int id){
        if(id < productRepository.size()) {
            productRepository.deleteByID(id);
        }
    }
}
