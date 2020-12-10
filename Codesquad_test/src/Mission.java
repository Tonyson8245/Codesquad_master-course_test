import java.util.Arrays;
import java.util.Scanner;

public class Mission {
	public static void main(String[] avgs){
		String total_cmd;
		String [][] cube = {{"R","R","W"},
						    {"G","C","W"},
						    {"G","B","B"}};

		String[] div_cmd, cmd;	
		int len;
		
		preview(cube);
		
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.print("\rCUBE> ");
			total_cmd = sc.next();
			
			if(total_cmd.equals("Q")) break;	
			
			div_cmd = total_cmd.split("");
			len = div_cmd.length;

			cmd = new String[len];
						
			for(int i=len-1;i>=0;i--){
				if(div_cmd[i].equals("'")){
					cmd[i-1] = div_cmd[i-1] + div_cmd[i];
					i--;
				}
				else cmd[i] = div_cmd[i];
			}
			
			for(int i=0;i<cmd.length;i++)
			{
				if(cmd[i]!=null)
				{
					if(cmd[i].indexOf("'")>=1){ 
						switch(cmd[i].charAt(0)){
							case 'U' : move_right(cube,"U"); System.out.println("나"); break;
							case 'R' : move_down(cube,"R"); break;
							case 'L' : move_up(cube,"L"); break;
							case 'B' : move_left(cube,"B"); break;					
						}
					}
					else{ 
						switch(cmd[i].charAt(0)){
						case 'U' : move_left(cube,"U"); break;
						case 'R' : move_up(cube,"R"); break;
						case 'L' : move_down(cube,"L"); break;
						case 'B' : move_right(cube,"B"); break;					
						}
					}
				}
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
	public static String[][] move_left(String[][] cube,String line){
		int row=0,column=0;
		String temp;
		
		if(line.indexOf("U")>=0) row=0;
		else if (line.indexOf("B")>=0) row=2;
		
		temp = cube[row][0];
		for(int i=0;i<2;i++){
			cube[row][i] = cube[row][i+1];
		}
		cube[row][2] = temp;
		return cube;
	}
	public static String[][] move_up(String[][] cube,String line){
		int row=0,column=0;
		String temp;
		
		if(line.indexOf("L")>=0) column=0;
		else if (line.indexOf("R")>=0) column=2;
		
		temp = cube[0][column];
		for(int i=0;i<2;i++){
			cube[i][column] = cube[i+1][column];
		}
		cube[2][column] = temp;
		return cube;
	}
	public static String[][] move_down(String[][] cube,String line){
		int row=0,column=0;
		String temp;
		
		if(line.indexOf("L")>=0) column=0;
		else if (line.indexOf("R")>=0) column=2;
		
		temp = cube[2][column];
		for(int i=2;i>0;i--){
			cube[i][column] = cube[i-1][column];
		}
		cube[0][column] = temp;
		return cube;
	}
}

