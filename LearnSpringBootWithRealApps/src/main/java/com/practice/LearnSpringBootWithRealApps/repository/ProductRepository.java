package com.practice.LearnSpringBootWithRealApps.repository;

import com.practice.LearnSpringBootWithRealApps.entitiy.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by RadwanAnik on 1/5/2020.
 */

@Repository("productRepository")
public interface ProductRepository extends CrudRepository<Product,Integer> {

}
