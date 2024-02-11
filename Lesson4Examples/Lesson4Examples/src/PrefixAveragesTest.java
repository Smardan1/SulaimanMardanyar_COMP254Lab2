public class PrefixAveragesTest {
	public static void main(String[] args) {

		//prefixAverage1 looks to be f(n^2) -> O(n^2)
		//prefixAverage1 looks to be f(n) -> O(n)

		System.out.println("prefixAverage1 Test\n______________________");
		//arrays to be used as input for algorithms
		double[] x = new double[1000]; //thousand
		double[] y = new double[10000]; //ten thousand
		double[] z = new double[100000]; //hundred thousand

		long start, end, elapsed;

		//test x
		start = System.nanoTime();
		double[] result = PrefixAverage.prefixAverage1(x);
		end = System.nanoTime();
		elapsed = end - start;
		System.out.printf("x took %d nanoseconds", elapsed);
		System.out.println();

		//test y
		start = System.nanoTime();
		result = PrefixAverage.prefixAverage1(y);
		end = System.nanoTime();
		elapsed = end - start;
		System.out.printf("y took %d nanoseconds", elapsed);
		System.out.println();

		//test Z
		start = System.nanoTime();
		result = PrefixAverage.prefixAverage1(z);
		end = System.nanoTime();
		elapsed = end - start;
		System.out.printf("z took %d nanoseconds", elapsed);
		System.out.println();

		System.out.println("\nprefixAverage2 Test\n______________________");
		//test x
		start = System.nanoTime();
		result = PrefixAverage.prefixAverage2(x);
		end = System.nanoTime();
		elapsed = end - start;
		System.out.printf("x took %d nanoseconds", elapsed);
		System.out.println();

		//test y
		start = System.nanoTime();
		result = PrefixAverage.prefixAverage2(y);
		end = System.nanoTime();
		elapsed = end - start;
		System.out.printf("y took %d nanoseconds", elapsed);
		System.out.println();

		start = System.nanoTime();
		result = PrefixAverage.prefixAverage2(z);
		end = System.nanoTime();
		elapsed = end - start;
		System.out.printf("z took %d nanoseconds", elapsed);
		System.out.println();
	}
}
