package com.janadev.product.domain;

import com.janadev.product.domain.categoria.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@AllArgsConstructor
public class Product {
    
    public final String id;
    public final String name;
    public final BigDecimal preco;
    public final List<Category> categories;
}
