package com.kaikyou.motocatalog.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kaikyou.motocatalog.beans.Motorcycle;

@Mapper
public interface MotorcycleMapper {
    /**
     * バイク情報を全件検索する
     * @return　バイク情報リスト
     */
    public List<Motorcycle> selectAll();
}
