package com.aaron376.demo2.service.Impl;

import com.aaron376.demo2.dao.ProductDao;
import com.aaron376.demo2.model.Product;
import com.aaron376.demo2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
