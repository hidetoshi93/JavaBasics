import java.util.Scanner;

public class XuLy {


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char array[] = new char[str.length()];
		for(int i=0; i<str.length();i++) {
			array[i] = str.charAt(i);
			if(array[i] == 'A') {
				array[i] = '4';
			}
			else if(array[i] == 'E') {
				array[i] = '3';
			}
			else if(array[i] == 'G') {
				array[i] = '6' ;
			}
			else if(array[i] == 'I') {
				array[i] = '1';
			}
			else if(array[i] == 'O') {
				array[i] = '0';
			}
			else if(array[i] == 'S') {
				array[i] = '5';
			}
			else if(array[i] == 'Z') {
				array[i] = '2';
			}
			
			System.out.print(array);
		}
		
	}
}
