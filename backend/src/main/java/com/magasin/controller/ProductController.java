package com.magasin.cms.controller;

import com.magasin.cms.model.Product;
import com.magasin.cms.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // allow your HTML to access
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Get all products for table
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Example: total stock per month (dummy for now, you can implement real logic)
    @GetMapping("/stock-monthly")
    public List<Integer> getMonthlyStock() {
        return List.of(50, 75, 100, 90, 120, 80, 60, 70, 110, 130, 95, 85);
    }

    @GetMapping("/purchase-monthly")
    public List<Double> getMonthlyPurchasePrice() {
        return List.of(500.0, 700.0, 650.0, 800.0, 900.0, 750.0, 600.0, 670.0, 890.0, 950.0, 720.0, 810.0);
    }

    @GetMapping("/sale-monthly")
    public List<Double> getMonthlySaleRevenue() {
        return List.of(1000.0, 1200.0, 1100.0, 1400.0, 1500.0, 1300.0, 1150.0, 1250.0, 1450.0, 1600.0, 1350.0, 1420.0);
    }
}