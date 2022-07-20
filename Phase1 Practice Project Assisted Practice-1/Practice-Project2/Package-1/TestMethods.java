package JavaFSD;

public class TestMethods {
	
	//accessing Access modifier methods in different class with same package name
		public static void main(String [] args) {
			
			AccessModifier obj= new  AccessModifier();
			
			obj.methodDefault();
			//obj.methodPrivate(); private method we can't access out side of class, its scope is within the class
			obj.methodProtected();
			obj.methodPublic();
		}

}
