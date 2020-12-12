
public class Mission {
	public static void main(String[] avgs){
		String cube[][][] = new String[6][3][3];
		cube = init(cube);
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
	
}
