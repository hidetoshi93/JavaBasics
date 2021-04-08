import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		doMenu(scan);
	}

	private static void printMenu() {
		System.out.println("次の操作を選んでください:");
		System.out.println("1. 追加");
		System.out.println("2.　削除");
		System.out.println("3. ソート");
		System.out.println("4. 出力");
		System.out.println("0. キャンセル");
	}
	
	private static void doMenu(Scanner scan) {
		boolean flag = true;
		ListPerson objListPerson = new ListPerson();
		do {
			printMenu();
			int selected = Integer.parseInt(scan.nextLine());
			switch(selected) {
			case 1:
				objListPerson.input(scan);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				objListPerson.output();
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.print("0～4の整数を選んでください");	
			}
		}while(flag);
	}
}
