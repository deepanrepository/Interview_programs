import java.util.HashMap;
import java.util.Map;

public class RemoveSpace {
	public static void main(String[] args) {
		System.out.println(removeWhiteSpace("deepan aishwarya"));
		
		
	}
	public static String removeWhiteSpace(String input) {
		StringBuilder output=new StringBuilder();
//input="deepan aishwarya";
char[] charArray = input.toCharArray();
for (char c : charArray) {
	if (!Character.isWhitespace(c))
		output.append(c);
	
	
	
}
return output.toString();

	}


}