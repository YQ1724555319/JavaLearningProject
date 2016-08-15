/**
@Yq
接口--多态练习
例：数据库的操作（简单操作）
需求：数据库的简单操作，数据是用户信息
1.连接数据库。JDBC Hibernate
2.操作数据库。
 增删改查（add delete update read）
3.关闭数据库连接
*/
interface UserInfoDAO { // 用户信息的数据访问对象接口
	public abstract  void link();
	public abstract  void add();
	public abstract  void delete();
	public abstract void update();
	public abstract void read();
}
/**

*/
class UserInfoJ {
	String name ="张三";
	String company = "网易";
	long tel = 6845946L;
}
class UserInfoH {
	String name ="李四";
	String company = "腾讯";
	long tel = 6935789L;
}
/**

*/
class UserInfoByJDBC extends UserInfoJ implements UserInfoDAO {
	public void link() {
		System.out.println("连接数据库JDBC……loading");
		if (name != null&&company !=null&&tel != 0L) {
			System.out.println(cutline()+"\n"+"***连接成功***");
		}
		else {
			System.out.println(cutline()+"\n"+"***连接失败***");
		}
	}
	public void add() {
		System.out.println(cutline()+"\n"+"***增加用户信息***"+"\n"+cutline()+"\n"+"***正在添加……***");
	}
	public void delete() {
		System.out.println(cutline()+"\n"+"***删除用户信息***"+"\n"+cutline()+"\n"+"***正在删除……***");
		if (name != null&&company !=null&&tel != 0L) {
			super.name = null;
			super.company = null;
			super.tel = 0L;
			if (name == null&&company == null&&tel == 0L) {
				System.out.println(cutline()+"\n"+"***删除成功***"+"\n"+cutline());
				read();
			}
			else {
				System.out.println("***删除失败***"+"\n"+cutline());
			}
		}
	}
	public void update() {
		System.out.println("升级用户信息");
	}
	public void read() {
		System.out.println(cutline()+"\n"+"***读取用户信息***"+"\n"+cutline());
		if (name != null&&company !=null&&tel != 0L) {
			System.out.println("用户名："+super.name+"\n"+"公司："+super.company+"\n"+"电话："+super.tel);
		}
		else {
			System.out.println(cutline()+"\n"+"***读取失败***");
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
