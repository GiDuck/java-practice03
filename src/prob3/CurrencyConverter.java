package prob3;

public class CurrencyConverter {

	private static double rate;

	public static double toDollar(double won) {
		// 한국 원화를 달러로 변환
		
		return (won/1000 + won % 1000) / rate;
	}

	public static double toKRW(double dollar) {
		return  dollar * rate * 1000;
	}

	public static void setRate(double r) {
		rate = 1.116;
	}

}
