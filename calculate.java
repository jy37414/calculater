import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
		double a, b, d;
		String c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수, 연산자, 수 순으로 입력하세요.");
		a = sc.nextInt();
		c = sc.next();
		b = sc.nextInt();
		
		switch(c) {
		case "+":
			d = a + b;
			System.out.println("a + b의 값은 " + d + "입니다.");
			break;
			
		case "-":
			d = a - b;
			System.out.println("a - b의 값은 " + d + "입니다.");
			break;
			
		case "*":
			d = a * b;
			System.out.println("a * b의 값은 " + d + "입니다.");
			break;
			
		case "/":
			d = a / b;
			System.out.println("a / b의 값은 " + d + "입니다.");
			break;
			
		default:
			System.out.println("해당 연산자는 존재하지 않습니다.");
		}
	}
}
