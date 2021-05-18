package com.sliit.mtit9.productservice.persistence;
import com.sliit.mtit9.productservice.dto.Products;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Products, Integer> {
}
