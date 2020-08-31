package com.test.dao;

import com.test.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao
{
    @Override
    public List<Customer> save()
    {
        ArrayList al = new ArrayList<>();

        Customer customer= new Customer();

        customer.setId(1);
        customer.setName("saurav");
        customer.setAdd("patna");
        customer.setMob(827115544);

        al.add(customer);

        return al;
    }
}
