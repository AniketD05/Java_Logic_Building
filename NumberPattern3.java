import java.util.Scanner;

class NumberPattern3{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();

	for(int i = 1; i <= num; i++){

		for(int j = 1; j <= num-i; j++){
			System.out.print(" ");
		}

		for(int k = 1; k <= i; k++){
			System.out.print(i + " ");
		}

		 System.out.println();
		}
	sc.close();

	}

}

	/*Output--> 5
		    1 
		   2 2 
		  3 3 3 
		 4 4 4 4 
		5 5 5 5 5 
	*/