
public class Mission {
	public static void main(String[] args){
		String cube[][] = new String[3][18];
		
		cube = init(cube);
		preview(cube);
	}
	public static String[][] init(String[][]cube){
		String color = "B";
		for(int a=0;a<3;a++){
			for(int b=0;b<18;b++){
				if(b>14) color = "R";
				else if(b>11) color = "Y";
				else if(b>8) color = "G";
				else if(b>5) color = "O";
				else if(b>2) color = "W";
				else color = "B";
				cube[a][b] = color;
			}
		}
		return cube;
	}
	public static void preview(String[][] cube){
		for(int i=0;i<3;i++){
			System.out.print("            ");
			for(int j=0;j<3;j++){
				System.out.print(cube[i][j] + " ");
			}	
			System.out.println();
		}
		for(int i=0;i<3;i++)		{
			for(int j=3;j<15;j++){
				System.out.print(cube[i][j] + " ");
				if(j%3==2) System.out.print("  ");
			}	
			System.out.println();
		}
		for(int i=0;i<3;i++){
			System.out.print("            ");
			for(int j=15;j<18;j++){
				System.out.print(cube[i][j] + " ");
			}	
			System.out.println();
		}
	}
}
