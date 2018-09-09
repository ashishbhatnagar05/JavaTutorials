package example.spring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanFactoryPostProcessorEx implements BeanFactoryPostProcessor {

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		PrintToConsole
				.print("BeanFactoryPostProcessor.postProcessBeanFactory method called with bean defination count: " + beanFactory.getBeanDefinitionCount());

	}

}
