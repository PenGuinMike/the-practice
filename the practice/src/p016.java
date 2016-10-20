import java.util.*;
public class p016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		char x = scn.next().charAt(0);
		if ((int)x>96&&(int)x<123){
			System.out.println("lowercase");
		}else if ((int)x>64&&(int)x<91){
			System.out.println("capital");
		}else{
			System.out.println("special");
		}
	}

}
