package com.kaikyou.motocatalog.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kaikyou.bean.Brand;
import com.kaikyou.bean.Motorcycle;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MotosController {

    @RequestMapping("/hello")
    public String hello(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "test";
    }

    @GetMapping("/motos")
    public String motos(Model model) {
        // ブランド
        List<Brand> brands = new ArrayList<>();
        brands.add(new Brand("01", "HONDA"));
        brands.add(new Brand("02", "KAWASAkI"));

        // バイク
        List<Motorcycle> motorcycles = new ArrayList<>();
        motorcycles
                .add(new Motorcycle(1, "GB350", 800, 1, "空冷", 500000, "良い音", new Brand("01", "HONDA"), 1, null, null));
        motorcycles.add(
                new Motorcycle(2, "Ninja", 800, 2, "水冷", 1000000, "すいすい", new Brand("02", "KAWASAKI"), 1, null, null));

        model.addAttribute("brands", brands);
        model.addAttribute("motorcycles", motorcycles);

        log.info("motos:{}",motorcycles);

        return "moto_list";
    }
}
