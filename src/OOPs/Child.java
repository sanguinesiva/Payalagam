package OOPs;


public class Child extends Parent{
	public static void main(String[] args) {
		
		Child child = new Child();
	
		child.raise();
		child.study();
		child.watch();
		child.work();
		Parent parentobj= new Child();
		System.out.println(parentobj instanceof Child);
		parentobj.savings();
		parentobj.raise();// parent menthod
		parentobj.study();// parent method
		parentobj.watch();// parent method
		//parentobj.work(); child method cannot be accessed by parent. this is called dynamic binding. 
		
		// method overtiding is also called as runtime polimorphism.
	}
	public void study()	
	{
		System.out.println("higher study");
	}
	public void watch()
	{
		System.out.println("cartoon show");
	}
	public void work() {
		System.out.println("IT profession ");
	}

}
