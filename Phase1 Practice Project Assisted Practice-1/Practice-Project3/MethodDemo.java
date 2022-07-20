package Demo;

public class MethodDemo {
	
	
	public void display() {
		System.out.println("In Display method");
	 }
	
	public int add(int a,int b) {
		int c=a+b;
		return c;
	}
	
	public int sub(int a,int b) {
		int c=a-b;
		return c;
	}
	
	public int mul(int a,int b) {
		int c=a*b;
		return c;
	}
	
	public int div(int a,int b) {
		int c=a/b;
		return c;
	}
	
	
	
	public static void main(String[] args) {

		MethodDemo m=new MethodDemo();
		
		m.display();
		
		int ans1= m.add(10,20);
		System.out.println("Addition is: "+ans1);
		
		int ans2= m.sub(20,10);
		System.out.println("Subtraction is: "+ans2);
		
		int ans3= m.mul(10,20);
		System.out.println("Multiplication is: "+ans3);
		
		int ans4= m.div(20,10);
		System.out.println("Division is: "+ans4);
		
		}
}
