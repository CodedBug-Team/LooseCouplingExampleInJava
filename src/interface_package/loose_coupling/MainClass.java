package interface_package.loose_coupling;
 
public class MainClass {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		A obja=new A();
		B objb=new B();
		obja.display(objb);		//Calling display of A class with object of B class 
		
	}
}