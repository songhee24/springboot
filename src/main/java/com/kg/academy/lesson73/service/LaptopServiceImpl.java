package com.kg.academy.lesson73.service;

import com.kg.academy.lesson73.entity.Laptop;
import com.kg.academy.lesson73.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopServiceImpl implements LaptopService {
    @Autowired
    private LaptopRepository laptopRepository;

    @Override
    public List<Laptop> getAllComputers() {
        return laptopRepository.findAll();
    }

    @Override
    public Laptop findByModel(String model) {
        return laptopRepository.findByModel(model);
    }

    @Override
    public Laptop save(Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    @Override
    public Laptop findByName(String name) {
        return laptopRepository.findByName(name);
    }
}
