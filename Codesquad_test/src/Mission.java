import java.util.Arrays;
import java.util.Scanner;

public class Mission {
	public static void main(String[] avgs){
		String [][] cube = {{"R","R","W"},
						    {"G","C","W"},
						    {"G","B","B"}};
		preview(cube);
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


