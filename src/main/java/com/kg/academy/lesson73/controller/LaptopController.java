package com.kg.academy.lesson73.controller;


import com.kg.academy.lesson73.entity.Laptop;
import com.kg.academy.lesson73.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laptop") // localhost:8080/computer
public class LaptopController {
       @Autowired
        private LaptopService laptopService;

       @PostMapping
       public Laptop create(@RequestBody Laptop laptop){
           return laptopService.save(laptop);
       }

       @GetMapping("/model")
       @ResponseBody
       public Laptop getByModel(@RequestParam String m){
           return laptopService.findByModel(m);
       }

       @GetMapping("/name")
       @ResponseBody
       public Laptop getByName(@RequestParam String n){
           return laptopService.findByName(n);
       }

       @GetMapping("/all")
       public List<Laptop> getAll(){
           return laptopService.getAllComputers();
       }
}
