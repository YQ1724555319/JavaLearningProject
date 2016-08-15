/**
@Yq
�ӿ�--��̬��ϰ
�������ݿ�Ĳ������򵥲�����
�������ݿ�ļ򵥲������������û���Ϣ
1.�������ݿ⡣JDBC Hibernate
2.�������ݿ⡣
 ��ɾ�Ĳ飨add delete update read��
3.�ر����ݿ�����
*/
interface UserInfoDAO { // �û���Ϣ�����ݷ��ʶ���ӿ�
	public abstract  void link();
	public abstract  void add();
	public abstract  void delete();
	public abstract void update();
	public abstract void read();
}
/**

*/
class UserInfoJ {
	String name ="����";
	String company = "����";
	long tel = 6845946L;
}
class UserInfoH {
	String name ="����";
	String company = "��Ѷ";
	long tel = 6935789L;
}
/**

*/
class UserInfoByJDBC extends UserInfoJ implements UserInfoDAO {
	public void link() {
		System.out.println("�������ݿ�JDBC����loading");
		if (name != null&&company !=null&&tel != 0L) {
			System.out.println(cutline()+"\n"+"***���ӳɹ�***");
		}
		else {
			System.out.println(cutline()+"\n"+"***����ʧ��***");
		}
	}
	public void add() {
		System.out.println(cutline()+"\n"+"***�����û���Ϣ***"+"\n"+cutline()+"\n"+"***������ӡ���***");
	}
	public void delete() {
		System.out.println(cutline()+"\n"+"***ɾ���û���Ϣ***"+"\n"+cutline()+"\n"+"***����ɾ������***");
		if (name != null&&company !=null&&tel != 0L) {
			super.name = null;
			super.company = null;
			super.tel = 0L;
			if (name == null&&company == null&&tel == 0L) {
				System.out.println(cutline()+"\n"+"***ɾ���ɹ�***"+"\n"+cutline());
				read();
			}
			else {
				System.out.println("***ɾ��ʧ��***"+"\n"+cutline());
			}
		}
	}
	public void update() {
		System.out.println("�����û���Ϣ");
	}
	public void read() {
		System.out.println(cutline()+"\n"+"***��ȡ�û���Ϣ***"+"\n"+cutline());
		if (name != null&&company !=null&&tel != 0L) {
			System.out.println("�û�����"+super.name+"\n"+"��˾��"+super.company+"\n"+"�绰��"+super.tel);
		}
		else {
			System.out.println(cutline()+"\n"+"***��ȡʧ��***");
		}
	}
	public String cutline() {
		return "--------------------";
	}
}
public class PolymorphismDemo3 {
	public static void main(String[] args) {
		UserInfoDAO user = new UserInfoByJDBC();
		user.link();
		user.read();
		user.delete();
	}
}
