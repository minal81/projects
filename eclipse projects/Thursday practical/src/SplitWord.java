
import java.util.Scanner;

public class SplitWord 
{

	public static void main(String[] args) 
	{

	 
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the String:");
		        String str = sc.nextLine();
		        
		        
		        //sentence split into words
		        String arr[] = str.split("\\s+");
		        
		        
		        for (int i = 0; i < arr.length-1; i++) {
		            int outer = arr[i].length();
		            for (int j = i + 1; j < arr.length; j++) {
		                int inner = arr[j].length();
		                if (outer > inner || outer == inner && arr[i].compareTo(arr[j]) > 0) {
		                    String temp = arr[i];
		                    arr[i] = arr[j];
		                    arr[j] = temp;
		                    outer = inner; // after swap length of outer  is change 
		                }
		            }
		        }
		        
		       
		        for (String word : arr) 
		        {
		          System.out.println(word);
		        }
		   
	}

}
