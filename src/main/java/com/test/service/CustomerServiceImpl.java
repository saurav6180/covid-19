package com.test.service;


import com.test.dao.CustomerDaoImpl;
import com.test.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDaoImpl customerDao;


    @Override
    public boolean registerCustomer(Customer customer) {



        int count = 0;

        if (count == 1) {
            return true;
        } else {
            return false;
        }
    }
}