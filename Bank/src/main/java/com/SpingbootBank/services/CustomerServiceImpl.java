package com.SpingbootBank.services;

import com.SpingbootBank.model.Customer;
import com.SpingbootBank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Customer signUp(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public boolean signIn(String custEmailId, String custPassword) {
        return false;
    }

    @Override
    public Optional<Customer> findById(int custId) {
        boolean flag = false;

        Customer customer =customerRepository.findByCustEmailIdAndCustPassword(custEmailId, custPassword);

        if(customer != null && customer.getCustEmailId().equals(custEmailId) && customer.getCustPassword().equals(custPassword) ) {
            flag = true;
        }
        return flag;
    }

    @Override
    public List<Customer> findAll() {
        return List.of();
    }

    @Override
    public List<Customer> findByName(String custName) {
        return List.of();
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public void deleteById(int custId) {

    }

    @Override
    public void deleteAll() {

    }
}
