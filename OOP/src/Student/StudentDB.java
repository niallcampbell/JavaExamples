package Student;

public class StudentDB {

    private Student [] students;

    public StudentDB(){
        students = new Student[3];
        Student s1 = new Student("John Smith", 21, "CSSE");
        Student s2 = new Student("Jack Doe", 21, "Economics");
        Student s3 = new Student("Sarah Jackson", 20, "Maths");
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
    }

    public Student getStudent(int id){

        for(int i = 0; i < students.length; i++){
            if(id == students[i].getID()){
                return students[i];
            }
        }

        return null;
    }
    
    public void printIDs(){
        System.out.println("Available IDs: " );
        for(int i = 0; i < students.length; i++){
            System.out.println(students[i].getID());
        }
    }
    
}
