package com.beyondprogramming.service;

import com.beyondprogramming.domain.Product;

import java.util.List;

public interface ProductService {

    Product getProduct(Integer id);

    List<Product> listProducts();
}
