import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    /*
    Der Konstruktor nimmt ein Array von Studenten entgegen
    Jeder Student hat einen Namen und eine Id
    Die Methode getAllStudents gibt alle Studenten als Array zurück
    Die Methode toString() gibt alle Studenten formatiert als String zurück
    Die Methode randomStudent() gibt einen zufälligen Studenten zurück (Nutze für den Zufall Math.random())

    Erweitere die StudentDB um eine findById(int id) Methode.
    Die findById Methode soll eine passende Exception werfen, wenn kein Student mit der Id existiert.
    Optional (Bonus):
    Schreibe einen Test mittels try/catch der dieses Verhalten überprüft.
    */

        //New student
        Student student1 = new ComputerScienceStudent(1 , "peter","java");
        Student student2 = new ComputerScienceStudent(2 , "Hans","c++");
        Student student3 = new ComputerScienceStudent(3 , "Klaus","Qbasic");
        Student student4 = new ComputerScienceStudent(4 , "Karl","c#");

        //New ComputerScienStudent + Typecast
       ComputerScienceStudent david = new ComputerScienceStudent(5,"david","java");
        Student davidTypecast= (Student) david;
        System.out.println(davidTypecast.getClass().toString());

        // fill map
       HashMap<Integer, Student> students = new HashMap<>(Map.of(
                student1.getId(), student1,
                student2.getId(), student2,
                student3.getId(), student3
        ));


       // new StudentDB
        StudentDB studentdb = new StudentDB(students);

        //add Student4 and remove Student1
        System.out.println(studentdb);
        studentdb.addStudent(student4);
        System.out.println(studentdb);
        studentdb.removeStudent(1);
        System.out.println(studentdb);

        try{
            System.out.println(studentdb.findById(4).toString());
        }
        catch (IdNotFoundException e){
            System.out.println(e.getMessage());
        }

       /* Mache deine Student Klasse zu einer abstrakten Klasse.
        Füge der Klasse Student eine abstracte Methode hinzu. Lasse diese von deiner ComputerScienceStudent Klasse implementieren.
        */
        ComputerScienceStudent student6 = new ComputerScienceStudent(5,"peter","Java");
        student1.learn();

    }



}
