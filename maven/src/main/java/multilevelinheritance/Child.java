package multilevelinheritance;

public class Child extends Child1{
	public void add() {
	//int a;
	//int b;
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child obj=new Child();
obj.sum();
obj.sub();
obj.add();
	}

}
