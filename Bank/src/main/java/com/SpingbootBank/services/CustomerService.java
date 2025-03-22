package com.SpingbootBank.services;

import com.SpingbootBank.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Customer signUp(Customer customer);

    boolean signIn(String custEmailId, String custPassword);

    Optional<Customer> findById(int custId);

    List<Customer> findAll();

    List<Customer> findByName(String custName);

    Customer update(Customer customer);

    void deleteById(int custId);

    void deleteAll();
}
