abstract class Car{
	abstract void run();
}

public class AbstractTest extends Car{
    //Abstract Override //Run Time Polymorphism
	void run(){
		System.out.println("Example for Abstract and Run time Polymorphism");
	}
    public static void main(String[] args){
		Car abstractTest=new AbstractTest();
		abstractTest.run();
	}
}
