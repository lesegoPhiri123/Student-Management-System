package za.co.project;

public class Student {
    private int marks;
    private String name;
    private int id;

    public Student(String name, int id,int marks ){
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String setName(String newName){
        return this.name = newName;
    }

    public int getId(){
        return id;
    }

    public int setId(int newId){
        return this.id = newId;
    }

    public int getMarks(){
        return marks;
    }

    public int setMarks(int newMarks){
        return this.marks = newMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
