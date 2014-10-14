package ps4;

/**
 *
 * @author Ikusa
 */
public class Calculation {
	
	public static double calc(double investAmt, int years, double interestRate) {
		
            double sum = investAmt;
		for (int i = 0; i < years; i++) {
			double add = sum*interestRate;
			sum += add;
		}
		
		return sum;
	}
	
}
