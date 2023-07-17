class Accounting{
	
	public double value;
	public double vatrate;
	public double expenserate;
    
	public void print() {
		System.out.println("Value of supply: "+ value);
		System.out.println("VAT: "+ getVat());
		System.out.println("Total: "+ getTotal());
		System.out.println("Expense: "+ getExpense());
		System.out.println("Income: "+ getIncome());
		System.out.println("Dividend1: " +  getDividend1() );
		System.out.println("Dividend2: " +  getDividend2() );
		System.out.println("Dividend3: " +  getDividend3()  + "\n");
	}
	
	public double getDividend1() {
		return getIncome() * 0.5;
	}
	
	public double getDividend2() {
		return getIncome() * 0.3;
	}
	
	public double getDividend3() {
		return getIncome() * 0.2;
	}

	public double getIncome() {
		return value - getExpense();
	}

	public double getExpense() {
		return value * expenserate;
	}

	public double getTotal() {
		return value + getVat();
	}

	public double getVat() {
		return value * vatrate;
	}
	
}

public class AccountingAppClass {

	public static void main(String[] args) {
	
		// a1과 a2는 new라는 키워드를 이용해 생성된 instance이다.
		Accounting a1 = new Accounting();
		a1.value = 10000.0;
		a1.vatrate = 0.1;
		a1.expenserate = 0.3;
		a1.print();
		
		Accounting a2 = new Accounting();
		a2.value = 20000.0;
		a2.vatrate = 0.2;
		a2.expenserate = 0.3;
		a2.print();
	}
	
	
}
