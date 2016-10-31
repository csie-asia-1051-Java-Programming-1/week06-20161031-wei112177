package ex;

/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 103021009 吳庭瑋
 */
import java.util.*;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		int a = 1, b = 1, c = 1;
		for (int i = 1; i <= m; i++) {
			a *= i;
		}
		for (int j = 1; j <= n; j++) {
			b *= j;
		}
		for (int k = 1; k <= m - n; k++) {
			c *= k;
		}
		System.out.println(a / (b * c));
	}

}
