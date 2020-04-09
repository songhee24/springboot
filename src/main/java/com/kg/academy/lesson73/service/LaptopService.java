package com.kg.academy.lesson73.service;

import com.kg.academy.lesson73.entity.Laptop;

import java.util.List;


public interface LaptopService {
      List<Laptop> getAllComputers();

      Laptop findByModel(String model);

      Laptop save(Laptop laptop);

      Laptop findByName(String name);
}
