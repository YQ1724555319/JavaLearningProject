import java.util.Scanner;
/**
@Yq
接口--多态
电脑主板与各卡实例
需求：
现有电脑主板，通电主板则运行，但是光是主板运行，没有多大意义，
于是在主板上添加了声卡，网卡，显卡等东西，并且以后还可能会有更多的拓展，
但是为了升级和更换方便，降低他们之间的耦合性，所以建立了一个在主板之上的插槽，
以便拓展和升级。并且具有让这些东西运行的可行方式。
思路：
我们可以通过建立一个接口来实现主板上的插槽。而主板在可以用一个类来实现。
其他的声卡，等等，建立不同的类来实现，结合接口的多态特性，将所有的声卡等拓展实现并建立接口的引用来运行。
*/
/**
*建立主板上的PCI插槽，以接口的形式实现开和关
*/
interface PCI {
	public void open();
	public void close();
}
/**
建立主板类，
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
		System.out.println("主板运行"+"\n"+"选择运用类型");
		System.out.println("---2-网卡--3-声卡--4-显卡--5-全部---");
		}
	// 建立一个函数，来接受来自外界的声卡等拓展并实现运行和关闭。
	public void usePCI(PCI p) {
			System.out.println("已选"+"\n"+"选择是否开启");
			System.out.println("-------------1-开--0-关-----------");
		if (p != null) {
			switch (input1()) {
				case 1:
					p.open();
				break;
				case 0:
					p.close();
				break;
				default:
					System.out.println("输入有误，无法开启或关闭");
				break;
			}

		}
	}
}
/**
假设有声卡插入插槽，我们则实现PCI插槽，以连接上插槽
*/
class SoundCard implements PCI{
	public void open() {
		System.out.println("声卡运行");
	}
	public void close() {
		System.out.println("声卡关闭");
	}
}
/**

*/
class NetCard implements PCI {
	public void open() {
		System.out.println("网卡运行");
	}
	public void close() {
		System.out.println("网卡关闭");
	}
}
/**

*/
class VoideCard implements PCI {
	public void open() {
		System.out.println("显卡运行");
	}
	public void close() {
		System.out.println("显卡关闭");
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
			System.out.println("输入有误");
		break;
	}
	}
}
