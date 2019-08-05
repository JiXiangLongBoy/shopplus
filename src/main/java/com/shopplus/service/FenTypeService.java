package com.shopplus.service;


import com.shopplus.pojo.DongType;
import com.shopplus.pojo.FenType;

import java.util.List;

public interface FenTypeService {
    List<FenType> fenTypeList(DongType dongTypeId);
}
