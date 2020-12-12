
public class Mission {
	public static void main(String[] avgs){
		String cube[][][] = new String[6][3][3];
		cube = init(cube);
		cube[1][0][0] = "K";
		
		cube = sub_turn_U_ccw(cube);


		view(cube);
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
}
