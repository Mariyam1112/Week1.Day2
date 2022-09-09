package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]= {3,5,7,9,11};
		int array2[]= {1,2,3,4,5};
		for(int i=0;i<=array1.length-1;i++)
		{
			for(int j=0;j<=array2.length-1;j++) {
				if(array1[i]==array2[j])
				{
					System.out.println(array1[i]);
				}
					
			}
		}

	}

}
