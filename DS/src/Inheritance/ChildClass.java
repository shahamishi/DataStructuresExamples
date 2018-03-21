package Inheritance;

public class ChildClass extends ParentClass{

	int i;
	public void methodB(){
		System.out.println("ChildClass");
	}
	
	public void methodA(){
		System.out.println("MethodA ChildClass");
	}
	
	public void parentMethod(ChildClass G){
		
		System.out.println("Child");
	}
	
	public void parentMethod(ParentClass G){
		
		System.out.println("Child");
	}
	public static void main(String[] args) throws Exception {
		GrandParentClass childClass = new ChildClass();
		childClass.methodA();
		//childClass.methodB(); Compile time error as it is not visible to GrandParentClass.
		
		childClass.parentMethod(new GrandParentClass());
		childClass.parentMethod(new ChildClass());
		
		ChildClass child = new ChildClass();
		child.parentMethod(new ParentClass());
		
		/*ParentClass p = new ChildClass();
		p.eat();*/
		
	/*	ParentClass c = new ChildClass();
		c.interfaceMethod();*/
		
		//ChildClass c1=  new 
		
	}
	
	public void eat() {
		System.out.println("Child EAT");
	}
	
	public void interfaceMethod(){
		System.out.println("Inside Child Interface Method");
	}
	
	public static void staticMethod() {
		System.out.println("Chlid Static Method");
	}
	
	/*@Override
	public boolean equals(Object arg0) {
		if(arg0 instanceof ChildClass){
			if(((ChildClass)arg0).i ==  this.i){
				return true;
			}
		}
		return false;
	}*/
	
	@Override
	public int hashCode() {
		return this.i;
	}
}
