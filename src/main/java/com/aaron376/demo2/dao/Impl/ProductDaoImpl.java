package com.aaron376.demo2.dao.Impl;

import com.aaron376.demo2.dao.ProductDao;
import com.aaron376.demo2.model.Product;
import com.aaron376.demo2.rowmapper.ProductRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public Product getProductById(Integer productId) {
        String sql = "select product_id,product_name,categroy,image_url,price,stock,description,created_date," +
                "last_modified_date from product where product_id = :productID";
        Map<String,Object> map = new HashMap<>();
        map.put("product_Id",productId);
        List<Product> productList = namedParameterJdbcTemplate.query(sql, map, new ProductRowMapper());
        if (productList.size() > 0) {
            return productList.get(0);
        } else {
            return null;
        }
    }
}
