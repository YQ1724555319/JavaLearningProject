/**
@Yq
封装，修饰符private，可将成员变量或成员函数权限降低，只能在该类中访问
*/
class PersonDemo {
	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(-1);
		//int p1=p.getAge();
		//System.out.println("age="+p1);
	}
}
class Person{
    //如果在定义的类中用private修饰这个成员变量，则这个变量只能在这个类中访问,权限修饰以后，提高了安全性
    private int age = 8;
    //提供公共访问方法：
    public void setAge(int a){ //设置
        if(a>0 && a<130){
        age = a;
        speak();
		}
        else{
        System.out.println("非法数据");
        }
    }
    public int getAge(){//获取
        return age;
    }
    void speak(){
    System.out.println("age="+age);
    }

}