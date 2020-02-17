package org.pu.git.test;

import java.util.Arrays;

public class MainClass {
	
	public FeatureBase tab[]= {new Feature001(),new Feature002(),new Feature003(),new Feature003()};
		
	public static void main(String[] args) {
		Arrays.asList(new MainClass().tab).stream().forEach(e->e.print());		
	}
}
