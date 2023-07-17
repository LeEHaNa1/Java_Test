
public class AccountingApp {

	public static void main(String[] args) {
		
		double value = Double.parseDouble(args[0]); // args｢｣는 string 타입이기 때문에 double로 바꿔준다.
		double vatrate = 0.1;
		double vat = value * vatrate;
		double expenserate = 0.3;
		double expense = value*expenserate;
		double income = value - expense;
		double dividend1 = income * 0.5;
		double dividend2 = income * 0.3;
		double dividend3 = income * 0.2;
		
		System.out.println("Value of supply: "+ value);
		System.out.println("VAT: "+ vat); //VAT는 가격의 10%
		System.out.println("Total: "+ (value + vat));
		System.out.println("Expense: "+ expense);
		System.out.println("Income: "+ income);
		System.out.println("Dividend1: " +  dividend1 );
		System.out.println("Dividend2: " +  dividend2 );
		System.out.println("Dividend3: " +  dividend3 );
	}

}
