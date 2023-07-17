
public class AccountingAppArrayLoop {

	public static void main(String[] args) {
		
		double value = Double.parseDouble(args[0]);
		double vatrate = 0.1;
		double vat = value * vatrate;
		double expenserate = 0.3;
		double expense = value*expenserate;
		double income = value - expense;
		
		double[] dividendRates = new double[3];
		double[] dividend = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		System.out.println("Value of supply: "+ value);
		System.out.println("VAT: "+ vat); 
		System.out.println("Total: "+ (value + vat));
		System.out.println("Expense: "+ expense);
		System.out.println("Income: "+ income);
		
		for(int i =0; i< dividendRates.length; i++)
		{
			dividend[i] = income * dividendRates[i];
			System.out.println("Dividend"+(i+1)+": "+ dividend[i]);
		}
	}

}
