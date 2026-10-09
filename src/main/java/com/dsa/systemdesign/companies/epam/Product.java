package com.dsa.systemdesign.companies.epam;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private String name;
    private int price;
    private boolean isInStock;
}
