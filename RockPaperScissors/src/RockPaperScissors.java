import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("-·ê ¼³¸í-");
		System.out.println("p´Â Æ÷ÀÎÅÍ");
		System.out.println("p°¡ -3ÀÏ¶§ ºí·ç(b) ½Â!");
		System.out.println("p°¡ 3ÀÏ¶§ ·¹µå(r) ½Â!");
		System.out.print("°¡À§¹ÙÀ§º¸ °ÔÀÓ ½ÃÀÛ");
		int p;
		p = 0;
		for (;;) {
			System.out.println("Æ÷ÀÎÆ®´Â " + p);
			int r;
			r = 0;
			int b = (int) (Math.random() * 2 + 1);
			System.out.println("1.°¡À§ 2.¹ÙÀ§ 3.º¸");
			System.out.print("rÀÇ ¼±ÅÃ :");
			r = sc.nextInt();
// ========================r win=====================
			if (r == 1 && b == 3) {
				System.out.println("r ½Â!");
				p += 1;
			} else if (r == 2 && b == 1) {
				System.out.println("r ½Â!");
				p += 1;
			} else if (r == 3 && b == 2) {
				System.out.println("r ½Â!");
				p += 1;
			}
// ========================b win=====================
			else if (r == 3 && b == 1) {
				System.out.println("b ½Â!");
				p -= 1;
			} else if (r == 1 && b == 2) {
				System.out.println("b ½Â!");
				p -= 1;
			} else if (r == 2 && b == 3) {
				System.out.println("b ½Â!");
				p -= 1;
			}
// ===================================================			
			else {
				System.out.println("ºñ±è");
			}
//=========================END========================
			if (p == 3) {
				System.out.println("·¹µå ½Â!" + p);
				return;
			} else if (p == -3) {
				System.out.println("ºí·ç ½Â!" + p);
				return;
			}
		}
	}
}