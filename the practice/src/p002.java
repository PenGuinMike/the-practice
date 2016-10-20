import java.util.*;
public class p002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		//System.out.println("請輸入字串:	");
		String str1 = scn.nextLine();
		String str2 = new StringBuilder(str1).reverse().toString();
		System.out.println(str2);
		//System.out.println("輸出為:"+str2);
	}

}
