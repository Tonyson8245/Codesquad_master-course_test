
public class Mission {
	public static void main(String[] avgs){
		String cube[][][] = new String[6][3][3];
		cube = init(cube);
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
	
}
