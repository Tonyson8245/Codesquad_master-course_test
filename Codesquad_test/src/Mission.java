import java.util.Scanner;

public class Mission {
	public static void main(String[] avgs){
		String cmd;
		String[] arr ,word;
		int len,number;
		char num;

		Scanner sc = new Scanner(System.in);
		cmd = sc.nextLine();	
		
		arr = cmd.split(" ");	
		word = String.valueOf(arr[0]).split("");
		
		len = String.valueOf(arr[0]).length();		
		number = Integer.parseInt(arr[1]);	
		
		System.out.println(len);		
		System.out.println(number);
	}
}

