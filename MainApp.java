package StudentManagment;

import java.util.Scanner;

public class MainApp {
    static Scanner sc1=new Scanner(System.in);
   static BLclass bl=new BLclass();

    public static void main(String[] args) {
        boolean status=true;
        do{
            System.out.println("1:add student details");
            System.out.println("2:display details");
            System.out.println("3:remove student");
            System.out.println("4:update student subject");
            System.out.println("5:search student by id");
            System.out.println("6:display student by subject");
            System.out.println("7:exit");
            int choice=sc1.nextInt();
            switch (choice)
            {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displaydetails();
                    break;
                case 3:
                    removeStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    SearchStudentById();
                    break;
                case 6:
                    displayStudentBySubject();
                    break;
                case 7:

                    status=false;
                    break;

            }
        }while (status);
    }

    private static void displayStudentBySubject() {
        System.out.println("enter the suject name");
        String sname=sc1.next();
        bl.DisplaySubject(sname);
    }

    private static void SearchStudentById() {
        System.out.println("enter the id");
        int id=sc1.nextInt();
        bl.searchData(id);

    }

    private static void updateStudent() {
        System.out.println("enter the sid");
        int sid=sc1.nextInt();
        System.out.println("enter the new subject name to update");
        Subject newSubject=addSubject();
        bl.updateSubject(sid,newSubject);
    }

    private static void removeStudent() {
        System.out.println("enter the student id");
        int id=sc1.nextInt();
        bl.removeData(id);
    }

    private static void displaydetails() {
        bl.displaydata();

    }

    public static void addStudent()
    {
        System.out.println("enter stuent rollno");
        int rollno=sc1.nextInt();
        System.out.println("enter student name");
        String name=sc1.next();
        System.out.println("enter student marks");
        double marks=sc1.nextDouble();
        Subject s=addSubject();
        Student s1=new Student(rollno,name,marks,s);
        bl.addData(s1);

    }
    public static Subject addSubject(){
        System.out.println("enter sid");
        int sid=sc1.nextInt();
        System.out.println("enter sname");
        String name=sc1.next();
        System.out.println("enter fees");
        double sfees=sc1.nextDouble();

        Subject s=new Subject(sid,name,sfees);
        return s;
    }


}
