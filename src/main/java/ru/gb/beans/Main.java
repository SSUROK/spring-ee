package ru.gb.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
        System.out.println(Arrays.asList(context.getBeanDefinitionNames()));
        Logic logic = context.getBean(Logic.class);
        logic.play();
    }
}
