package Training;
import java.util.*;
public class Isogram2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(isIsogram(str));

	}
	static boolean isIsogram(String str) {
		
		return str.length() == str.toLowerCase().chars().distinct().count();
	}

}
