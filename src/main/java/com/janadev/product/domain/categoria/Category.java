package com.janadev.product.domain.categoria;

import com.janadev.product.domain.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Category {

    public final String id;
    public final String name;
    public final List<Product> products;
}
