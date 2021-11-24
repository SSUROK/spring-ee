package ru.gb.beans;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

@Component
public class Logic {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private Cart cart;

    public void play() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Do you want to add or remove something from your cart?");
            String answer = in.nextLine();
            Integer id;
            switch (answer){
                case "add":
                    System.out.println("What do you want to add ");
                    id = in.nextInt();
                    Integer quantity = in.nextInt();
                    cart.addOne(id, quantity);
                    break;
                case "remove":
                    System.out.println("What do you want to remove ");
                    id = in.nextInt();
                    cart.remove(id);
                    break;
                case "show":
                    HashMap<Product, Integer> c = cart.show();
                    c.forEach((k,v) -> {
                        System.out.println(k.toString() + " quantity " + v);
                    });
                    break;
                default :
                    System.out.println("Unknown command");
                    break;
            }
        }
    }
}
