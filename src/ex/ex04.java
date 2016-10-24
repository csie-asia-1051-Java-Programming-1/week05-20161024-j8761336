package ex;
import java.util.Scanner;
/*
 * Topic: 讓使用者輸入一正整數 n，以字元 '*' 輸出邊長為 n 的正方形 (請利用迴圈，不要直接用 printf 方式直接輸出)。
 * Date: 2016/10/24
 * Author: 105021026 周永振老師
 */

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("輸入正整數n:");
		Scanner scn =new Scanner(System.in);
		int n =scn.nextInt();
		for(int a=1;a<=n;a++){
			for(int x=n ; x>0 ; x--){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
