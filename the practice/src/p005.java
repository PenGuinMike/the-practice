import java.util.*;
public class p005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		char input = scn.next().charAt(0);
		if ((int)input>0&&(int)input>64&&(int)input<91){
			System.out.print("uppercase");
		}else if ((int)input>0&&(int)input>96&&(int)input<123){
			System.out.print("lowercase");
		}else{
			System.out.println("special character");
		}
	}

}
