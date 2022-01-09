package org.mobiles;
//non static method into static method with object
public class Test1 {

	public void camera() {
		
		System.out.println("12MegaPixel");
		}
	public static void processor(Test1 m) {
		
		m.camera();
		
		System.out.println("quad core");
	}
	
	
	public static void main(String[] args) {
		
		Test1 m=new Test1();
		
		m.processor(m);
		
		

	}

}
