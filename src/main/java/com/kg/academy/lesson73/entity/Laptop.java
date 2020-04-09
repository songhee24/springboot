package com.kg.academy.lesson73.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Table(name = "laptop")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "display")
    String display;

    @Column(name = "model")
    String model;

    @Column(name = "GPU")
    String gpu;

    @Column(name = "core")
    String core;

    @Column(name = "RAM")
    String ram;

    @Column(name = "SSD")
    String ssd;

    @Column(name = "ram_graphics_card")
    String ramGraphicsCard;

    @Column(name = "windows_version")
    String windowsVersion;

}
