public class Main {
    public static void main(String[] args) {

        /*Der Konstruktor nimmt ein Array von Studenten entgegen
    Jeder Student hat einen Namen und eine Id
    Die Methode getAllStudents gibt alle Studenten als Array zurück
    Die Methode toString() gibt alle Studenten formatiert als String zurück
D   Die Methode randomStudent() gibt einen zufälligen Studenten zurück (Nutze für den Zufall Math.random())*/

        Students student1 = new Students(1 , "peter");
        Students student2 = new Students(2 , "Hans");
        Students student3 = new Students(3 , "Klaus");

        Students [] students = {student1,student2,student3};

        StudentDB studentdb = new StudentDB(students);

    }

}