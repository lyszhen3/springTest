package com.test;

import com.test.beanTest.FactoryTest;
import com.test.beanTest.Son;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


/**
 * Created by pc on 2016-08-12.
 */
@SuppressWarnings("deprecation")
public class BeanFactoryTest {

    @Test
    public void testSimpleLoad(){
        BeanFactory bf=new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
        MyTestBean test=(MyTestBean)bf.getBean("myTestBean");
        System.out.println(test.getTestStr());
    }
    @Test
   public void testFactoryMethod(){
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
        Son son  = new Son();
        son.setId(1);
        son.setName("我的天");
        FactoryTest factoryTest = (FactoryTest)bf.getBean("factoryTest",2,son);//配置文件报红挺不爽的。。不知道正式环境能不能启动
        System.out.println(factoryTest.getSon().getName());
   }
}
