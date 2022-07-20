package Demo;

public class TypeConversion {
	public static void main(String[] args) {

	// Implicit conversion or Narrowing
	
	System.out.println("**********************************");
	
	System.out.println("Implicit Conversion");
	
	char c = 'F';
	System.out.println("Value of Char: " +c);
	
	int a = c;
	System.out.println("Value of a: "+a);
	
	float b = c;
	System.out.println("Value of b: "+b);
	
	long d = c;
	System.out.println("Value of d: "+d);
	
	double e = c;
	System.out.println("Value of e: "+e);


	System.out.println("**********************************");
	
	// Explicit Conversion or Widening
	
	double k = 100.73;
	
	long l = (long)k;
	
	int i = (int)l;
	
	System.out.println("Explicit Conversion");
	
	System.out.println("double value: " + k);
	
	System.out.println("Long value: " + l);
	
	System.out.println("Int value: " + i);
	
}
	
}
