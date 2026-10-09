package com.dsa.systemdesign.companies.epam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TopThreeCheapestProductsWhichAreInStock {
    public static void main(String[] args) {

        List<Product> productList = Arrays.asList(
                new Product("headphones",100,true),
                new Product("keyboard",40,false),
                new Product("phone",200,true),
                new Product("watch",50,true),
                new Product("bag",10,true),
                new Product("water bottle",350,true));

        List<String> prodNames = productList.stream().filter(Product::isInStock).sorted(Comparator.comparingInt(Product::getPrice)).map(Product::getName).limit(3).toList();

        System.out.println(prodNames);

    }
}
