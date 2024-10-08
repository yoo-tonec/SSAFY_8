package _2024_10._2024_10_04.방승윤;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10816_숫자_카드_2 {

	public static void main(String[] args) throws Exception {		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] cnt = new int[20_000_001];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < N; i++) {
			cnt[Integer.parseInt(st.nextToken()) + 10_000_000]++;
		}
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < M; i++) {
			sb.append(cnt[Integer.parseInt(st.nextToken()) + 10_000_000]).append(" ");
		}
		
		System.out.println(sb);
		
	}

}