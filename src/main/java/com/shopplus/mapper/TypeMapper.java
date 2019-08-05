package com.shopplus.mapper;

import com.shopplus.pojo.DongType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TypeMapper {
    List<DongType> dongTypeList();
}
