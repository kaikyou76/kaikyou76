package com.kaikyou.motocatalog.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kaikyou.motocatalog.beans.Brand;

@Mapper
public interface BrandMapper {
    public List<Brand> selectAll();
}
