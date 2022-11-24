import java.util.Optional;

public class OptionalClassEx {

	public static void main(String[] args) {
		
		
		
		//with Optional class(isPresent)
		String[] str=new String[10];
		Optional<String> isNull=Optional.ofNullable(str[9]);
		if(isNull.isPresent())
		{
			String str2=str[9].substring(2,5);
			System.out.println("SubString is:"+str2);
			
		}
		else
		{
			System.out.println("cannot get the substring");
		}
		
		
		str[9]="GOODMorning";
		Optional<String> isNull2=Optional.ofNullable(str[9]);
		if(isNull2.isPresent())
		{
			String str4=str[9].substring(2,5);
			System.out.println("SubString is:"+str4);
			
		}
		else
		{
			System.out.println("cannot get the substring");
		}
		
		
		
		//ifPrsent
		String[] str6=new String[10];
		Optional<String> got=Optional.of("welcome");
		Optional<String> nothing=Optional.empty();
		
		if(got.isPresent())
		{
			
			System.out.println("got value is present");
			
		}
		else
		{
			System.out.println("not present");
		}
		got.ifPresent(s -> System.out.println("it's Present"));
		nothing.ifPresent(s -> System.out.println("it's Present2"));
		

	}

}
