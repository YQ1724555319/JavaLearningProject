/**
@Yq
��װ�����η�private���ɽ���Ա�������Ա����Ȩ�޽��ͣ�ֻ���ڸ����з���
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
    //����ڶ����������private���������Ա���������������ֻ����������з���,Ȩ�������Ժ�����˰�ȫ��
    private int age = 8;
    //�ṩ�������ʷ�����
    public void setAge(int a){ //����
        if(a>0 && a<130){
        age = a;
        speak();
		}
        else{
        System.out.println("�Ƿ�����");
        }
    }
    public int getAge(){//��ȡ
        return age;
    }
    void speak(){
    System.out.println("age="+age);
    }

}