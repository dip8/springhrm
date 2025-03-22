package com.SpingbootBank.repository;

import com.SpingbootBank.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findByCustName(String custName);

    Customer findByCustEmailIdAndCustPassword(String custEmailId, String custPassword);
}
