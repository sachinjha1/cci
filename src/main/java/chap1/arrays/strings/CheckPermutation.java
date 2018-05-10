package chap1.arrays.strings;

/**
 * Check if the two strings have identical character counts.
 * @author s2jha
 *
 */
public class CheckPermutation {
	
	public static boolean check(String input1, String input2){
		if(input1.length()!=input2.length()){
			return false;
		}
		int[] visited = new int[128];
		
		for(char one:input1.toCharArray()){
			visited[one]++;
		}
		
		for(char two:input2.toCharArray()){
			visited[two]--;
			if(visited[two] < 0){
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		String input1 = "abcd";
		String input2 = "bcda";
		
		System.out.println(check(input1, input2));
		
		String input3 = "abgcd";
		String input4 = "bczda";
		
		System.out.println(check(input3, input4));
	}

}
