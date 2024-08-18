public final class Student
{
    private final int rollNo;
    private final String name;
    private final String course;

    public Student (int rollNo, String name, String course)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    public int getRollNo()
    {
        return rollNo;
    }

    public String getName()
    {
        return name;
    }

    public String getCourse()
    {
        return course;
    }

    @Override
    public String toString()
    {
        return "\nRoll No : "+rollNo+"\nName : "+name+"\nCourse : "+course;
    }
}
