abstract class Car{
	abstract void run();
}

class Oops extends Car{

	//Compile Time Polymorphism
	int add(int a,int b){
		return a+b;
	}

	String add(int a,int b){
		return "";
	}

	//Compile Time Polymorphism
	int add(int a,int b,int c){
		return a+b+c;
	}

	//Compile Time Polymorphism
	int add(double a,int b){
		return (int)a+b;
	}

	//Compile Time Polymorphism
	int add(int a,double b){
		return a+(int)b;
	}

	//Abstract Override //Run Time Polymorphism
	void run(){
		System.out.println("Example for Abstract and Run time Polymorphism");
	}

	public static void main(String[] args){
		Car oops=new Oops();
		oops.run();

		Oops compileTimePolymorphism=new Oops();

		System.out.println("Compile Time Polymorphism Example :"+compileTimePolymorphism.add(1,2));
		System.out.println("Compile Time Polymorphism Example :"+compileTimePolymorphism.add(1,2,3));
		System.out.println("Compile Time Polymorphism Example :"+compileTimePolymorphism.add(1,2.0));
		System.out.println("Compile Time Polymorphism Example :"+compileTimePolymorphism.add(1.0,1));

	}
}