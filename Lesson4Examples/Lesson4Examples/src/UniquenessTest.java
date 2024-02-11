public class UniquenessTest {
	public static void main(String[] args) {
		//create array with unique values to test worst case
		int[] n = new int[26500];
		for(int i = 0; i< n.length; i++) {
			n[i] = i;
		}
		//unique 1
		// 100,000 -> 774ms
		// 50,000 -> 201ms
		// 25,000 -> 54ms
		// 26,000 -> 59ms
		// 26,500 -> 60ms -> consistently runs from 59 - 65 ms
		long start, end, elapsed;
		start = System.currentTimeMillis();
		boolean result = Uniqueness.unique1(n);
		end = System.currentTimeMillis();
		elapsed = end - start;
		System.out.println("unique1 test\n_________________");
		System.out.println("ran in " + elapsed + " ms");

		//array for unique2 test
		int[] m = new int[17000000];
		//fill m with unique values
		for(int i = 0; i < m.length; i++) {
			m[i] = i;
		}

		//unique 2
		//10,000 -> 0ms
		//100,000 -> 3ms
		//1,000,000 -> 24ms
		//10,000,000 -> 48ms
		//20,000,000 -> 65ms
		//18,000,000 -> 63ms
		//17,000,000 -> 59ms -> consistently runs from 59 - 64ms

		start = System.currentTimeMillis();
		result = Uniqueness.unique2(m);
		end = System.currentTimeMillis();
		elapsed = end - start;
		System.out.println("\nunique2 test\n_________________");
		System.out.println("ran in " + elapsed + " ms");
	}
}
