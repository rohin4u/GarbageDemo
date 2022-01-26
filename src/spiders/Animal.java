package spiders;

public class Animal {

	static Animal a;
	public static void main(String[] args) {
		
//		Animal a1 = new Animal();
//		Animal a2 = new Animal();
//		System.out.println(a1);
//		System.out.println(a2);
//		
//		a1=null;
//		System.gc();
//		
//		System.out.println(a1);
//		System.out.println(a2);
//		System.out.println("Total Memory :"+run.totalMemory());
//		System.out.println("Free Memory:"+run.freeMemory());
//		
//		d1=null;
//		
//		run.gc();
//		
//		System.out.println("Free Memory:"+run.freeMemory());
		
		String s1 = new String();
		String s2 = new String();
		
		System.out.println(s1);
		System.out.println(s2);
		
		s1=null;
		
		System.gc();
		
		System.out.println(s1);
		System.out.println(s2);
		
		
				
		
	}
	
		
	public  void finalize() {
		 System.out.println("o buddy i finalize is being called");
//		 a=this;
		 
	}
}
