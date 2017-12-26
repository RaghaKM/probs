package sandWorkday;

public class TestPad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("-- "+255444123/1000);
	System.out.println("-- "+255444123%1000);
	  String[] thousands = {"", "Thousand", "Million", "Billion"};
	
	int i = 1;
	int num=100;
	String word;
	while(num>0){
		
		if(num%1000 != 0) {
			String second = inword(num%1000);
		}
		
		num = num/1000;
		i++;
	}
	
	}
}