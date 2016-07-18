/**
 * 
 */
package com.sears.corps.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import com.sears.corps.model.Customer;

/**
 * @author athora0
 *
 */
public class CustomerMapper implements RowMapper<Customer> {

	public Customer mapRow(ResultSet resultSet, int row) throws SQLException {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setId(resultSet.getInt(1));
		customer.setName(resultSet.getString(2));
		customer.setAge(resultSet.getInt(3));
		customer.setAddress(resultSet.getString(4));
		return customer;
	}

}
