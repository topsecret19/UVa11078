import java.util.*;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int tests = sc.nextInt();
	while(tests-->0) {
		int students = sc.nextInt();
		int best = -1000000000;
	    int result = -1000000000;
		for(int i=0; i<students; i++) {
			int iq = sc.nextInt();
			if (best - iq > result)
		        result = best - iq;

		      if (iq > best)
		        best = iq;
		}
		System.out.println(result);
	}
}
}
