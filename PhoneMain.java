
public class PhoneMain {

	public static void main(String[] args) {

		// Phone 클래스 사용
		// 클래스명 객체명(변수명)= new Phone();

		Phone iPhone = new Phone(30, "2222");
//		iPhone.number = "2222";
//		iPhone.displaySize = 30;
		System.out.println(iPhone.number);
		iPhone.Camera();

		// default 생성자
		Phone galaxy = new Phone(50, "11111111");
		// galaxy.number = "11111111";
		// galaxy.displaySize = 50;

		Phone lollipop = new Phone(10, "011");
		// lollipop.number = "011";
		// lollipop.displaySize = 10;
	}
}
