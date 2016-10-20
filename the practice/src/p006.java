import java.util.*;
public class p006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		char x = scn.next().charAt(0);
		int y = (int)x;
		if (y>0&&y>96&&y<123){
			System.out.println((char)(x-32));
		}else if (y>0&&y>64&&y<91){
			System.out.println((char)(x+32));
		}
	}

}
