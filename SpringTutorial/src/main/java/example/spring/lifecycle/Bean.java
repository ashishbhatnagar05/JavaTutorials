package example.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bean implements InitializingBean, DisposableBean {

	@PostConstruct
	public void annotationInit() {
		PrintToConsole.print("annotationInit() method called");
	}

	public void afterPropertiesSet() throws Exception {
		PrintToConsole.print("InitializingBean.afterPropertiesSet() method called");

	}

	public void xmlInit() {
		PrintToConsole.print("xmlInit() method called");
	}

	// Destroy

	@PreDestroy
	public void annotationDestroy() {
		PrintToConsole.print("annotationDestroy() method called");
	}

	public void destroy() throws Exception {
		PrintToConsole.print("DisposableBean.destroy() method called");

	}

	public void xmlDestroy() {
		PrintToConsole.print("xmlDestroy() method called");
	}

}
