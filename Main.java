import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 'p' Value");
		String p = in.nextLine();
		System.out.println("Enter 'a' Value");
		String a = in.nextLine();
		BigInteger ba, bp, v, i, r1, r2, exp1, exp2, sqrtchk;
		ba = new BigInteger(a);
		bp = new BigInteger(p);
		sqrtchk = ba.modPow((bp.subtract(new BigInteger("1"))).divide(new BigInteger("2")), bp);
		
		if(sqrtchk.equals(new BigInteger("1"))) { //Check if square root exists
			
		//CONGRUENT TO 4 MOD 3
		if(Integer.parseInt(p)%4 == 3) {
			
			exp1 = (bp.add(new BigInteger("1"))).divide(new BigInteger("4")); // Computing exponent value for r1
			r1 = ba.modPow(exp1, bp); // 1st root
			r2 = bp.subtract(r1); // 2nd root
			
			System.out.println("Congruent to 3 mod 4. Roots are : "+r1+", "+r2);
			
		}
		//CONGRUENT TO 5 MOD 8
			else if(Integer.parseInt(p)%8 == 5) {
			
			exp2 = (bp.subtract(new BigInteger("5"))).divide(new BigInteger("8")); // Computing exponent value for v
			v = (ba.multiply(new BigInteger("2"))).modPow(exp2, bp); // Computing v
			i = (ba.multiply(new BigInteger("2")).multiply(v).multiply(v)).mod(bp); // Computing i
			r1 = (ba.multiply(v).multiply(i.subtract(new BigInteger("1")))).mod(bp); // 1st root
			r2 = bp.subtract(r1); // 2nd root
			
			System.out.println("Congruent to 5 mod 8. Roots are : "+r1+" "+r2);
		}
	
		}
}
}