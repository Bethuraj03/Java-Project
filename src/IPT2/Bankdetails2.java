package IPT2;

public class Bankdetails2 implements BankIn {

	@Override
	public void homeLoan() {
		System.out.println("5%");
	}

	@Override
	public void eductaionLoad() {
		System.out.println("5%");
	}

	@Override
	public void personalLoan() {
		System.out.println("7%");

	}

	public static void main(String[] args) {
		Bankdetails2 Bd = new Bankdetails2();
		Bd.eductaionLoad();
		Bd.homeLoan();
		Bd.personalLoan();

	}
}
