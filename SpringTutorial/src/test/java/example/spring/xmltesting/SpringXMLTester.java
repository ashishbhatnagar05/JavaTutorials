package example.spring.xmltesting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { SpringXMLTester.XML_CORE, SpringXMLTester.XML_DATA, SpringXMLTester.XML_LIFECYCLE })
public class SpringXMLTester {
	public static final String XML_CORE = "file:src/test/resources/example/spring/core/beans.xml";
	public static final String XML_DATA = "file:src/test/resources/example/spring/data/persistence.xml";
	public static final String XML_LIFECYCLE = "file:src/test/resources/example/spring/lifecycle/lifecycle.xml";

	@Test
	public void test() {
		System.out.println("Spring context loaded succesfully");
	}

}
