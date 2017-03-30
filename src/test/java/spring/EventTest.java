package spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.plk.lisener.event.CustomEvent;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/context.xml")
public class EventTest extends AbstractJUnit4SpringContextTests {
    
    @Test
    public void test_refresh () {
        ApplicationEvent event = new ContextRefreshedEvent(applicationContext);
        applicationContext.publishEvent(event);
        logger.debug("Application Refreshed");
    }
    
    @Test
    public void test_custom () {
        ApplicationEvent event = new CustomEvent(applicationContext);
        applicationContext.publishEvent(event);
    }
}
