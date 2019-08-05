package com.shopplus.service.impl;

import com.shopplus.mapper.FentypeMapper;
import com.shopplus.pojo.DongType;
import com.shopplus.pojo.FenType;
import com.shopplus.service.FenTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FenTypeServiceImpl implements FenTypeService {
    @Autowired
    FentypeMapper fentypeMapper;
    @Override
    public List<FenType> fenTypeList(DongType dongTypeId) {
        List<FenType> fenTypeList =fentypeMapper.fenTypeList(dongTypeId);
        return fenTypeList;
    }
}
