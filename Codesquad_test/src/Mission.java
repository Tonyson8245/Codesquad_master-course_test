import java.util.Arrays;
import java.util.Scanner;

public class Mission {
	public static void main(String[] avgs){
		String cmd;
		String[] arr,word;
		int len,number,flag = 0;
		char num;

		Scanner sc = new Scanner(System.in);
		cmd = sc.nextLine();	
		
		arr = cmd.split(" ");	
		word = String.valueOf(arr[0]).split("");
		
		len = String.valueOf(arr[0]).length();		
		number = Integer.parseInt(arr[1]);	
		
		if(number < 0){
			if((arr[2].equals("L")||arr[2].equals("l"))) arr[2] = "R";
			else arr[2] = "L";
		}
		
		move(word,arr,Math.abs(number),len);
	}
	
	public static String[] move(String[] word, String[] arr, int number,int len)
	{
		String temp;
		
		if((arr[2].equals("L")||arr[2].equals("l"))){
			for(int i=0;i<number;i++){
				temp = word[0];
					for(int j=0;j<=len-2;j++){
						word[j] = word[j+1];
					}
				word[len-1] = temp;
			}
		}
		else if((arr[2].equals("R")||arr[2].equals("r"))){
			for(int i=0;i<number;i++){
				temp = word[len-1];
					for(int j=len-1;j>=1;j--){
						word[j] = word[j-1];
					}
				word[0] = temp;
			}
		}
		return word;
	}
}


