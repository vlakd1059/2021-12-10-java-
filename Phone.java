
public class Phone {
	//��ư����
	int btnNum=12;
	
	//ȭ��ũ��
	int displaySize;
	//��ȭ��ȣ
	String number;
	
	//������
	//Ŭ���������� ũ�⸦ �����Ҷ� �ʵ尪(Ŭ������ �������ִ� ����)�� ���� �����Ҽ� �ִ� �޼ҵ�
	//Ư¡: ���ϰ� ��ü�� ����, �޼ҵ� �̸��� Ŭ���� �̸��� ����.
	public Phone(int displaySize, String number) {
		this.displaySize = displaySize;  
		this.number = number;
	}
	

	// ���� ����
	public void msgSend() {
		System.out.println("���ڸ� �����ϴ�.");
	}
	// ��ȭ ����
	public void Call() {
		System.out.println("��ȭ�� �ɴ�.");
	}
	// ���ͳ� ����
	public void Wifi() {
		System.out.println("���ͳ� ����.");
	}
	// ���� �Կ�
	public void Camera() {
		System.out.println("������ ���.");
	}
	
	

}
