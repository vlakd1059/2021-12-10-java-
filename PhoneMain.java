
public class PhoneMain {

	public static void main(String[] args) {

		// Phone Ŭ���� ���
		// Ŭ������ ��ü��(������)= new Phone();

		Phone iPhone = new Phone(30, "2222");
//		iPhone.number = "2222";
//		iPhone.displaySize = 30;
		System.out.println(iPhone.number);
		iPhone.Camera();

		// default ������
		Phone galaxy = new Phone(50, "11111111");
		// galaxy.number = "11111111";
		// galaxy.displaySize = 50;

		Phone lollipop = new Phone(10, "011");
		// lollipop.number = "011";
		// lollipop.displaySize = 10;
	}
}
