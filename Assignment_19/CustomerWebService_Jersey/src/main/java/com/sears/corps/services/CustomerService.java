/**
 * 
 */
package com.sears.corps.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sears.corps.model.Customer;

/**
 * @author athora0
 *
 */

public interface CustomerService {
	public int addCustomer(Customer customer);

	public List<Customer> getAllCustomers();

	public int updateCustomer(Customer customer);

	public int deleteCustomer(int id);
}
