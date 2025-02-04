package SchoolAssignments;

import java.util.ArrayList;
public class School
{
    public static void main(String[] args) {
        Student yash = new Student("Yash", 101, 95, 98, 100);
        Student ram = new Student("Ram", 202, 99, 99, 100);
        Student joe = new Student("Joe", 303, 94, 94, 94);
        Student bill = new Student("Joe", 404, 94, 94, 94);
        Student bill2 = new Student("Joe", 404, 94, 94, 94);

        ArrayList<Student> students = new ArrayList<>();
        students.add(yash);
        students.add(ram);
        students.add(joe);
        students.add(bill);
        students.add(bill2);

        setMathScoreStudent(students, 101, 100);
        printStu(students);
        setMathScoreStudent(students, 202, 50);
        printStu(students);
        Student s1 = getStudent(students, 202);
        System.out.println(s1);
        System.out.println(checkDupes(students));


    }

    public static void setMathScoreStudent(ArrayList<Student> s1, int id, int newScore)
    {
        for (Student student : s1) {
            if (student.getId() == id) {
                student.setMathScore(newScore);
            }
        }
    }

    public static void printStu(ArrayList<Student> s1)
    {
        System.out.println(s1);
    }

    public static Student getStudent(ArrayList<Student> s1, int id)
    {
        Student stu = null;
        for(Student s : s1)
        {
            if(s.getId() == id)
            {
                stu = s;
            }
        }
        return stu;
    }

    public static boolean checkDupes(ArrayList<Student> s1)
    {
        //if id matches, duplicate
        boolean dupe = false;
        for(int i = 0; i < s1.size() - 1; i++)
        {
            for(int j = i+1; j < s1.size(); j++)
            {
                if (s1.get(i).getId() == s1.get(j).getId()) {
                    dupe = true;
                    break;
                }
            }
            if(dupe)
            {
                break;
            }
        }
        return dupe;
    }

}
