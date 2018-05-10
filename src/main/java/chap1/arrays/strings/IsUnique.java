package chap1.arrays.strings;

/**
 * Is Unique: Implement an algorithm to determine if a string has all unique characters. 
 * What if you cannot use additional data structures?
 * @author s2jha
 */
public class IsUnique {

	public static boolean check(String input){
		boolean[] visited = new boolean[256];//ascii is 8 bit
		
		if(input.length()>128){
			//you cannt form 300 character long using 128 unique ASCII characters without repeating
			return false;
		}
		for(char c:input.toCharArray()){
			if(visited[c]){
				return false;
			}else{
				visited[c]=true;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String input1 = "abcae";
		System.out.println(check(input1));
		String input2 = "abcde";
		System.out.println(check(input2));
	}

}
