package headfirstjava.examples;

public class Dog {
    String name;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.setName("����");

        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].setName("����");
        myDogs[1].setName("�����");
        System.out.print("��� ��������� ������ - ");
        System.out.println(myDogs[2].getName());
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x++;
        }
    }

    public void bark() {
        System.out.println(getName() + " ������ ���");
    }

    public void eat() {
    }

    public void chaseCae() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
