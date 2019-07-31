package alexrm84;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class NoFoodBFPP implements BeanFactoryPostProcessor {
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        for(String name: beanDefinitionNames){
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(name);
            String className = beanDefinition.getBeanClassName();
            System.out.println(className);
            try {
                Class<?> beanClass = Class.forName(className);
                NoFood annotation = (NoFood) beanClass.getAnnotation(NoFood.class);
                if(annotation != null) {
                    Class otherFood = annotation.otherFood();
                    beanDefinition.setBeanClassName(otherFood.getName());
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
