package sandWorkday;
/*
 * Given a String of [a-z, A-Z, 0-9], find length of the longest substring that satisfies the following rules: 
 * a substring cannot contain digits [0-9], a substring should contain at least one capital character [A-Z]. 
 * e.g. given the String "aqW9ertyz", the longest valid substring has length 3 ("aqW").
 */
public class LongestSubstring {

	public static void main(String[] args) {
		String str = "aqW9ertyzBs11ertyzBBsss";
		findLongestSubString(str);
	}

	private static void findLongestSubString(String str) {
		int l = 0;
		int r = 0;
		int maxst = -1;
		int maxend = -1;
		int maxlen = Integer.MIN_VALUE;
		int capLetter = 0;

		while (true) {
			while (r < str.length()) {
				char temp = str.charAt(r);
				r++;
				if (Character.isUpperCase(temp))
					capLetter++;

				if (Character.isDigit(temp) || capLetter > 1) {
					break;
				}
			}
			if (r - l > maxlen && capLetter == 1) {
				maxst = l;
				if (r == str.length() && !Character.isDigit(str.charAt(r-1)))
					maxend = r + 1;
				else
					maxend = r;
				
				l = r;
				capLetter = 0;
			}
			if (r >= str.length())
				break;
		}
		System.out.println(str.substring(maxst, maxend-1));

	}

}
