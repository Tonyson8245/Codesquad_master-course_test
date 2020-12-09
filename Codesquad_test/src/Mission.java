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
				System.out.println("끝");
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
}


