import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("-룰 설명-");
		System.out.println("p는 포인터");
		System.out.println("p가 -3일때 블루(b) 승!");
		System.out.println("p가 3일때 레드(r) 승!");
		System.out.print("가위바위보 게임 시작");
		int p;
		p = 0;
		for (;;) {
			System.out.println("포인트는 " + p);
			int r;
			r = 0;
			int b;
			b = 0;

			System.out.println("1.가위 2.바위 3.보");
			System.out.print("r의 선택 :");
			r = sc.nextInt();
			System.out.print("b의 선택 :");
			b = sc.nextInt();
// ========================r win=====================
			if (r == 1 && b == 3) {
				System.out.println("r 승!");
				p += 1;
			} else if (r == 2 && b == 1) {
				System.out.println("r 승!");
				p += 1;
			} else if (r == 3 && b == 2) {
				System.out.println("r 승!");
				p += 1;
			}
// ========================b win=====================
			else if (r == 3 && b == 1) {
				System.out.println("b 승!");
				p -= 1;
			} else if (r == 1 && b == 2) {
				System.out.println("b 승!");
				p -= 1;
			} else if (r == 2 && b == 3) {
				System.out.println("b 승!");
				p -= 1;
			}
// ===================================================			
			else {
				System.out.println("비김");
			}
//=========================END========================
			if (p == 3) {
				System.out.println("레드 승!" + p);
				return;
			} else if (p == -3) {
				System.out.println("블루 승!" + p);
				return;
			}
		}
	}
}