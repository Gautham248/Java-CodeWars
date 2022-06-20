package Training;
import java.util.*;
import java.io.*;

class CheckIsogram {
	public boolean isIsogram(String str) {
			int len=str.length();
			char arr[]=str.toCharArray();
			Arrays.sort(arr);
			for(int i=0;i<len-1;i++)
			{
				if(arr[i]==arr[i+1])
					return false;
			}
			return true;
	}
	
}
public class Isogram {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		CheckIsogram a=new CheckIsogram();
		str=str.toLowerCase();
		System.out.println(a.isIsogram(str));
		

	}

}
