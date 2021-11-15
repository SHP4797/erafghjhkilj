package array;

public class Array {
	public static void main(String[] args) {
		int num [] [] = new int [2][2];
		num[0][0]=10;
		num[0][1]=20;
		num[1][0]=30;
		num[1][1]=40;
		
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<num.length;j++) {
				System.out.println(num [i][j]);
			}
		}
	}

}
