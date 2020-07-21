
public abstract class Animal {
String name;
abstract String voice() ;
}
class Dog extends Animal{
	String voice() {
		return"bow bow";
	}
}class Cat extends Animal{
	String voice() {
		return"meow";
	}
public void eat() {
	System.out.println("cats eat");
}
}
