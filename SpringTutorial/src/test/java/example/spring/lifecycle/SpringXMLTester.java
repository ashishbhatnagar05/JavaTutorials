package example.spring.lifecycle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { SpringXMLTester.XML })
public class SpringXMLTester {
	public static final String XML = "file:src/test/resources/lifecycle.xml";

	@Test
	public void test() {
		System.out.println("Spring context loaded succesfully");
	}

}
