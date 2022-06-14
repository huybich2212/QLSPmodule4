package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService{

    private static final Map<Integer,Product> products;

    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"Tu Lanh",7,260));
        products.put(2,new Product(2,"May Giat",9,270));
        products.put(3,new Product(3,"Ti vi ",8,240));
        products.put(4,new Product(4,"May tinh",10,290));
        products.put(5,new Product(5,"Dien thoai",20,160));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public void seach(String name) {

    }
}
