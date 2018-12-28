package prob4;

public class StringUtil {

	
	public static String concatenate(String[] args) {
		
		String result = "";
		
		if(args.length == 0) {
			
			new IllegalArgumentException("인자가 비었습니다.");
		}
		
		for(String str : args) {
				result += str;
			
			
		}
		
		return result;
		
		
	}
	
}
