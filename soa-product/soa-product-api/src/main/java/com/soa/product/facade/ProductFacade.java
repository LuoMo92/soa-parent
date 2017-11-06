package com.soa.product.facade;

import com.soa.product.domain.Product;

import java.util.List;

public interface ProductFacade {
    List<Product> findAllProduct();
}
 