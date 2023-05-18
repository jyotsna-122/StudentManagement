package StudentManagment;

import App1.Customer;

import java.util.ArrayList;
import java.util.List;

public class BLclass {
    private List<Student>data=new ArrayList<>();

    public void addData(Student s) {
        data.add(s);

    }

    public void displaydata(){
        for (Student s : data) {
            System.out.println(s.getRollNO());
            System.out.println(s.getName());
            System.out.println(s.getMarks());
            System.out.println(s.getSubject().getSid());
            System.out.println(s.getSubject().getSname());
            System.out.println(s.getSubject().getSfees());


        }
    }

    public void removeData(int id) {
        for (Student s : data) {
            if (s.getRollNO() == id) {
                data.remove(s);
                System.out.println("Student with ID " + id + " has been removed.");
                return;
            }
        }
        System.out.println("Student with ID " + id + " was not found.");
    }

    public void updateSubject(int sid, Subject newSubject) {
        int i;
        for (i = 0; i < data.size(); i++) {
            if (data.get(i).getRollNO() == sid) {
                data.get(i).setSubject(newSubject);
            }
        }
        System.out.println("name updated successful");
    }

    public void searchData(int id) {
        for (Student s : data) {
            if (s.getRollNO() == id) {
                System.out.println("Student found:");
                System.out.println(s.getRollNO());
                System.out.println(s.getName());
                System.out.println(s.getMarks());
                System.out.println(s.getSubject().getSid());
                System.out.println(s.getSubject().getSname());
                System.out.println(s.getSubject().getSfees());

                return;
            }
        }
        System.out.println("Student with ID " + id + " was not found.");
    }

    public void DisplaySubject(String sname) {
        for (Student s : data) {
            if (s.getSubject().getSname().equals(sname)) {
                System.out.println(s.getRollNO());
                System.out.println(s.getName());
                System.out.println(s.getMarks());
                System.out.println(s.getSubject().getSid());
                System.out.println(s.getSubject().getSname());
                System.out.println(s.getSubject().getSfees());


            }
        }
    }
}
