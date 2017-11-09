package interface_package.loose_coupling;
 
public class A {
 
	void display(InterfaceClass obji)
	{
		obji.display();
		System.out.println(obji.getVar());
	}
}