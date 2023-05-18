package StudentManagment;

public class Student {
    private int rollNO;
    private  String name;
    private  double marks;
    private Subject subject;

    public Student(){

    }

    public Student(int rollNO, String name, double marks, Subject subject) {
        this.rollNO = rollNO;
        this.name = name;
        this.marks = marks;
        this.subject = subject;
    }

    public int getRollNO() {
        return rollNO;
    }

    public void setRollNO(int rollNO) {
        this.rollNO = rollNO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
