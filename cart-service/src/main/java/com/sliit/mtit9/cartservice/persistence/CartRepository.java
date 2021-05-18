package com.sliit.mtit9.cartservice.persistence;

import com.sliit.mtit9.cartservice.dto.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CrudRepository<Cart, Integer> {
}
