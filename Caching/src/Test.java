import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Test {
	public static void main(String ...s){
		final Set<String> set = new HashSet<>(Arrays.asList("first","second"));
		set.add("three");
		System.out.println(set);
		//set = new HashSet<>();
	}

}
