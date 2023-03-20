package com.kaikyou.motocatalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaikyou.motocatalog.beans.Motorcycle;
import com.kaikyou.motocatalog.mappers.MotorcycleMapper;
@Service
public class MotosService {

    @Autowired
    MotorcycleMapper motorcycleMapper;

    public List<Motorcycle> getMotos(){
        return motorcycleMapper.selectAll();
    }
    
}
