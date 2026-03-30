package com.magasin.cms.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_product;

    private String type_product;
    private String name_product;
    private Double price_product;
    private String dimension;
    private String color;

    // Getters and Setters
    public Integer getId_product() { return id_product; }
    public void setId_product(Integer id_product) { this.id_product = id_product; }
    public String getType_product() { return type_product; }
    public void setType_product(String type_product) { this.type_product = type_product; }
    public String getName_product() { return name_product; }
    public void setName_product(String name_product) { this.name_product = name_product; }
    public Double getPrice_product() { return price_product; }
    public void setPrice_product(Double price_product) { this.price_product = price_product; }
    public String getDimension() { return dimension; }
    public void setDimension(String dimension) { this.dimension = dimension; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
}