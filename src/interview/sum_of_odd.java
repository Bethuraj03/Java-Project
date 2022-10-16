package interview;

import java.util.Iterator;

public class sum_of_odd {

	
	public static void main(String[] args) {
		
		int count = 0;
		for (int i = 0; i < 100; i++) {
			if (i%2 ==0) {
				System.out.println(count);
			}
		}
	}
}