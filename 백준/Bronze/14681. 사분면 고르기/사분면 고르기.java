import java.util.Scanner;

public class Main {
	
	public static void whichQuadrant(int x, int y) {
		if(x>0 && y>0) System.out.println("1");
		if(x<0 && y>0) System.out.println("2");
		if(x<0 && y<0) System.out.println("3");
		if(x>0 && y<0) System.out.println("4");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		whichQuadrant(x,y);
	}

}
