import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Sam1 {
	@FunctionalInterface
	interface calc<t>{
		void add(t num1,t num2);
	}
	public static void main(String args[]) {
	System.out.println("hello Dheeraj Congratulations you have installed all the required applications!");
	//creating and adding into list
	List<Integer> nums= new ArrayList<Integer>();
	nums.add(10);
	nums.add(30);
	nums.add(20);
	nums.add(50);
	nums.add(100);
	nums.add(50);
	
	System.out.println(nums);
	//calling interface function
	calc<Double> calcdouble=(n1,n2)->System.out.println(n1+n2);
	calcdouble.add(10.2, 20.3);
//streams	
	Stream<Integer> strmOfInt=Stream.of(10,30,20,100,50);
	
	strmOfInt
	.filter(e->e>10)
	.sorted()
	.distinct()
	.forEach(e->System.out.println(e));
	Random rann=new Random();
	System.out.println("your otp");
	int ranNo=rann.nextInt(9999-100)+1;
	System.out.println(ranNo);
	
	}
}
