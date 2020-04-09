package com.kg.academy.lesson73.repository;

import com.kg.academy.lesson73.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop,Long> {
        @Query("select c from Laptop c where c.model = :model")
         Laptop findByModel(@Param("model") String model);

        @Query("select l from Laptop l where l.name LIKE :name% or  lower(l.name) like :name%")
         Laptop findByName(@Param("name") String name);
}
