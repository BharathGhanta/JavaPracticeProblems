/** toString() method */
class Student
{
    int rollno=111;
    String name="ABC";
    String city="HYD";

    public String toString()
    {
        return rollno+"  "+name+"  "+city;
    }

    public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student();

        System.out.println(s1);//compiler writes here s1.toString()
        s1.rollno=222;
        s1.name="BCD";
        System.out.println(s1);
        System.out.println(s2);//compiler writes here s2.toString()
    }
}  