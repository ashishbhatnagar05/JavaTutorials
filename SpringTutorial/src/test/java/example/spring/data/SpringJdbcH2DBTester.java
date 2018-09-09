package example.spring.data;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * A test client for spring-jdbc-h2 db connection
 * 
 * @author Dungeon_Master
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { SpringJdbcH2DBTester.XML })
public class SpringJdbcH2DBTester {
	public static final String XML = "file:src/test/resources/example/spring/data/persistence.xml";

	@Autowired
	private CustomerDAO customerDAO;

	@Test
	public void test() {
		System.out.println("Spring context loaded succesfully");
	}

	@Test
	public void testCustomerDao() {
		customerDAO.insert(new Customer(1, "ashish", 24));
		Customer customer = customerDAO.findByCustomerId(1);
		assertNotNull(customer);
		System.out.println(customer.getName());
	}

}
