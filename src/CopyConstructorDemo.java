public class CopyConstructorDemo
{
    int a1,a2;
    void display1(){System.out.println("A1 is "+a1+"  A2 is "+a2);}

    CopyConstructorDemo()
    {
        a1=100;
        a2=200;
    }
    CopyConstructorDemo(int n1,int n2)
    {
        a1=n1;
        a2=n2;
    }
    CopyConstructorDemo(CopyConstructorDemo ob)
    {
        a1=ob.a1;
        a2=ob.a2;
    }
    public static void main(String []args)
    {
        CopyConstructorDemo o1 = new CopyConstructorDemo();
        CopyConstructorDemo o2 = new CopyConstructorDemo(300,400);
        CopyConstructorDemo o3 = new CopyConstructorDemo(o1);
        o1.display1();
        o2.display1();
        o3.display1();


    }

}
