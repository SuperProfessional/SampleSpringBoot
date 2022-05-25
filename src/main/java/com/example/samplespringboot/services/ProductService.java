package com.example.samplespringboot.services;

import com.example.samplespringboot.entities.Product;
import com.example.samplespringboot.repositories.IProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private IProductRepository repository;

    public ProductService(IProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAll() {
        return this.repository.findAll();
    }

    public Product update(Product product) {
        Long id = product.getId();
        if (id != null) {
            Optional<Product> optional = this.repository.findById(id);
            if (optional.isPresent()) {
                return this.repository.save(product);
            }
        }
        return null;
    }

    public Product add(Product product) {
        product.setId(null);
        return this.repository.save(product);
    }

    public Product dalete(Long id) {
        Optional<Product> optional = this.repository.findById(id);
        if (optional.isPresent()) {
            this.repository.deleteById(id);
            return optional.get();
        }
        return null;
    }
}
