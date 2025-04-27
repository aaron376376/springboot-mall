package com.aaron376.demo2.rowmapper;

import com.aaron376.demo2.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product product = new Product();
        product.setProductId(resultSet.getInt("product_Id"));
        product.setProductName(resultSet.getString("product_Name"));
        product.setCategory(resultSet.getString("category"));
        product.setImageUrl(resultSet.getString("imageUrl"));
        product.setPrice(resultSet.getInt("price"));
        product.setStock(resultSet.getInt("stock"));
        product.setDescription(resultSet.getString("description"));
        product.setCreateDate(resultSet.getTimestamp("createDate"));
        product.setLastModifiedDate(resultSet.getTimestamp("lastModifiedDate"));

        return product;
    }
}
