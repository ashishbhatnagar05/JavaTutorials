package example.spring.data;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerMapper implements RowMapper<Customer> {

	public Customer mapRow(ResultSet resultSet, int i) throws SQLException {

		Customer customer = new Customer();
		customer.setCustId(resultSet.getInt("CUST_ID"));
		customer.setName(resultSet.getString("NAME"));
		customer.setAge(resultSet.getInt("AGE"));
		return customer;
	}
}