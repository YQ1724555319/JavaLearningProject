import java.util.Scanner;
/**
*@Yq
*【电话本管理系统v2.0】修改，提取了3个方法，去掉了用不到的接口，修改了变量名，简化了代码，添加了部分说明
*1.添加	2.删除	3.修改	4.查询所有	5.根据姓名查询	6.退出，，
*/
/**
*电话本的数据存储类，用数组来存储各类数据，这里只定义了101个长度，最多存101个联系人
*/
class TelBook {
	static boolean i = true; // 主要用于执行整个系统的循环以及可用循环时
	String[] name = new String[100];
	String[] sex = new String[100];
	int[] age = new int[100];
	long[] tel = new long[100];
	long[] qq = new long[100];
	String[] location = new String[100];
}
/**
*电话本的操作类，添加，删除，修改，查询所有，名字查询，退出，操作类继承了数据类以便获取数据；
*/
class TellAllHandle extends TelBook {
//---------------------添加操作方法-----------------------------
	public void add() {
		int numAdd=0;
		for (int y=0 ; y < name.length;y++) {
			if (name[y]!=null) { //判断是否有数据，如果有，就将本次添加的数据添加到下一个角标，添加到不同位置避免覆盖
				numAdd++;
			}
		}
		addOrAlter(numAdd); // 调用添加操作方法
		printAll(numAdd);  // 调用打印信息方法
		System.out.println("\n"+"添加成功");
	}
//---------------------删除操作方法-----------------------------
	public void delete() { // 删除操作
		int numDelete = nameRead(0,0); // 调用名字查询方法，并且将返回的角标值赋，加以判断
		if (name[numDelete] != null) {
			System.out.println("确定要删除吗？【1(是)，0(否)】"+"\n"+"输入选项：");
			Scanner input = new Scanner(System.in);
			int ifDelete = input.nextInt();
			switch (ifDelete) {
				case 1: //如果输入为1，则将查询到的对应数据全部设置为空或0，表示为删除
					System.out.println("\n"+"正在删除："+"["+name[numDelete]+"]"+"的所有信息");
					name[numDelete] = null;
					sex[numDelete] = null;
					age[numDelete] = 0;
					tel[numDelete] = 0L;
					qq[numDelete] = 0L;
					location[numDelete] = null;
					System.out.println("\n"+"删除成功");
				break;
				case 0:
					System.out.println("\n"+"您未作任何删除");
				break;
				default:
					System.out.println("\n"+"您的输入有误，请重新选择业务");
				break;
			}
		}
	}
//---------------------修改操作方法-----------------------------
	public void update() { // 修改操作
		int numUpdate = nameRead(0,0);
		if (name[numUpdate] != null) {
			System.out.println("\n"+"请重新输入信息：");
			addOrAlter(numUpdate);
			printAll(numUpdate);
			System.out.println("\n"+"修改成功");
		}
	}
//---------------------查询所有操作方法-----------------------------
	public void read() { // 查询所有
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
			System.out.println("\n"+"以上为所有联系人，按 1 添加更多联系人");
		}
	}
//---------------------姓名查找操作方法-----------------------------
	public int nameRead(int numIf1,int numIf2) {
		System.out.print("\n"+"请输入需要查找/修改/删除的联系人姓名:");
		Scanner input = new Scanner(System.in);
		String inputName = input.next();
		while(numIf1 < name.length-1) { //防止未找到角标越界，-1
			if(inputName.equals(name[numIf1])) { //遍历数组，查找是否有和输入字符相同的元素，如果有，则打印这个对应角标的所有信息。以表示查找到了要删除的信息
				printAll(numIf1);
				numIf2 = 0;
				break; //如过找到了则直接结束本次循环
			}
			else { //如果都没有找到和输入相匹配的字符，则将值numIf2赋值为1
				numIf2 = 1;
			}
			numIf1++;
		}
		if (numIf2 != 0) { //为了不重复打印此语句，在循环外判断最后numIf2的值来达到提示未查找到
			System.out.println("\n"+"抱歉，查询错误，无该人信息");
		} return numIf1;
	}
//---------------------退出操作方法-----------------------------
	public void exit() {
		i = false; // 将MainInterface类mainSelect方法循环的条件i赋值为false，致循环结束，退出系统
	}
//----------------------添加或修改联系人输入方法--------------------
	public void addOrAlter(int in) {
		Scanner input = new Scanner(System.in);
		System.out.print("姓名:");
		name[in] = input.next();
		System.out.print("性别:");
		sex[in] = input.next();
		System.out.print("年龄:");
		age[in] = input.nextInt();
		System.out.print("电话:");
		tel[in] = input.nextLong();
		System.out.print("Q Q:");
		qq[in] = input.nextLong();
		System.out.print("地址:");
		location[in] = input.next();
	}
//----------------------打印联系人详情方法--------------------------
	public void printAll(int p) {
		System.out.println("\n"+"姓名:"+name[p]+"，"+"性别:"+sex[p]+"，"+"年龄:"+age[p]+"，"+"电话:"+tel[p]+"，"+"Q Q:"+qq[p]+"，"+"地址:"+location[p]);
	}
}
/**
*主界面所属类，完成主界面的初始化，选择业务，以及各个操作的方法调用
*/
class MainInterface {
//---------------------主界面加载与选择操作方法-----------------------------
	public void mainSelect() {
		System.out.println("-----------------------------电话本管理系统-----------------------------");
		System.out.println("\t"+"1.添加"+"\t"+"2.删除"+"\t"+"3.修改"+"\t"+"4.查询所有"+"\t"+"5.根据姓名查询"+"\t"+"6.退出");
		System.out.println("-----------------------------电话本管理系统-----------------------------");
		TellAllHandle T = new TellAllHandle(); //加载各项操作
		while(T.i){ //进行输入循环操作，利用i = true 完成，利用在解决完成一项任务后跳出，可保持系统持续运行，
			T.i = true;
			System.out.print("\n"+"【请键入1-6选择业务】:");
			Scanner input = new Scanner(System.in);
			int mainSelect = input.nextInt(); // 加载用户选择业务输入操作
				switch (mainSelect) {  // 用switch语句来选择执行指定操作
				case 1:
					System.out.println("---------------"+"添加电话本"+"---------------");
					T.add();
				break;
				case 2:
					System.out.println("---------------"+"删除电话本"+"---------------");
					T.delete();
				break;
				case 3:
					System.out.println("---------------"+"修改电话本"+"---------------");
					T.update();
				break;
				case 4:
					System.out.println("-------------"+"打印所有电话本"+"-------------");
					T.read();
				break;
				case 5:
					System.out.println("---------------"+"按姓名查询"+"---------------");
					T.nameRead(0,0);
				break;
				case 6:
					System.out.println("----------------"+"退出系统"+"----------------");
					T.exit();
					System.out.println("\n"+"谢谢使用，已退出系统");
				break;
				default:
					System.out.println("--------------"+"您的输入有误"+"--------------");
				break;
			}
		}
	}
}
public class TelBookMgnage {
	public static void main(String[] args) {
		MainInterface M = new MainInterface(); //加载主界面
		M.mainSelect(); //主界面选择输入操作
	}
}