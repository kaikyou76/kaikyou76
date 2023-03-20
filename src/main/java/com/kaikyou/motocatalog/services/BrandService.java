package com.kaikyou.motocatalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaikyou.motocatalog.beans.Brand;
import com.kaikyou.motocatalog.mappers.BrandMapper;

@Service
public class BrandService {
    @Autowired
    BrandMapper brandMapper;
    public List<Brand> getBrands(){
        return brandMapper.selectAll();
    }
}
