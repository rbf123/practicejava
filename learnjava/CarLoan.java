/* This program is a simple car loan payment calculator. It will compute the total monthly payment amount for you. You will need to input the following information: Car loan amount, interest rate of the loan, length of the loan in years, down payment. */

public class CarLoan {
	public static void main(String[] args) {

    int carLoan = 10000;
    int loanLength = 3;
    int interestRate = 5;
    int downPayment = 2000;

    if (loanLength <= 0 || interestRate <= 0){
      System.out.println("Error! You must take out a valid car loan");
    } else if (downPayment >= carLoan) {
      System.out.println("The car can be paid in full.");
    } else {
      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance / months;
      int interest = (monthlyBalance * interestRate) / 100;
      int monthlyPayment = monthlyBalance + interest;

      System.out.println(monthlyPayment);
    }

	}
}

//In this sample, the answer is 233 for the monthly payment amount on the car loan.
