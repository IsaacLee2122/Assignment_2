//Isaac Lee,  Write a Java program to implement the class diagram exactly as you see it in Figure 1.

Course.java

import java.util.ArrayList;

public class Course {

private String title;
private ArrayList<CourseRecord> courseRecords=new ArrayList<CourseRecord>();

public String getTitle() {
  return title;
}

public void setTitle(String title) {
  this.title = title;
}

public void addCourseRecord(CourseRecord c)
{
courseRecords.add(c);
}

public ArrayList<CourseRecord> getCourseRecords() {
  return courseRecords;
}

public void printCourseStudents()
{
  for(CourseRecord cr:courseRecords)
{
System.out.println(cr.getStudent()); 
}
}

public void printBestStudent()
{

}
public void printFinalExamStudents()
{
for(CourseRecord cr:courseRecords)
{
if(cr.canTakeFinalExam())
System.out.println(cr.toString());
}
}

}
Assignment.java

public class Assignment {

private double mark;


public double getMark() {
return mark;
}

public void setMark(double mark) {
this.mark = mark;
}

@Override
public String toString() {
return "Assignment [mark=" + mark + "]";
}


}

CourseRecord.java

import java.util.ArrayList;

public class CourseRecord {

private Student student;
private ArrayList<Assignment> assignments=new ArrayList<Assignment>();

public Student getStudent() {
return student;
}

public void setStudent(Student student) {
this.student = student;
}

public void addAssignment(Assignment a)
{
assignments.add(a);
}

public ArrayList<Assignment> getAssignments() {
return assignments;
}

public boolean canTakeFinalExam()
{
return false;

}
public double average()
{
return 0;
}

@Override
public String toString() {
return "CourseRecord [student=" + student + ", assignments=" + assignments + "]";
}


}

Student.java

public class Student {

private String name;

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

@Override
public String toString() {
return "[name=" + name + "]";
}


}

StudentMain.java (Driver code)

public class StudentMain {

public static void main(String[] args) {

Course course=new Course();
CourseRecord cr=new CourseRecord();
Assignment assignment=new Assignment();
assignment.setMark(100);
cr.addAssignment(assignment);
Student stud=new Student();
stud.setName("Tom");
cr.setStudent(stud);
course.addCourseRecord(cr);
course.setTitle("Computer Science");
System.out.println(course.getCourseRecords());
}

}
