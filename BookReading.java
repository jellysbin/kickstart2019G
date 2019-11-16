package tested;

import java.util.*;

public class BookReading {
	static int page(int N,Vector M,int r) {

		int p =r;
		int y =0;
			for(p=r;p<=N;p=p+r) {
				if (M.contains(p)) {
					continue;
				}
				else 
					y++;
			}
		return y;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Vector<Integer> M = new Vector<Integer>();
		
		int T = input.nextInt();
		if (T>100) {
			T=100;
		}
		for (int x = 1;x<=T;x++) {
			input.nextLine();
			int y=0;
			int N = input.nextInt();//페이지수
			int tor = input.nextInt(); //찟긴수
			int Q = input.nextInt(); //독자수
			
			for (int i = 0;i<tor;i++) {
				int m = input.nextInt();
				M.add(m);
			}
			
			for (int i =1;i<=Q;i++) {
				int r = input.nextInt();
				y += page(N,M,r);
			}
			System.out.println("Case #"+x+":"+y);
			M.clear();
		}
		
	}

}
