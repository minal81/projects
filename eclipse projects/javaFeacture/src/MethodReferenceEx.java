import java.util.Arrays;

interface InterfaceEx
{
	public void display();
}




public class MethodReferenceEx {
	//type 1 MR to an instance Method of an object
	public void MyMethod()
	{
		System.out.println("MR using instance method ");
	}

	public static void main(String[] args) {
		MethodReferenceEx n=new MethodReferenceEx();
		InterfaceEx red=n::MyMethod;
		red.display();
		
		
		
		
		//Type 3:MR to an instance method of a class
		// Class::instanceMethod
		String[] arr= {"Ashish","manish","Kesaba"};
		Arrays.sort(arr,String::compareToIgnoreCase);
		for(String a:arr)
		{
		System.out.println(a);
		}

	}

}
