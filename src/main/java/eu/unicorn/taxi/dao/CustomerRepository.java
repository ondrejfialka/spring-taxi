package eu.unicorn.taxi.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import eu.unicorn.taxi.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
    
    List<Customer> findByFirstName(String firstName);
   
}