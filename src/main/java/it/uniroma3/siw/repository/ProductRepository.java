package it.uniroma3.siw.repository;

import it.uniroma3.siw.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {
    public boolean existsByNameAndPrice(String name, Integer price);

    public List<Product> findByPrice(Integer price);

}
