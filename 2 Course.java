import java.awt.print.Book;

class Course {

    static int maxCapacity;
    String courseName;
    int enrolledStudents;

    static {
        maxCapacity=100;
    }

    String[] EnrolledStudents= new String[maxCapacity];

    Course(String CourseName,int EnrolledStudents){
        this.courseName= CourseName;
        this.enrolledStudents=EnrolledStudents;
    }

    Course(String CourseName){
        this(CourseName,55);
    }
    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity=maxCapacity;
    }
    void enrollment(String StudentName){
        EnrolledStudents[enrolledStudents]= StudentName;
    }

    public static void main(String[] args) {

    }
}
