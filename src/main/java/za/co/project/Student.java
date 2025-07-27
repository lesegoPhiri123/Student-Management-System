package za.co.project;

public class Student {
    private int marks;
    private String name;
    private int id;

    private Course course;

    public Student(String name, int id, int marks, Course course) {
        this.name = name;
        this.id = id;
        this.marks = marks;
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }


    public String getName() {
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public int getId(){
        return id;
    }

    public void setId(int newId){
        this.id = newId;
    }

    public int getMarks(){
        return marks;
    }

    public void setMarks(int newMarks){
        this.marks = newMarks;
    }


}
