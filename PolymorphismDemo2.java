import java.util.Scanner;
/**
@Yq
�ӿ�--��̬
�������������ʵ��
����
���е������壬ͨ�����������У����ǹ����������У�û�ж�����壬
������������������������������Կ��ȶ����������Ժ󻹿��ܻ��и������չ��
����Ϊ�������͸������㣬��������֮�������ԣ����Խ�����һ��������֮�ϵĲ�ۣ�
�Ա���չ�����������Ҿ�������Щ�������еĿ��з�ʽ��
˼·��
���ǿ���ͨ������һ���ӿ���ʵ�������ϵĲ�ۡ��������ڿ�����һ������ʵ�֡�
�������������ȵȣ�������ͬ������ʵ�֣���ϽӿڵĶ�̬���ԣ������е���������չʵ�ֲ������ӿڵ����������С�
*/
/**
*���������ϵ�PCI��ۣ��Խӿڵ���ʽʵ�ֿ��͹�
*/
interface PCI {
	public void open();
	public void close();
}
/**
���������࣬
*/
class MainBoard {
	public int input() {
		int x;
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		return x;
		}
	public int input1() {
		int y;
		Scanner input1 = new Scanner(System.in);
		y = input1.nextInt();
		return y;
	}
	public void run() {
		System.out.println("��������"+"\n"+"ѡ����������");
		System.out.println("---2-����--3-����--4-�Կ�--5-ȫ��---");
		}
	// ����һ������������������������������չ��ʵ�����к͹رա�
	public void usePCI(PCI p) {
			System.out.println("��ѡ"+"\n"+"ѡ���Ƿ���");
			System.out.println("-------------1-��--0-��-----------");
		if (p != null) {
			switch (input1()) {
				case 1:
					p.open();
				break;
				case 0:
					p.close();
				break;
				default:
					System.out.println("���������޷�������ر�");
				break;
			}

		}
	}
}
/**
���������������ۣ�������ʵ��PCI��ۣ��������ϲ��
*/
class SoundCard implements PCI{
	public void open() {
		System.out.println("��������");
	}
	public void close() {
		System.out.println("�����ر�");
	}
}
/**

*/
class NetCard implements PCI {
	public void open() {
		System.out.println("��������");
	}
	public void close() {
		System.out.println("�����ر�");
	}
}
/**

*/
class VoideCard implements PCI {
	public void open() {
		System.out.println("�Կ�����");
	}
	public void close() {
		System.out.println("�Կ��ر�");
	}
}
class PolymorphismDemo2 {
	public static void main(String[] args) {
		MainBoard m = new MainBoard();
		m.run();
		switch (m.input()) {
		case 2:
			m.usePCI(new NetCard());
		break;
		case 3:
			m.usePCI(new SoundCard());
		break;
		case 4:
			m.usePCI(new VoideCard());
		break;
		case 5:
			m.usePCI(new NetCard());
			m.usePCI(new SoundCard());
			m.usePCI(new VoideCard());
		break;
		default:
			System.out.println("��������");
		break;
	}
	}
}
