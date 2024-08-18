public class Main
{
    public static void main(String[] args)
    {
        Student obj = new Student(60,"Manasi","Computer Engg");
        System.out.println(obj);

        Student obj1 = new Student(25,"Sagar", "Electronics Engg");
        System.out.println(obj1);

        System.out.println(obj.getCourse());
        System.out.println(obj1.getName());
    }
}
