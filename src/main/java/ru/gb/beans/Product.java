package ru.gb.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class Product {
    private int id;
    private String title;
    private int cost;

    @Override
    public String toString() {
        return id + " " + title + " " + cost;
    }
}
