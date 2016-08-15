import java.util.Scanner;
/**
*@Yq
*���绰������ϵͳv2.0���޸ģ���ȡ��3��������ȥ�����ò����Ľӿڣ��޸��˱����������˴��룬����˲���˵��
*1.���	2.ɾ��	3.�޸�	4.��ѯ����	5.����������ѯ	6.�˳�����
*/
/**
*�绰�������ݴ洢�࣬���������洢�������ݣ�����ֻ������101�����ȣ�����101����ϵ��
*/
class TelBook {
	static boolean i = true; // ��Ҫ����ִ������ϵͳ��ѭ���Լ�����ѭ��ʱ
	String[] name = new String[100];
	String[] sex = new String[100];
	int[] age = new int[100];
	long[] tel = new long[100];
	long[] qq = new long[100];
	String[] location = new String[100];
}
/**
*�绰���Ĳ����࣬��ӣ�ɾ�����޸ģ���ѯ���У����ֲ�ѯ���˳���������̳����������Ա��ȡ���ݣ�
*/
class TellAllHandle extends TelBook {
//---------------------��Ӳ�������-----------------------------
	public void add() {
		int numAdd=0;
		for (int y=0 ; y < name.length;y++) {
			if (name[y]!=null) { //�ж��Ƿ������ݣ�����У��ͽ�������ӵ�������ӵ���һ���Ǳ꣬��ӵ���ͬλ�ñ��⸲��
				numAdd++;
			}
		}
		addOrAlter(numAdd); // ������Ӳ�������
		printAll(numAdd);  // ���ô�ӡ��Ϣ����
		System.out.println("\n"+"��ӳɹ�");
	}
//---------------------ɾ����������-----------------------------
	public void delete() { // ɾ������
		int numDelete = nameRead(0,0); // �������ֲ�ѯ���������ҽ����صĽǱ�ֵ���������ж�
		if (name[numDelete] != null) {
			System.out.println("ȷ��Ҫɾ���𣿡�1(��)��0(��)��"+"\n"+"����ѡ�");
			Scanner input = new Scanner(System.in);
			int ifDelete = input.nextInt();
			switch (ifDelete) {
				case 1: //�������Ϊ1���򽫲�ѯ���Ķ�Ӧ����ȫ������Ϊ�ջ�0����ʾΪɾ��
					System.out.println("\n"+"����ɾ����"+"["+name[numDelete]+"]"+"��������Ϣ");
					name[numDelete] = null;
					sex[numDelete] = null;
					age[numDelete] = 0;
					tel[numDelete] = 0L;
					qq[numDelete] = 0L;
					location[numDelete] = null;
					System.out.println("\n"+"ɾ���ɹ�");
				break;
				case 0:
					System.out.println("\n"+"��δ���κ�ɾ��");
				break;
				default:
					System.out.println("\n"+"������������������ѡ��ҵ��");
				break;
			}
		}
	}
//---------------------�޸Ĳ�������-----------------------------
	public void update() { // �޸Ĳ���
		int numUpdate = nameRead(0,0);
		if (name[numUpdate] != null) {
			System.out.println("\n"+"������������Ϣ��");
			addOrAlter(numUpdate);
			printAll(numUpdate);
			System.out.println("\n"+"�޸ĳɹ�");
		}
	}
//---------------------��ѯ���в�������-----------------------------
	public void read() { // ��ѯ����
		int numR1 = 0;
		int numR2 = 0;
		while (numR1 < name.length-1) {
			if (name[numR1] != null) {
				printAll(numR1);
				numR2 = 0;
			}
			else {
				numR2 = 1;
			}
			numR1++;
		}
		if (numR2 != 0) {
			System.out.println("\n"+"����Ϊ������ϵ�ˣ��� 1 ��Ӹ�����ϵ��");
		}
	}
//---------------------�������Ҳ�������-----------------------------
	public int nameRead(int numIf1,int numIf2) {
		System.out.print("\n"+"��������Ҫ����/�޸�/ɾ������ϵ������:");
		Scanner input = new Scanner(System.in);
		String inputName = input.next();
		while(numIf1 < name.length-1) { //��ֹδ�ҵ��Ǳ�Խ�磬-1
			if(inputName.equals(name[numIf1])) { //�������飬�����Ƿ��к������ַ���ͬ��Ԫ�أ�����У����ӡ�����Ӧ�Ǳ��������Ϣ���Ա�ʾ���ҵ���Ҫɾ������Ϣ
				printAll(numIf1);
				numIf2 = 0;
				break; //����ҵ�����ֱ�ӽ�������ѭ��
			}
			else { //�����û���ҵ���������ƥ����ַ�����ֵnumIf2��ֵΪ1
				numIf2 = 1;
			}
			numIf1++;
		}
		if (numIf2 != 0) { //Ϊ�˲��ظ���ӡ����䣬��ѭ�����ж����numIf2��ֵ���ﵽ��ʾδ���ҵ�
			System.out.println("\n"+"��Ǹ����ѯ�����޸�����Ϣ");
		} return numIf1;
	}
//---------------------�˳���������-----------------------------
	public void exit() {
		i = false; // ��MainInterface��mainSelect����ѭ��������i��ֵΪfalse����ѭ���������˳�ϵͳ
	}
//----------------------��ӻ��޸���ϵ�����뷽��--------------------
	public void addOrAlter(int in) {
		Scanner input = new Scanner(System.in);
		System.out.print("����:");
		name[in] = input.next();
		System.out.print("�Ա�:");
		sex[in] = input.next();
		System.out.print("����:");
		age[in] = input.nextInt();
		System.out.print("�绰:");
		tel[in] = input.nextLong();
		System.out.print("Q Q:");
		qq[in] = input.nextLong();
		System.out.print("��ַ:");
		location[in] = input.next();
	}
//----------------------��ӡ��ϵ�����鷽��--------------------------
	public void printAll(int p) {
		System.out.println("\n"+"����:"+name[p]+"��"+"�Ա�:"+sex[p]+"��"+"����:"+age[p]+"��"+"�绰:"+tel[p]+"��"+"Q Q:"+qq[p]+"��"+"��ַ:"+location[p]);
	}
}
/**
*�����������࣬���������ĳ�ʼ����ѡ��ҵ���Լ����������ķ�������
*/
class MainInterface {
//---------------------�����������ѡ���������-----------------------------
	public void mainSelect() {
		System.out.println("-----------------------------�绰������ϵͳ-----------------------------");
		System.out.println("\t"+"1.���"+"\t"+"2.ɾ��"+"\t"+"3.�޸�"+"\t"+"4.��ѯ����"+"\t"+"5.����������ѯ"+"\t"+"6.�˳�");
		System.out.println("-----------------------------�绰������ϵͳ-----------------------------");
		TellAllHandle T = new TellAllHandle(); //���ظ������
		while(T.i){ //��������ѭ������������i = true ��ɣ������ڽ�����һ��������������ɱ���ϵͳ�������У�
			T.i = true;
			System.out.print("\n"+"�������1-6ѡ��ҵ��:");
			Scanner input = new Scanner(System.in);
			int mainSelect = input.nextInt(); // �����û�ѡ��ҵ���������
				switch (mainSelect) {  // ��switch�����ѡ��ִ��ָ������
				case 1:
					System.out.println("---------------"+"��ӵ绰��"+"---------------");
					T.add();
				break;
				case 2:
					System.out.println("---------------"+"ɾ���绰��"+"---------------");
					T.delete();
				break;
				case 3:
					System.out.println("---------------"+"�޸ĵ绰��"+"---------------");
					T.update();
				break;
				case 4:
					System.out.println("-------------"+"��ӡ���е绰��"+"-------------");
					T.read();
				break;
				case 5:
					System.out.println("---------------"+"��������ѯ"+"---------------");
					T.nameRead(0,0);
				break;
				case 6:
					System.out.println("----------------"+"�˳�ϵͳ"+"----------------");
					T.exit();
					System.out.println("\n"+"ллʹ�ã����˳�ϵͳ");
				break;
				default:
					System.out.println("--------------"+"������������"+"--------------");
				break;
			}
		}
	}
}
public class TelBookMgnage {
	public static void main(String[] args) {
		MainInterface M = new MainInterface(); //����������
		M.mainSelect(); //������ѡ���������
	}
}