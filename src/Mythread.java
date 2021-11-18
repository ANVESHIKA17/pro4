//multithreated application
public class Mythread extends Thread {
    public void run() {

        for (int i=0; i< 10; i++)
        {

            System.out.println("My Thread"+ i);
        }
        System.out.println(10/0);
    }
}
class Test56
{
    public static void main(String[] args) {
        Mythread obj= new Mythread();
        //or
        //Therad obj1= new Mythread(); //polymorphic behaviour
        obj.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("main thread"+i);
        }

    }
}
