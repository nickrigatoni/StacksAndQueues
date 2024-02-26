public class Student_Rigatti {
    private String name;
    private int id;

    public Student_Rigatti(String name, int id){
        this.name = name;
        this.id = id;
    }

    public boolean checkStudents(Student_Rigatti thing1, Student_Rigatti thing2){
        return thing1.equals(thing2);
    }

    public String getName(){
        return name;
    }

    public int getID(){
        return id;
    }

}
