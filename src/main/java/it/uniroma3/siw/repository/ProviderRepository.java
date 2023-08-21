package it.uniroma3.siw.repository;

import it.uniroma3.siw.model.Product;
import it.uniroma3.siw.model.Provider;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProviderRepository extends CrudRepository<Provider, Long> {
    public List<Provider> getProvidersByProductsNotContaining(Product product);

    public List<Provider> findByName(String name);

}
