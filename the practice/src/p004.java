import java.util.Scanner;

public class p004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		System.out.print("n:");
		int n = scn.nextInt();	
		for (int i=0 ; i<=n ; i++){
			for (int j=0 ; j<=n-i ; j++){
				System.out.print(" ");
			}
				for (int k=1 ; k<=i*2-1 ; k++){
				System.out.print("*");}
				
				System.out.println();
			
		}
		for (int x=1 ; x<=n-1 ; x++){
			for (int y=0 ; y<=x ; y++){
				System.out.print(" ");
			}
				for (int z=0 ; z<=((n-x)*2)-2 ; z++){
				System.out.print("*");}System.out.println();
		}
	}

}
