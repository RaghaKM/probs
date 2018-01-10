package sandWorkday;

import java.util.Scanner;
import java.util.Stack;

public class SandIQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	//	String input = scanner.next();
		String input = ")()()(";
		if(input==null || input.equals("")) return;
		if(input.length()==1){
			System.out.println(1);
		}else if(input.length()>1){
			System.out.println("First Prob "+balanceBrackets(input));
			System.out.println("Second Prob "+balanceBrackets2(input));
		}
	}

	public static int balanceBrackets(String inputStr){
		Stack<String> stckdBrckts = new Stack<String>();
		char[] brackets = inputStr.toCharArray();
		int count = 0;
		
		for (int i = 0; i < brackets.length; i++) {

			if(brackets[i]=='(')
				stckdBrckts.push(brackets[i]+"");
			else{ //if(brackets[i]==')')
				  if(!stckdBrckts.isEmpty() && stckdBrckts.peek().equals("("))
					  stckdBrckts.pop();
				  else
					  count++;
				}
			}
		return (stckdBrckts.size()+count);
	}
	
	public static int balanceBrackets2(String inputStr){
		char[] brackets = inputStr.toCharArray();
		int openCount = 0;
		int closeCount = 0;
		
		for (int i = 0; i < brackets.length; i++) {

			if(brackets[i]=='(')
				openCount++;
			else{
				  if(openCount>0)
					  openCount--;
				  else
					  closeCount++;
				}
			}
		return (openCount+closeCount);
	}	
	
/*	public static int balanceBracket1(String inputStr){
		//Stack<String> stckdBrckts = new Stack<String>();
		char[] brackets = inputStr.toCharArray();
		for (int i = 0; i < brackets.length; i++) {
			
			if(brackets[i]=='(')
				stckdBrckts.push(brackets[i]+"");
			else{ //if(brackets[i]==')')
				stckdBrckts.pop();
				
				}
			}
		return 0;
	}*/
	
}
