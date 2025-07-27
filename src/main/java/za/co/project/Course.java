package za.co.project;

public class Course {
//    name of the course
    private String nameOfACourse;

    public Course(String nameOfACourse){
        this.nameOfACourse = nameOfACourse;
    }

    public String getNameOfACourse(){
        return nameOfACourse;
    }

    @Override
    public String toString() {
        return "Course{" +
                "nameOfACourse='" + nameOfACourse + '\'' +
                '}';
    }
}
