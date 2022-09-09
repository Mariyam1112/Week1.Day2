package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String test="assignment";
char[] test1=test.toCharArray();
for(int i=0;i<=test1.length-1;i++) {
	if(i%2!=0)
	{
		char output=Character.toUpperCase(test1[i]);
		System.out.print(output);
	}
	else {
		System.out.print(test1[i]);
	}
		
}
	}

}
