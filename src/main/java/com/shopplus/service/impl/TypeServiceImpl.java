package com.shopplus.service.impl;

import com.shopplus.mapper.TypeMapper;
import com.shopplus.pojo.DongType;
import com.shopplus.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    TypeMapper typeMapper;
    @Override
    public List<DongType> dongTypeList() {

        return typeMapper.dongTypeList();
    }
}
