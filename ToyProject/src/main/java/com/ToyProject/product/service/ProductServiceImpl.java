package com.ToyProject.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ToyProject.product.mapper.ProductMapper;
import com.ToyProject.product.vo.ProductVo;


@Service("ProductService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;


    @Override
    public void inserProduct(ProductVo productVO) throws Exception {
        // TODO Auto-generated method stub

    }

    @Override
    public List<ProductVo> selectProduct(String productID) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

	


}