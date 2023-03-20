package com.kaikyou.motocatalog.services;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kaikyou.motocatalog.beans.Motorcycle;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class MotosServiceTest {
    @Autowired
    MotosService service;

    @Test
    void バイク情報を全件検索できる(){
        List<Motorcycle> motos = service.getMotos();
        //検索結果の件数確認
        assertThat(motos.size()).isEqualTo(5);
        //検索結果の各項目の確認
        Motorcycle moto = motos.get(0);//1件目
        assertThat(moto.getMotoNo()).isEqualTo(1);
        assertThat(moto.getMotoName()).isEqualTo("Ninja H2"); 
        assertThat(moto.getPrice()).isEqualTo(3300000);        

    }
}
