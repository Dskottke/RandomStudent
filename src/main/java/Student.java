public abstract class  Student {


    private int id ;
    private String name;


    abstract public void learn();
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Studenten{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }



}
