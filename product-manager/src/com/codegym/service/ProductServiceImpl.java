package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {

    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Samsung Galaxy 8", 100, "San pham moi ra doi 2019","Samsung"));
        products.put(2, new Product(2, "Samsung Galaxy 9", 190, "San pham cao cap cua Samsung","Samsung"));
        products.put(3, new Product(3, "Iphone 5S", 90, "San pham cua Apple","Apple"));
        products.put(4, new Product(4, "Iphone 7S", 150, "San pham cao cap cua Apple","Apple"));
        products.put(5, new Product(5, "Oppo V5", 80, "San pham gia phai chang cua Oppo","Oppo"));
        products.put(6, new Product(6, "Xiaomi X9", 120, "San pham cao cap cua Xiaomi", "Xiaomi"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
