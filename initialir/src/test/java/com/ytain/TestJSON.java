package com.ytain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class TestJSON {

	@Test
	public void typeChange(){
		String aa="{'5'}";
		aa = aa.replace("{", "").replace("}", "").replace("'", "");
		System.out.println(aa);
		
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(aa);
		if(matcher.find()){
			System.out.println(matcher.group());
		}
		
	}
}
