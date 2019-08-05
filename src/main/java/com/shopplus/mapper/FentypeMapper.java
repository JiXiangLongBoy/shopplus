package com.shopplus.mapper;

import com.shopplus.pojo.DongType;
import com.shopplus.pojo.FenType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FentypeMapper {
    List<FenType> fenTypeList(DongType dongTypeId);
}
