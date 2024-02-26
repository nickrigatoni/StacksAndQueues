import java.sql.SQLOutput;

public class BathroomChallenge_Rigatti {
    public static void main(String[] args) {
        Bathroom_Rigatti bathroom1 = new Bathroom_Rigatti(3);
        Bathroom_Rigatti bathroom2 = new Bathroom_Rigatti(2);
        Student_Rigatti student1 = new Student_Rigatti("James Washington", 14251);
        Student_Rigatti student2 = new Student_Rigatti("David Monte", 12431);
        Student_Rigatti student3 = new Student_Rigatti("Charlie Jackson", 45634);
        Student_Rigatti student4 = new Student_Rigatti("Johnny Johnson", 43096);
        Student_Rigatti student5 = new Student_Rigatti("Davis Davidson", 34975);
        Student_Rigatti student6 = new Student_Rigatti("Rachel Bobson", 98789);
        Student_Rigatti student7 = new Student_Rigatti("Chuck Gary", 34534);
        Student_Rigatti student8 = new Student_Rigatti("John Smith", 96549);
        Student_Rigatti student9 = new Student_Rigatti("John Doe", 34633);
        Student_Rigatti student10 = new Student_Rigatti("Jane Doe", 66355);
        Student_Rigatti student11 = new Student_Rigatti("Janette Reed", 33746);
        Student_Rigatti student12 = new Student_Rigatti("Michele Mickey", 87588);

        bathroom1.enterBathroom(student1);
        bathroom1.enterBathroom(student2);
        bathroom1.enterBathroom(student9);
        bathroom1.enterBathroom(student8);
        bathroom1.enterBathroom(student7);
        bathroom2.enterBathroom(student11);
        bathroom2.enterBathroom(student10);
        bathroom2.enterBathroom(student6);
        bathroom2.enterBathroom(student12);

        System.out.println("\nBathroom 1:");
        bathroom1.getBathroom();
        System.out.println("\nBathroom 2:");
        bathroom2.getBathroom();
        System.out.println("\n");

        bathroom1.findStudent(student1);
        bathroom1.findStudent(student7);
        bathroom2.findStudent(student1);
        bathroom1.findStudent(student5);
        System.out.println();

        bathroom1.test();
        bathroom2.test();
        bathroom1.clear();
        bathroom1.test();

        bathroom1.setStudLimit(15);
    }
}
