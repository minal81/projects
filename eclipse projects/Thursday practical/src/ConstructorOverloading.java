class BaseClass
{
	BaseClass(){};
	
}
class DerivedClass extends BaseClass
{
	//BaseClass(){construction overloading is not pssible}
	{
	
		System.out.println("Constructor of  overloading base class");
		
	}
	/*DerivedClass()
	{
		System.out.println("Constructor of derived class");
	}*/
	
}



public class ConstructorOverloading {

	public static void main(String[] args) {
		DerivedClass d1=new DerivedClass();
		

	}

}
