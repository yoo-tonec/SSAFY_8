package _2024_10._2024_10_02.방승윤;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_26592_Triangle_Height {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			double area = Double.parseDouble(st.nextToken());
			double base = Double.parseDouble(st.nextToken());

			System.out.printf("The height of the triangle is %.2f units\n", 2 * area / base);
		}

	}

}