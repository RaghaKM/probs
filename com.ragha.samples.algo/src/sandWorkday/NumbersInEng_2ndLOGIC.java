package sandWorkday;

import java.util.Scanner;
/*This is same as NumInEng_LeetCode.java, the logic is from leetcode, I
 *  have tried to implement the same after I understood the logic.
*/
public class NumbersInEng_2ndLOGIC {

	String[] lessThanTwenty = {"zero ","one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine ", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "ninteen", "twenty"};
	String[] tens = {"", "ten ", "twenty ", "thirty ", "forty ", "fifty ", "sixty ", "seventy ", "eighty ", "ninty "," hundred "};
	String[] thousands = {"","thousand ", "million ", "billion "};
	
	public static void main(String[] args) {

		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
//System.out.println(num);

		if(num<=0){
			System.out.println("Number is zero or negative number: zero");
			System.exit(0);
		}
		
		NumbersInEng_2ndLOGIC inEng = new NumbersInEng_2ndLOGIC();
		String number = inEng.inWords(num);
		System.out.println(number);
	}
	
	String inWords(int num){
		String finalWords;

		if(num == 0) return "";
		if(num <= 20) return lessThanTwenty[num];
		if(num < 100) return  tens[num/10] + inWords(num%10);
		if(num < 1000) return lessThanTwenty[num/100] + tens[10] + inWords(num%100);
		
		int i = 1;
		String words;
		if(num > 1000){
			while(num%1000 != 0 ){
				words = inWords(num%1000) + thousands[i]; 
			}
			
			return inWords(num/1000) + thousands[1] + inWords(num%1000);
		}
		
		if(num > 1000000) return inWords(num/1000000) + thousands[2] +inWords(num%1000000);
			
		return "";
	}
}