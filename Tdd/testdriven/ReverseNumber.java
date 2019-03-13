package testdriven;

public class ReverseNumber {
	int reverse(int num) {
		int reverse = 0, reminder;
		while (num > 0) {
			reminder = num % 10;
			reverse = reminder + (reverse * 10);
			num = num / 10;
		}
		return reverse;
	}
}
