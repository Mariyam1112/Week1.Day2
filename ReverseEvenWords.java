package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {

		String test="Hello welcome to a new era";
		
		String str[]=test.split(" ");
	 
		for(int i=0;i<str.length;i++) {
			if(i%2!=0) {
			
			char[] ch=str[i].toCharArray();
			
			for(int j=ch.length-1;j>=0;j--) {
				
				System.out.print(ch[j]);
			
					}
			}
			
			else {
				
				System.out.print(" "+str[i]+" ");
			}
			
		}
	
	}
}

	


