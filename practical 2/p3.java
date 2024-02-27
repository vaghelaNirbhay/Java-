public class p3{
	public static void main(String[] argus) {
		demo d1 = new demo();
		demo d2 = new demo(2,3);
		demo d3 = new demo(0.5,0.5);
		demo d4 = new demo("Nirbhay");
	}
}
 class demo{
	demo(){
		System.out.println(" This is No-argument Constructor.... ");
	}

	demo(int a,int b){
		System.out.println(" Parameterized constructor  with integer argument... " + (a+b));
	}

	demo(double a,double b){
		System.out.println(" Parameterized constructor double argument ... " + (a+b));
	}
	
	demo(String name){
		System.out.println(" Your name is  " + (name));
	}
	
}