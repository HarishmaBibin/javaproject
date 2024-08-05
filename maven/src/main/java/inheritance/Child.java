package inheritance;

public class Child extends SingleInheritanceParent{
	public void add() {
	int a=5;
	int b=6;
	System.out.println(a+b);
	}
	public static void main(String[] args) {
	Child obj=new Child();
		obj.add();
		obj.sum();

	}

}
