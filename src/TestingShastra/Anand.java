package TestingShastra;

public class Anand {

     static int a =40;

    public void display(){
           a++;
    }

    public static void main(String[] args) {
        Anand a1 = new Anand();
        a1.a=20;
        System.out.println(a1.a);

        Anand a2 = new Anand();
        System.out.println(a2.a);
    }


}