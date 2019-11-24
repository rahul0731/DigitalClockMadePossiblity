import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DigitalClock {

	public static void main(String[] args) {
		int a = 2,b=3,c=3,d=2;
		int total_valid_Time = digitalClock(a, b, c, d);
		System.out.println(set);  //[23:32, 23:23, 22:33]
		System.out.println(total_valid_Time);//3
		
	}  

	static int digitalClock(int a, int b, int c, int d) {
		int arr[] = new int[4];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		arr[3] = d;
		permute(arr, 0);
		return set.size();
	}

	static ArrayList<String> al = new ArrayList();
	static Set<String> set = new HashSet<String>();;

	static void permute(int[] a, int k) {
		if (k == a.length) {
			for (int i = 0; i < a.length; i++) {
				String str1 = a[0] + "" + a[1];
				String str2 = a[2] + "" + a[3];
				int hh = Integer.parseInt(str1);
				int mm = Integer.parseInt(str2);
				if (hh <= 23 && mm <= 59) {
					String s = hh + ":" + mm;
					al.add(s);
				}

			}
		} else {
			for (int i = k; i < a.length; i++) {
				int temp = a[k];
				a[k] = a[i];
				a[i] = temp;

				permute(a, k + 1);

				temp = a[k];
				a[k] = a[i];
				a[i] = temp;
			}
		}
		set.addAll(al);

	}

}
