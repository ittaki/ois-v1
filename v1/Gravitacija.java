import java.util.*;

public class Gravitacija {


    public static void izpis(double visina, double pospesek) {
        System.out.println(visina + " " + pospesek);
    }

	public static final double C = 6.674 * 0.00000000001;
	public static final double M = 5.972 * 1000000000000000000000000.0;
	public static final double r = 6.371 * 1000000;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();

		izpis(a,formula(a));



        //System.out.println("OIS je zakon!");
		
	}
	public static double formula(double nadmorska) {
		double a = (C * M) / ((r + nadmorska) * (r + nadmorska));
		return a;
	}
}

