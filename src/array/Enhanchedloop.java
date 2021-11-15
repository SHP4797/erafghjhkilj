package array;

public class Enhanchedloop {
public static void main(String[] args) {
	//enhancedloop
	//nestedif
	
	int num [] [] = new int[3][3];
	num[0][0]=10;
	num[0][1]=20;
	num[1][0]=30;
	num[1][1]=40;
	num[0][2]=50;
	num[1][2]=60;
	num[2][2]=70;
	num[2][1]=80;
	num[2][0]=90;
	for (int[] is : num) {
		for (int i : is) {
			System.out.println(i);
		}
	
	}
}}

