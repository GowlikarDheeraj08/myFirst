

class con1 {
	con1(String a){
		System.out.println("hello! "+a);
		
	}
	}
	
public class sam2 {
	void hello(String a) {
		System.out.println("welcome"+a);
	}
	void hello(String c, String a,String b) {
		System.out.println("Congratulations "+c+"! "+a+b);
	}
	public static void main(String args[]) {
		sam2 zuzu=new sam2();
		zuzu.hello("Dheeraj");
		zuzu.hello("Dheeraj","java"," Installed");
		con1 vava =new con1("Dheeraj");
		//con1()
		
	}

}
