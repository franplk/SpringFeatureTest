/**
 * 
 */
package spring.convertion;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.core.convert.support.DefaultConversionService;

/**
 * @author {康培亮/AB052634}
 *
 */
public class ConversionTest {

	@Test  
	public void testConverter() {  
	    DefaultConversionService serivce = new DefaultConversionService();  
	    boolean actual = serivce.canConvert(String.class, Boolean.class);  
	    Assert.assertEquals(true, actual);  
	    Boolean acc = serivce.convert("true", Boolean.class);  
	    Assert.assertEquals(true, acc.booleanValue());  
	}
	
}
