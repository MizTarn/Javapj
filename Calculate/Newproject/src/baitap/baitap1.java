package baitap;
import java.util.Scanner;
public class baitap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[][] a = new int[n][n];
		int s = 0;
		for(int i = 0; i <= n/2; i++) {
			for(int j = i; j < n - i; j++) {
				a[i][j] = s;
				s++;
			}
			for(int j = i + 1; j < n - i; j++) {
				a[j][n - i - 1] = s;
				s++;
			}
			for(int j = n - i - 2; j >= i; j--) {
				a[n - i - 1][j] = s;
				s++;
			}
			for(int j = n - i - 2; j > i; j--) {
				a[j][i] = s;
				s++;
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j ++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
