public class ComputerScienceStudent extends Student{


    private String programmingLanguage;



    public ComputerScienceStudent(int id, String name,String programmingLanguage) {
        super(id, name);
       this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}
