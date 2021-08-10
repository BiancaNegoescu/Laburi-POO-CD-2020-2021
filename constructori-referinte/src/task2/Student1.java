package task2;

class Student1 {
    private int id;
    private String name;
    private String surname;

    public Student1(int var1, String var2, String var3) {
        this.id = var1;
        this.name = var2;
        this.surname = var3;
    }

    public Student1(Student1 var1) {
        this.id = var1.id;
        this.name = var1.name;
        this.surname = var1.surname;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setId(int var1) {
        this.id = var1;
    }

    public void setSurname(String var1) {
        this.surname = var1;
    }

    public void setName(String var1) {
        this.name = var1;
    }

    public void show() {
        System.out.println(String.format("Name: %s\nSurname: %s\nStudent ID: %d\n", this.name, this.surname, this.id));
    }
}