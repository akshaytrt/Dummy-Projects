/**
 * 
 */
package com.sears.corps.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.sears.corps.model.Customer;

/**
 * @author athora0
 *
 */
@Component
public class CustomerDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public int addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO CUSTOMER (ID,NAME,AGE,ADDRESS)VALUES('" + customer.getId() + "','"
				+ customer.getName() + "','" + customer.getAge() + "','" + customer.getAddress() + "')";
		return jdbcTemplate.update(query);
	}

	public List<Customer> getAllCustomers() {
		String query = "SELECT ID,NAME,AGE,ADDRESS FROM CUSTOMER";
		List<Customer> customers = jdbcTemplate.query(query, new CustomerMapper());
		return customers;
	}

	public int updateCustomer(Customer customer) {
		String query = "UPDATE CUSTOMER SET NAME='" + customer.getName() + "',AGE=" + customer.getAge() + ",ADDRESS='"
				+ customer.getAddress() + "' WHERE ID=" + customer.getId();
		return jdbcTemplate.update(query);

	}

	public int deleteCustomer(int id) {
		String query = "DELETE FROM CUSTOMER WHERE ID=" + id;
		return jdbcTemplate.update(query);

	}

}
