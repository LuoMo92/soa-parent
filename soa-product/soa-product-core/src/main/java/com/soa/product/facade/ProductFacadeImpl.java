package com.soa.product.facade;

import com.soa.product.domain.Product;
import com.soa.product.service.ProductService;

import javax.annotation.Resource;
import java.util.List;


public class ProductFacadeImpl implements ProductFacade {

    @Resource
    private ProductService productService;

    public List<Product> findAllProduct() {
        return this.productService.findAllProduct();
    }

}
 