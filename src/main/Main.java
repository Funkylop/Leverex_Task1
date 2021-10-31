package main;
import static org.junit.Assert.*;
class Main{

	public static void execute(SomeInterface someInterface){
		someInterface.someMethod();
	}

	public static void main(String[] args){
  	
		System.out.println("Hello world");
	
		SomeInterface anonymousClass = new SomeInterface() {
			@Override
			public void someMethod() {
				System.out.println("Anonymous class");
			}
		};
		
		execute(() -> System.out.println("Lambda"));

		anonymousClass.someMethod();
/*		
		Main main = new Main();
		Main.InnerClass innerClass = main.new InnerClass();
		innerClass.getInfo();
				
		main.printLocalClass();		
	}

	public class InnerClass {
  		public void getInfo(){
			System.out.println("Inner Class!");
        	}
	}
	
	public void printLocalClass(){
		class Local {
			String name = "Local";
			void printLocal(){
				System.out.println(name);
			}	
		}
		Local local = new Local;
		local.printLocal();
*/	}

	public interface SomeInterface {
		public void someMethod();
	}
}