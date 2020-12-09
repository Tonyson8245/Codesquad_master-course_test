import java.util.Arrays;
import java.util.Scanner;

public class Mission {
	public static void main(String[] avgs){
		String cmd;
		String [][] cube = {{"R","R","W"},
						    {"G","C","W"},
						    {"G","B","B"}};
		while(true){
			Scanner sc = new Scanner(System.in);
			preview(cube);
			System.out.print("\rCUBE> ");
			cmd = sc.next();
			
			if(cmd.indexOf("Q")>=0){
				break;
			}
		}
	}
	public static void preview(String[][] cube){
		for (int i = 0; i < cube.length; i++) {
			for (int j = 0; j < cube[i].length; j++) {
				System.out.print(cube[i][j] + " "); 
			}
			System.out.println();
		}
	}
	public static String[][] move_right(String[][] cube,String line){
		int row=0,column=0;
		String temp;
		
		if(line.indexOf("U")>=0) row=0;
		else if (line.indexOf("B")>=0) row=2;
		
		temp = cube[row][2];
		for(int i=2;i>0;i--){
			cube[row][i] = cube[row][i-1];
		}
		cube[row][0] = temp;
		return cube;
	}
	
}


