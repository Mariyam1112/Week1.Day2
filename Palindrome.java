package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="malayalam";
String rev="";
char[] name1=name.toCharArray();

for(int i=name1.length-1;i>=0;i--)
{
	rev=rev+name.charAt(i);
}
	if(name.equals(rev))
	{
		System.out.println(name + " is a Palindrome");
		
	}
	else 

		System.out.println(name + " is not a Palindrome");

}
	}


