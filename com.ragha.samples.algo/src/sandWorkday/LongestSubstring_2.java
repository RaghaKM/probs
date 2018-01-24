package sandWorkday;
/*
 * Given a String of [a-z, A-Z, 0-9], find length of the longest substring that satisfies the following rules: 
 * a substring cannot contain digits [0-9], a substring should contain at least one capital character [A-Z]. 
 * e.g. given the String "aqW9ertyz", the longest valid substring has length 3 ("aqW").
 */
public class LongestSubstring_2 {

	public static void main(String[] args) {
		String str = "aqW9ertyzBs11ertyzBBsss";
		findLongestSubString(str);
	}

	private static void findLongestSubString(String str) {
		int r = 0;
		int maxst = -1;
		String longestSubString = "";
		boolean hasCapsLetter = false;

		while (r < str.length()){
				char temp = str.charAt(r);
				r++;
				
				if (Character.isDigit(temp)){
					
					if(maxst>=0 && hasCapsLetter){
						longestSubString = (longestSubString.length()>(r-maxst)) ? longestSubString : str.substring(maxst, r);
					}
					hasCapsLetter = false;
					maxst = -1;
				}else{
					maxst = (maxst>0) ? maxst : (r-1);
					if (Character.isUpperCase(temp))
						hasCapsLetter = true;
				}
		}
		
		if(maxst>=0){
			longestSubString = (longestSubString.length()>(r-maxst)) ? longestSubString : str.substring(maxst, r);
		}
		
		System.out.println(longestSubString);
	}
}