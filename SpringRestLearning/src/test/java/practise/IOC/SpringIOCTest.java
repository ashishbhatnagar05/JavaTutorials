package practise.IOC;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(locations = "beans.xml")
public class SpringIOCTest {

	@Autowired
	private Student student;

	@Test
	public void test() {
		assertNotNull(student);
	}
}
