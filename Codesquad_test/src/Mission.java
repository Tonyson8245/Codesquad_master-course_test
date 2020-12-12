import java.util.Arrays;
import java.util.Scanner;

public class Mission {
	public static void main(String[] avgs){
		String cube[][][] = new String[6][3][3];
		String total_cmd;
		String cmd[];
		cube = init(cube);
		view(cube); System.out.println();
		
		while(true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("\rCUBE> ");
			total_cmd = sc.next();
			
			if(total_cmd.equals("Q")) break;	
			cmd = cmd_divider(total_cmd);
			
			System.out.println(Arrays.toString(cmd));
		}
	}
	public static String[][][] init(String cube[][][]){
		for(int a=0;a<6;a++){
			switch(a){
			case 0:for(int b=0;b<3;b++) for(int c=0;c<3;c++) cube[a][b][c] = "B"; break;
			case 1:for(int b=0;b<3;b++) for(int c=0;c<3;c++) cube[a][b][c] = "W"; break;
			case 2:for(int b=0;b<3;b++) for(int c=0;c<3;c++) cube[a][b][c] = "O"; break;
			case 3:for(int b=0;b<3;b++) for(int c=0;c<3;c++) cube[a][b][c] = "G"; break;
			case 4:for(int b=0;b<3;b++) for(int c=0;c<3;c++) cube[a][b][c] = "Y"; break;
			case 5:for(int b=0;b<3;b++) for(int c=0;c<3;c++) cube[a][b][c] = "R"; break;
			}
		}
		return cube;
	}
	public static void view(String cube[][][]){
		for(int i=0;i<3;i++){
			System.out.print("               ");
			for(int j=0;j<3;j++){
				System.out.print(cube[0][i][j] + " ");
			}
			System.out.println();
		} System.out.println();
		for(int k=0;k<3;k++){
			for(int i=1;i<5;i++){
				for(int j=0;j<3;j++){
					System.out.print(cube[i][k][j] + " ");
				}System.out.print("    ");
			}System.out.println();
		} System.out.println();
		for(int i=0;i<3;i++){
			System.out.print("               ");
			for(int j=0;j<3;j++){
				System.out.print(cube[5][i][j] + " ");
			}
			System.out.println();
		}
	}
	public static String[][][] main_turn_cw(String[][][] cube,int n){
		String temp[][] = new String[3][3];
		for(int a=0;a<3;a++){
			for(int b=0;b<3;b++) temp[a][b] = cube[n][a][b];
		}
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++) cube[n][j][2-i] = temp[i][j];
		}
		return cube;
	}
	public static String[][][] main_turn_ccw(String[][][] cube,int n){
		String temp[][] = new String[3][3];
		for(int a=0;a<3;a++){
			for(int b=0;b<3;b++) temp[a][b] = cube[n][a][b];
		}
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++) cube[n][2-j][i] = temp[i][j];
		}
		return cube;
	}
	public static String[][][] sub_turn_U_cw(String [][][] cube){
		String temp[][][] = new String[6][3][3];
		for(int n=0;n<6;n++)for(int a=0;a<3;a++) for(int b=0;b<3;b++) temp[n][a][b] = cube[n][a][b];
		for(int i=0;i<6;i++){
			for(int j=0;j<3;j++){
				if(i==1) cube[4][0][j] = temp[i][0][j];
				else if(i==2) cube[1][0][j] = temp[i][0][j];
				else if(i==3) cube[2][0][j] = temp[i][0][j];
				else if(i==4) cube[3][0][j] = temp[i][0][j];
			}
		}
		return cube;
	}
	public static String[][][] sub_turn_U_ccw(String [][][] cube){
		String temp[][][] = new String[6][3][3];
		for(int n=0;n<6;n++)for(int a=0;a<3;a++) for(int b=0;b<3;b++) temp[n][a][b] = cube[n][a][b];
		for(int i=0;i<6;i++){
			for(int j=0;j<3;j++){
				if(i==1) cube[2][0][j] = temp[i][0][j];
				else if(i==2) cube[3][0][j] = temp[i][0][j];
				else if(i==3) cube[4][0][j] = temp[i][0][j];
				else if(i==4) cube[1][0][j] = temp[i][0][j];
			}
		}
		return cube;
	}
	public static String[][][] sub_turn_D_cw(String [][][] cube){
		String temp[][][] = new String[6][3][3];
		for(int n=0;n<6;n++)for(int a=0;a<3;a++) for(int b=0;b<3;b++) temp[n][a][b] = cube[n][a][b];
		for(int i=0;i<6;i++){
			for(int j=0;j<3;j++){
				if(i==1) cube[2][2][j] = temp[i][2][j];
				else if(i==2) cube[3][2][j] = temp[i][2][j];
				else if(i==3) cube[4][2][j] = temp[i][2][j];
				else if(i==4) cube[1][2][j] = temp[i][2][j];
			}
		}
		return cube;
	}
	public static String[][][] sub_turn_D_ccw(String [][][] cube){
		String temp[][][] = new String[6][3][3];
		for(int n=0;n<6;n++)for(int a=0;a<3;a++) for(int b=0;b<3;b++) temp[n][a][b] = cube[n][a][b];
		for(int i=0;i<6;i++){
			for(int j=0;j<3;j++){
				if(i==1) cube[4][2][j] = temp[i][2][j];
				else if(i==2) cube[1][2][j] = temp[i][2][j];
				else if(i==3) cube[2][2][j] = temp[i][2][j];
				else if(i==4) cube[3][2][j] = temp[i][2][j];
			}
		}
		return cube;
	}
	public static String[][][] sub_turn_L_cw(String [][][] cube){
		String temp[][][] = new String[6][3][3];
		for(int n=0;n<6;n++)for(int a=0;a<3;a++) for(int b=0;b<3;b++) temp[n][a][b] = cube[n][a][b];
		for(int i=0;i<6;i++){
			for(int j=0;j<3;j++){
				if(i==0) cube[2][j][0] = temp[i][j][0];
				else if(i==2) cube[5][j][0] = temp[i][j][0];
				else if(i==4) cube[0][2-j][0] = temp[i][j][2];
				else if(i==5) cube[4][2-j][2] = temp[i][j][0];
			}
		}
		return cube;
	}
	public static String[][][] sub_turn_L_ccw(String [][][] cube){
		String temp[][][] = new String[6][3][3];
		for(int n=0;n<6;n++)for(int a=0;a<3;a++) for(int b=0;b<3;b++) temp[n][a][b] = cube[n][a][b];
		for(int i=0;i<6;i++){
			for(int j=0;j<3;j++){
				if(i==0) cube[4][2-j][2] = temp[i][j][0];
				else if(i==2) cube[0][j][0] = temp[i][j][0];
				else if(i==4) cube[5][2-j][0] = temp[i][j][2];
				else if(i==5) cube[2][j][0] = temp[i][j][0];
			}
		}
		return cube;
	}
	public static String[][][] sub_turn_F_cw(String [][][] cube){
		String temp[][][] = new String[6][3][3];
		for(int n=0;n<6;n++)for(int a=0;a<3;a++) for(int b=0;b<3;b++) temp[n][a][b] = cube[n][a][b];
		for(int i=0;i<6;i++){
			for(int j=0;j<3;j++){
				if(i==0) cube[3][j][0] = temp[i][2][j];
				else if(i==3) cube[5][0][2-j] = temp[i][j][0];
				else if(i==5) cube[1][j][2] = temp[i][0][j];
				else if(i==1) cube[0][2][2-j] = temp[i][j][2];
			}
		}
		return cube;
	}
	public static String[][][] sub_turn_F_ccw(String [][][] cube){
		String temp[][][] = new String[6][3][3];
		for(int n=0;n<6;n++)for(int a=0;a<3;a++) for(int b=0;b<3;b++) temp[n][a][b] = cube[n][a][b];
		for(int i=0;i<6;i++){
			for(int j=0;j<3;j++){
				if(i==0) cube[1][2-j][2] = temp[i][2][j];
				else if(i==3) cube[0][2][j] = temp[i][j][0];
				else if(i==5) cube[3][2-j][0] = temp[i][0][j];
				else if(i==1) cube[5][0][j] = temp[i][j][2];
			}
		}
		return cube;
	}
	public static String[][][] sub_turn_B_cw(String [][][] cube){
		String temp[][][] = new String[6][3][3];
		for(int n=0;n<6;n++)for(int a=0;a<3;a++) for(int b=0;b<3;b++) temp[n][a][b] = cube[n][a][b];
		for(int i=0;i<6;i++){
			for(int j=0;j<3;j++){
				if(i==0) cube[1][2-j][0] = temp[i][0][j];
				else if(i==1) cube[5][2][j] = temp[i][j][0]; 
				else if(i==5) cube[3][2-j][2] = temp[i][2][j];
				else if(i==3) cube[0][0][j] = temp[i][j][2];
			}
		}
		return cube;
	}
	public static String[][][] sub_turn_B_ccw(String [][][] cube){
		String temp[][][] = new String[6][3][3];
		for(int n=0;n<6;n++)for(int a=0;a<3;a++) for(int b=0;b<3;b++) temp[n][a][b] = cube[n][a][b];
		for(int i=0;i<6;i++){
			for(int j=0;j<3;j++){
				if(i==3) cube[5][2][2-j] = temp[i][j][2];
				else if(i==5) cube[1][j][0] = temp[i][2][j];
				else if(i==1) cube[0][0][2-j] = temp[i][j][0];
				else if(i==0) cube[3][j][2] = temp[i][0][j];
			}
		}
		return cube;
	}
	public static String[][][] sub_turn_R_cw(String [][][] cube){
		String temp[][][] = new String[6][3][3];
		for(int n=0;n<6;n++)for(int a=0;a<3;a++) for(int b=0;b<3;b++) temp[n][a][b] = cube[n][a][b];
		for(int i=0;i<6;i++){
			for(int j=0;j<3;j++){
				if(i==0) cube[4][2-j][0] = temp[i][j][2];
				else if(i==4) cube[5][2-j][2] = temp[i][j][0];
				else if(i==5) cube[2][j][2] = temp[i][j][2];
				else if(i==2) cube[0][j][2] = temp[i][j][2];
			}
		}
		return cube;
	}
	public static String[][][] sub_turn_R_ccw(String [][][] cube){
		String temp[][][] = new String[6][3][3];
		for(int n=0;n<6;n++)for(int a=0;a<3;a++) for(int b=0;b<3;b++) temp[n][a][b] = cube[n][a][b];
		for(int i=0;i<6;i++){
			for(int j=0;j<3;j++){
				if(i==2) cube[5][j][0] = temp[i][j][2];
				else if(i==5) cube[4][2-j][0] = temp[i][j][2];
				else if(i==4) cube[0][2-j][2] = temp[i][j][0];
				else if(i==0) cube[2][j][2] = temp[i][j][2];
			}
		}
		return cube;
	}
	public static String[] cmd_divider(String total_cmd){
		String div_cmd[],cmd[];
		int len;
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
		return cmd;
	}
	
}
