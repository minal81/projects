import java.util.function.IntBinaryOperator;

interface MyInterface
{
	public abstract int AddMethod(int a, int b);
}
public class FunctionalInterfaceEx {

	public static void main(String[] args) {
		MyInterface sum=(a,b) -> a+b;
		System.out.println("user defined method result: "+sum.AddMethod(12,30));
		
		
		
		//Predefined Funcation Interface
		IntBinaryOperator addition=(a,b) -> a+b;
		System.out.println("Predefine method result : "+addition.applyAsInt(12, 32));

	}

}
