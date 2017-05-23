package ru.tsystems.js20.storefrontApp.service;

import ru.tsystems.js20.storefrontApp.Product;

import java.util.List;

public interface ProductService {

    void updateProducts();

    List<Product> getAllProducts();

}
