package section07;

/*
 * 상수
 * 	처음 값이 할당되면 그 값을 변경할 수 없다.
 * 	final 키워드 사용
 * 	통상적으로 보통 대문자로 선언한다.
 * 
 */

public class Constant {
	static final double PI = 3.14159;
	
	public static void main(String[] args) {
		// 원의 반지름
		int r = 10;
		
//		PI = 3.141592;	// 상수라서 변경불가
		double area = getArea(r);
		System.out.println("원의 넓이: " + area);
		
	}
	
	
	public static double getArea(int r) {	// int r = 10;
		// 원의 넓이
		double area = Math.PI * Math.pow(r, 2);
		
		return area;
		
	}
	
	
}








