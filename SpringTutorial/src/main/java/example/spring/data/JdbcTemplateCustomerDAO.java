package example.spring.data;

import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateCustomerDAO implements CustomerDAO {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insert(Customer customer) {
		String query = "INSERT INTO CUSTOMER(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
		jdbcTemplate.update(query, customer.getCustId(), customer.getName(), customer.getAge());

	}

	public Customer findByCustomerId(int custId) {
		String query = "SELECT * FROM CUSTOMER WHERE CUST_ID =?";
		return jdbcTemplate.queryForObject(query, new Object[] { custId }, new CustomerMapper());
	}

}
