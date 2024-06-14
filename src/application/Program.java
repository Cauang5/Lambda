package application;

import entities.Product;
import util.ConsumerPriceUpdate;
import util.FunctionUpperCase;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1500.00));
        list.add(new Product("Celular", 1200.00));
        list.add(new Product("HD", 100.00));
        list.add(new Product("Case", 35.90));

       double min = 1500.00;

        //list.removeIf(product -> product.getPrice() > min); //Predicate

        //list.forEach(product -> product.setPrice(product.getPrice() * 1.1)); //Consumer

        List<String> names = list.stream().map(product -> product.getName().toUpperCase()).collect(Collectors.toList()); //Function

        names.forEach(System.out::println);
    }
}
