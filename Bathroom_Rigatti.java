import java.util.concurrent.LinkedTransferQueue;
import java.util.ArrayList;
public class Bathroom_Rigatti {
    private LinkedTransferQueue<Student_Rigatti> line = new LinkedTransferQueue<Student_Rigatti>();
    private int numInLine;
    private int numInBathroom;
    private int studLimit;
    private ArrayList<Student_Rigatti> bathroom = new ArrayList<Student_Rigatti>(0);

    private  ArrayList<Student_Rigatti> recentBathroom = new ArrayList<Student_Rigatti>(0);

    public Bathroom_Rigatti(int studLimit){
        this.studLimit = studLimit;
    }

    private LinkedTransferQueue<Student_Rigatti> getLine(){
        return line;
    }

    public void getBathroom(){
        for (int x = 0; x<bathroom.size(); x++){
            String v = bathroom.get(x).getName();
            System.out.print(v + ", ");
        }
    }

    public ArrayList<Student_Rigatti> getRecentBathroom(){
        return recentBathroom;
    }

    public void enterBathroom(Student_Rigatti stud){
        if (bathroom.contains(stud)){
            System.out.println(stud.getName() + " is already in the bathroom.");
        }
        else if (recentBathroom.contains(stud)){
            System.out.println(stud.getName() + " has recently been in the bathroom, cannot go again.");
        }
        else if (bathroom.size() >= studLimit){
            System.out.println("Bathroom is currently full, " + stud.getName() + " has been added to the end of the line.");
            line.add(stud);
        }
        else{
            bathroom.add(stud);
            System.out.println(stud.getName() + " is now in the bathroom.");
        }
    }

    public void leaveBathroom(Student_Rigatti stud){
        bathroom.remove(stud);
        recentBathroom.add(stud);
        System.out.println(stud.getName() + " has left the bathroom.");
        Student_Rigatti firstStud = line.poll();
        bathroom.add(firstStud);
        if (!line.isEmpty()){
            System.out.println(firstStud.getName() + " is now in the bathroom.");
        }
    }

    public void findStudent(Student_Rigatti stud){
        if (line.contains(stud)){
            System.out.println(stud.getName() + " is in the bathroom line.");
        }
        else if(bathroom.contains(stud)){
            System.out.println(stud.getName() + " is in the bathroom.");
        }
        else if (recentBathroom.contains(stud)){
            System.out.println(stud.getName() + " was recently in the bathroom.");
        }
        else{
            System.out.println(stud.getName() + " is not in the bathroom and has not recently been.");
        }
    }

    public void clear(){
        bathroom.clear();
        line.clear();
        recentBathroom.clear();
        System.out.println("Bathroom and Bathroom Line have been cleared.");
    }

    public int lineLength(){
        return line.size();
    }

    public String test(){
        return null;
    }

    public void setStudLimit(int studLimit){
        this.studLimit = studLimit;
    }
}
