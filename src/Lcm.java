public class Lcm
{
    static int lcd(int n1, int n2)
    {
        int i,limit = (n1<n2)?n1:n2;
        for(i=2;i<limit;i++)
            if(n1%i==0 && n2%i==0)      return i;
        return n2;
    }
    public static void main(String []args)
    {
        int i,lcm=2;
        for(i=3;i<21;i++)
        {
            if(lcm%i==0)    continue;
            else lcm=lcm*lcd(lcm,i);
        }
        System.out.println(lcm);
    }
}
