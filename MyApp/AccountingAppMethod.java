public class AccountingAppMethod {
	
	public static double value;
	public static double vatrate;
	public static double expenserate;

	public static void main(String[] args) {
		
		value = 10000.0;
		vatrate = 0.1;
		expenserate = 0.3;
		
		print();
	}
	
	public static void print() {
		System.out.println("Value of supply: "+ value);
		System.out.println("VAT: "+ getVat());
		System.out.println("Total: "+ getTotal());
		System.out.println("Expense: "+ getExpense());
		System.out.println("Income: "+ getIncome());
		System.out.println("Dividend1: " +  getDividend1() );
		System.out.println("Dividend2: " +  getDividend2() );
		System.out.println("Dividend3: " +  getDividend3() );
	}
	
	public static double getDividend1() {
		return getIncome() * 0.5;
	}
	
	public static double getDividend2() {
		return getIncome() * 0.3;
	}
	
	public static double getDividend3() {
		return getIncome() * 0.2;
	}

	public static double getIncome() {
		return value - getExpense();
	}

	public static double getExpense() {
		return value * expenserate;
	}

	public static double getTotal() {
		return value + getVat();
	}

	public static double getVat() {
		return value * vatrate;
	}

}
