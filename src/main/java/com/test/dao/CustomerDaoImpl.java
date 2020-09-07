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
        
        Customer customer1= new Customer();

        customer1.setId(1);
        customer1.setName("kumar");
        customer1.setAdd("Ranchi");
        customer1.setMob(878978529);

        al.add(customer1);

        return al;
    }
}
