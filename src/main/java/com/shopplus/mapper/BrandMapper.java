package com.shopplus.mapper;

import com.shopplus.pojo.Brand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BrandMapper {
    List<Brand> brandList();
}
