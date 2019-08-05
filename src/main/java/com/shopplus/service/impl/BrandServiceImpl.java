package com.shopplus.service.impl;

import com.shopplus.mapper.BrandMapper;
import com.shopplus.pojo.Brand;
import com.shopplus.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    BrandMapper brandMapper;
    @Override
    public List<Brand> brandList() {
        List<Brand> brandList = brandMapper.brandList();
        return brandList;
    }
}
