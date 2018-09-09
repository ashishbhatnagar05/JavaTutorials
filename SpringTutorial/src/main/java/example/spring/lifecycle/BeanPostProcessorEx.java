package example.spring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

// this will run before and after initialization of any bean in the context
public class BeanPostProcessorEx implements BeanPostProcessor {
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		PrintToConsole.print("BeanPostProcessor.postProcessBeforeInitialization  method called on bean: " + bean);
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		PrintToConsole.print("BeanPostProcessor.postProcessAfterInitialization  called on bean: " + bean);
		return bean;
	}

}
