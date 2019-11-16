import java.util.*;

public class BookReading{
	public static int page(int N,Vector<Integer> M,int r) {

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
		HashMap<Integer, Integer> out = new HashMap<Integer,Integer>();
		int T = input.nextInt();
		if (T>100) {
			T=100;
		}
		for (int x = 1;x<=T;x++) {
			input.nextLine();
			int y=0;
			int N = input.nextInt();//PAGE
			int tor = input.nextInt(); //TORN
			int Q = input.nextInt(); //READER;
			
			for (int i = 0;i<tor;i++) {
				int m = input.nextInt();
				M.add(m);
			}
			
			for (int i =1;i<=Q;i++) {
				int r = input.nextInt();
				y += page(N,M,r);
			}
			input.nextLine();
			out.put(x, y);
			
			
			M.clear();
		}
		input.close();
		Set<Integer> keys = out.keySet();
		Iterator<Integer> it = keys.iterator();
		while(it.hasNext()) {
			int x = it.next();
			int y = out.get(x);
			System.out.println("Case #"+x+": "+y);
		}
		
	}

}
