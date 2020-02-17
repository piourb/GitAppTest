package org.pu.git.test;

public class MainClass {
	
	public FeatureBase feature001=new Feature001();
	public FeatureBase feature002=new Feature002();
	
	public static void main(String[] args) {
		new MainClass().feature001.print();
		new MainClass().feature002.print();
	}
	
	
}
