import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}
	
	public static String convertWord(String inPut) {
		if(inPut.length() >=2 && inPut.length() <=20) {
			if (inPut.endsWith("s") ||
					inPut.endsWith("sh") ||
					inPut.endsWith("ch") ||
					inPut.endsWith("o") ||
					inPut.endsWith("x")) {
				inPut = inPut.concat("es");
			} else if (inPut.endsWith("f") || inPut.endsWith("fe")) {
				inPut = inPut.replaceAll("fe?$", "ves");
			} else if (inPut.matches(".*[^aiueo]y")) {
				inPut = inPut.replaceAll("y$", "ies");
			} else {
				inPut = inPut.concat("s");
			}
        }
		return inPut;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        if(N >=0 && N<=10) {
        	for (int i = 0; i < N; i++) {
                String inPut = scan.next();
                String outPut = convertWord(inPut);
                System.out.println(outPut);
            }
        }
	}

}
