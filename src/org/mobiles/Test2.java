package org.mobiles;
//non static method into static method with object
public class Test2 {

	public void camera() {
		
		System.out.println("12MegaPixel");
		}
	public static void processor(Test2 m) {
		
		m.camera();
		
		System.out.println("quad core");
	}
	
	
	public static void main(String[] args) {
		
		Test2 m=new Test2();
		
		m.processor(m);
		
		

	}

}
