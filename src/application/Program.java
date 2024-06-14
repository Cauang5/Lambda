package application;

import entities.Product;

import java.util.ArrayList;

import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1500.00));
        list.add(new Product("Celular", 1200.00));

        list.sort((p1, p2) -> p2.getPrice().compareTo(p1.getPrice()));

        for(Product p : list){
            System.out.println(p);
        }
    }

}
