/**
 * 
 */
package cn.plk.convert;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * @author {康培亮/AB052634}
 *
 */
public class StringToDate implements Converter<String, Date> {

	private String format = "yyyy-MM-dd";

	@Override
	public Date convert(String source) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			return sdf.parse(source);
		} catch (Exception e) {
			return null;
		}
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

}