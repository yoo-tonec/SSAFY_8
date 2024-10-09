package _2024_10._2024_10_09.방승윤;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_20410_추첨상_사수_대작전_Easy {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		int Seed = Integer.parseInt(st.nextToken());
		int X1 = Integer.parseInt(st.nextToken());
		int X2 = Integer.parseInt(st.nextToken());
		
		one: for (int a = 1; a < m; a++) {
			for (int c = 1; c < m; c++) {
				if ((a * Seed + c) % m == X1 && (a * X1 + c) % m == X2) {
					System.out.printf("%d %d", a, c);
					break one;
				}
			}
		}
		
	}
	
}