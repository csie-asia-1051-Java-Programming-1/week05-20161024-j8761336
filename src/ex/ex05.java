package ex;
import java.util.Random;
import java.util.Scanner;
/*
 * Topic: 設計一個程式由 0~9 的亂數隨機產生一 10*10 的二維陣列，將行列互換輸出(即輸出轉置矩陣)
 * Date: 2016/10/24
 * Author: 105021026 周永振老師
 */

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int[][] n = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				n[i][j] = r.nextInt(9);

			}

		}
		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 10; i++) {
				System.out.print(n[i][j]);
			}
			System.out.println();
		}

	}
}