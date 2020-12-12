
public class Mission {
	public static void main(String[] args){
		String cube[][] = new String[3][18];
		
		cube = test_init(cube);
		cube = sub_turn_D(cube,"ccw");
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
	public static String[][] test_init(String[][]cube){
		String color = "B";
		
		for(int a=0;a<3;a++){
			for(int b=0;b<18;b++){	
				if(b>14) color = "R";
				else if(b>11) color = "Y";
				else if(b>8) color = "G";
				else if(b>5) color = "O";
				else if(b>2) color = "W";
				else color = "B";
				if((a==2)&&(b==3)) color = "K";
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
	public static String[][] main_turn_cw(String[][] cube,int n){
		String temp[][] = new String[3][18];
		int k=2+n;
		for(int a=0;a<3;a++){
			for(int b=0;b<18;b++) temp[a][b] = cube[a][b];
		}
		
		for(int i=0;i<3;i++){
			for(int j=n;j<3+n;j++) cube[j-n][k-i] = temp[i][j];
		}
		return cube;
	}
	public static String[][] main_turn_ccw(String[][] cube,int n){
		String temp[][] = new String[3][18];
		int k=2+n;
		for(int a=0;a<3;a++){
			for(int b=0;b<18;b++) temp[a][b] = cube[a][b];
		}
		for(int i=0;i<3;i++){
			for(int j=n;j<3+n;j++) cube[k-j][i+n] = temp[i][j];
		}
		return cube;
	}
	public static int side_num(String side){
		int n = 0;
		switch(side){
			case "U" :n=0; break;
			case "L" :n=3; break;
			case "F" :n=6; break;
			case "R" :n=9; break;
			case "B" :n=12; break;
			case "D" :n=15; break;
		}
		return n;
	}
	public static String[][] sub_turn_U(String[][] cube,String cw){
		String temp[][] = new String[3][18];
		for(int a=0;a<3;a++) for(int b=0;b<18;b++) temp[a][b] = cube[a][b]; 
		if(cw.equals("cw")){
			for(int i=14;i>=3;i--){	
				if(i<6) cube[0][i+9] = temp[0][i];
				else cube[0][i-3] = temp[0][i];
			}
		}
		else{
			for(int i=3;i<=14;i++){	
				if(i>11) cube[0][i-9] = temp[0][i];
				else cube[0][i+3] = temp[0][i];
			}
		}
		return cube;
	}
	public static String[][] sub_turn_D(String[][] cube,String cw){
		String temp[][] = new String[3][18];
		for(int a=0;a<3;a++) for(int b=0;b<18;b++) temp[a][b] = cube[a][b]; 
		if(cw.equals("cw")){
			for(int i=14;i>=3;i--){	
				if(i<6) cube[2][i+9] = temp[2][i];
				else cube[2][i-3] = temp[2][i];
			}
		}
		else{
			for(int i=3;i<=14;i++){	
				if(i>11) cube[2][i-9] = temp[2][i];
				else cube[2][i+3] = temp[2][i];
			}
		}
		return cube;
	}
}

