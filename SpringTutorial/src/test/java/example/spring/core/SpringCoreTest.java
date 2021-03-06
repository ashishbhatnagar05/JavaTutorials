package example.spring.core;

import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/test/resources/example/spring/core/beans.xml") // all beans will get initialized when the whole
																		// test loaded
public class SpringCoreTest {

	@Autowired
	private Student student;

	@Test
	public void testContextConfigurationLoading() {
		assertNotNull(student);
		System.out.println("autowired object's hashcode: " + student.hashCode());
		System.out.println(student.getId() + student.getName() + student.getDepartment()
				+ student.getAddresses().get(0).getCity().getName());
	}

	@Ignore
	@Test
	public void testFileSystemXmlApplicationContextInitialization() {
		@SuppressWarnings("resource")
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/test/resources/beans.xml");
		Student student = context.getBean("student", Student.class);
		System.out.println(student.getId());
		context.close();
	}

	@Ignore
	@Test
	public void ClassPathXmlApplicationContextInitialization() {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student student = context.getBean("student", Student.class);
		System.out.println(student.getId());
		context.close();
	}

}
