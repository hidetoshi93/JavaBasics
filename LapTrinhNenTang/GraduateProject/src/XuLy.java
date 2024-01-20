import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Company company = new Company();
		company.dummyDataCompany();
		company.dummyDataPerson();
		company.salaryCalculate();
		company.assignEmployee();
		company.addPerson(scan);
		company.output();
		company.deletePerson(scan);
		company.output();
	}
}
