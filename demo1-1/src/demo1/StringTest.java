package demo1;

import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {
	public static void main(String[] args) {
		String address = "安徽省合肥市安徽省合肥市庐阳区庐江路好安徽省立医院保健中心3楼阳光体检中心";
		String regEx="[^省]+省[^市]+市";  
		Pattern p = Pattern.compile(regEx);   
		Matcher m = p.matcher(address);
		int byteSize = 0;
		System.out.println(m.find());
		System.out.println(m.group() + "--" + m.start());
		System.out.println(m.group() + "--" + m.start());
		System.out.println(m.group() + "--" + m.start());
		m.reset();
		System.out.println(m.find());
		System.out.println(m.group() + "--" + m.start());
		System.out.println(m.find());
		System.out.println(m.group() + "--" + m.start());
		if (!m.find()){
		System.out.println(m.find());
		} 
		try {
			System.out.println(address.getBytes("GBK").length);
			Object param = address.getBytes("GBK").length;
			byteSize = address.getBytes("GBK").length;
			System.out.println(param.getClass());
			System.out.println(param instanceof String);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println(byteSize);
		System.out.println(m.find());
		if (byteSize > 60 && m.find()) {
			System.out.println(address.replace(m.group(), "") + "111");
		}
		
		// class loader name
		System.out.println(StringTest.class.getClassLoader().toString());
		
		
	}
}
