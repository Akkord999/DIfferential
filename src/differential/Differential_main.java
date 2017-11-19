package differential;

import java.util.Scanner;

public class Differential_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	    System.out.print("Input Value of a >");
	    double a = Double.parseDouble(scan.next()) ;
	    System.out.print("Input Value of h >");
	    double h = Double.parseDouble(scan.next()) ;
	    
	    Differential_lib dlib = new Differential_lib(a,h);
	    System.out.println("f(X)=x^2x=" + a + "‚É‚¨‚¯‚é”÷•ªŒW”‚Í" + dlib.getRx());
	    System.out.println("f(X)=x^2x=" + a + "‚É‚¨‚¯‚é”’l”÷•ª‚Í" + dlib.getDx());
	    double error = Math.abs(dlib.getRx() - dlib.getDx()) / dlib.getRx() * 100;
	    System.out.println("f(X)=x^2x=" + a + "‚É‚¨‚¯‚é‘Š‘ÎŒë·‚Í" + error );
	}

}
