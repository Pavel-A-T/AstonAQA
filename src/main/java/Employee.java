public class Employee {
    private String fio;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivan@mail.ru", "87894561258", 30000, 25);
        persArray[1] = new Employee("Petrov Petr", "Worker", "petr@ya.ru", "89584532876", 321354, 26);
        persArray[2] = new Employee("Fedorov Feodor", "Engineer", "feod@mail.ru", "+67891225846", 430000, 52);
        persArray[3] = new Employee("Janin Scovo", "Worker", "scovo@google.com", "+12258763458", 130000, 47);
        persArray[4] = new Employee("Exco Erty", "Engineer", "exco@rutyuer.com", "85874253687", 12000, 33);

        for (Employee e : persArray) {
            System.out.println(e);
        }
    }

    public Employee(String fio, String position, String email, String phoneNumber, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
