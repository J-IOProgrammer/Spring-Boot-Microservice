package io.jcoder.onlineshop.repository;

import io.jcoder.onlineshop.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
