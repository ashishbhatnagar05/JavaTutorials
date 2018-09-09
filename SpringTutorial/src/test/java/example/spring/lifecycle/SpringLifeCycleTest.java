package example.spring.lifecycle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { SpringLifeCycleTest.XML_LIFECYCLE })
public class SpringLifeCycleTest {
	public static final String XML_LIFECYCLE = "file:src/test/resources/example/spring/lifecycle/lifecycle.xml";

	@Test
	public void test() {
		System.out.println("Spring context loaded succesfully");
	}

}
