public class Solution {
	public double myPow(double x, int n) {
		// x^-n 等于 1 / x^n
		if (n < 0) {
			return 1.0 / pow(x, -n);
		}
		return pow(x, n);
	}

	public double pow(double x, int n) {
		if (n == 0) {
			return 1.0;
		}
		if (n == 1) {
			return x;
		}
		double res = pow(x, n/2);
		if (n % 2 == 0) {
			return res * res;
		}
		return x * res * res;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.myPow(2, 8));
		System.out.println("_");
	}
}
