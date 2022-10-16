package IPT2;

public class Bank_Details extends Bank {

	@Override
	public void personal_Loan() {

		System.out.println("8%");
	}

	public static void main(String[] args) {
		Bank_Details bd = new Bank_Details();
		bd.personal_Loan();
		bd.eductaion_Loan();
		bd.home_Loan();
	}
}
