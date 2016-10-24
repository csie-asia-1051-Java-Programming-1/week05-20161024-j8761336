package ex;

import java.util.Random;
/*
 * Topic: 某個陣列中含有所有學生的學號，但並沒有按照大小次序排列。請寫一程式依學號大小排列並將結果輸出。
 * Date: 2016/10/24
 * Author: 105021026 周永振老師
 */

public class ex06 {

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
