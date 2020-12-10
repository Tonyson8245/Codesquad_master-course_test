
public class Mission {
	public static void main(String[] args){
		String cube[][] = new String[3][18];
		
		cube = init(cube);
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

}
