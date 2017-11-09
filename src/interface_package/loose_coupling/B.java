package interface_package.loose_coupling;
 
public class B implements InterfaceClass{
 
	private String var="variable Interface";
	
	public String getVar() {
		return var;
	}
 
	public void setVar(String var) {
		this.var = var;
	}
 
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display Method Called");
	}
}