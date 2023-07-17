
public class AccountingAppIf {

	public static void main(String[] args) {
		
		double value = Double.parseDouble(args[0]);
		double vatrate = 0.1;
		double vat = value * vatrate;
		double expenserate = 0.3;
		double expense = value*expenserate;
		double income = value - expense;
		
		double dividend1;
		double dividend2;
		double dividend3;
		
		if(income<10000.0) {
			dividend1 = income; // income * 1.0
			dividend2 = 0; // income * 0
			dividend3 = 0; // income * 0
		}else {
			dividend1 = income * 0.5;
			dividend2 = income * 0.3;
			dividend3 = income * 0.2;
		}
		
		System.out.println("Value of supply: "+ value);
		System.out.println("VAT: "+ vat); 
		System.out.println("Total: "+ (value + vat));
		System.out.println("Expense: "+ expense);
		System.out.println("Income: "+ income);
		System.out.println("Dividend1: " +  dividend1 );
		System.out.println("Dividend2: " +  dividend2 );
		System.out.println("Dividend3: " +  dividend3 );
	}

}
