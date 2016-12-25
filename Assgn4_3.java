public class Assgn4_3
{
	public static void main(String []args)
	{
		A a=new A(); 	//Object creation of class A
		a.test();		//Function call through object
	}
}

class C   				//Base class
{
 void test()
 {
 	System.out.println("In C");
 }
}

class B extends C     	//Derived class from C
{
 void test()
 {
	System.out.println("In B");
 }
}

class A extends B 		//Derived class from B
{
 void test()
 {
	super.test();		//Call to A's parent B
 }
}
