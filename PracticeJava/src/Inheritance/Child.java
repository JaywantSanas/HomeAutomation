package Inheritance;

public class Child extends Parent {


	public void ParentMethodOne(){
		System.out.println("ChildParentMethodOne");
	}
	
	
	public void ParentMethodTwo(){
		System.out.println("ChildParentMethodTwo");
	}
	

	public void ChildMethodOne(){
		System.out.println("ChildMethodOne");
	}
	
	
	public void ChildMethodTwo(){
		System.out.println("ChildMethodTwo");
	}
	
	
	
	public static void main(String[] args) {
		
		
		Child C1=new Child();
		Parent P1 = new Parent();
		
	//	Child C2 =new Parent();
		Parent p2=new Child();
		
		p2.ParentMethodOne();
		
		
		C1.ChildMethodOne();
		P1.ParentMethodOne();
		
		C1.ParentMethodOne();
		
		
		
		
		
	}
	
	
	
	
}
