import java.util.Scanner;

class NumberPattern2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++){
			for(int j = num; j >= i; j--){
				
				System.out.print( j + " ");
				
				
			}
		System.out.println();
		}
		
		sc.close();
	}

}
/*
Output--->

5
5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5 
*/