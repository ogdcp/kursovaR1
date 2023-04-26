public class Employee {
   private String FIO;
   private int department;
    private int salary;
    private static int idCounter=0;
    private int id;

    public String getFIO () {
        return FIO;
    }
    public int getDepartment (){
        return department;
    }
    public int getSalary() {
        return salary;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public int getId() {
        return id;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public static void setIdCounter(int idCounter) {
        Employee.idCounter = idCounter;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Employee (String FIO, int department, int salary){
        this.FIO=FIO;
        this.department=department;
        this.salary=salary;
        this.id=idCounter;
        idCounter++;
    }

    public String toString() {
        return " Работник " +
                " ФИО " + FIO + '\'' +
                ", отдел " + department +
                ", зарплата " + salary +
                ", id " + id ;
    }
}
