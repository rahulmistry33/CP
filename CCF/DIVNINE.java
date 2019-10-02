import java.util.*;
class DIVNINE {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String s = sc.next();
			long c  = 0;
			for(int i=0;i<s.length();i++)
				c+= (long)(s.charAt(i)-'0');
			if(c==c%9 && s.length()!=1)
				System.out.println(9-(c%9));
			else
				System.out.println(Math.min(c%9,(9-c%9)));
		}
	}
}
