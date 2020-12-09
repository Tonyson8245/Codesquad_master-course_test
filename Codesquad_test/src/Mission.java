import java.util.Scanner;

public class Mission {
	public static void main(String[] avgs){
		String cmd;
		String[] arr;
		String[] word;
		
		Scanner sc = new Scanner(System.in);
		cmd = sc.nextLine();	
		
		arr = cmd.split(" ");	
		word = String.valueOf(arr[0]).split("");
	}
}

