public class employee {
    private String fullName;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public employee(String fullName, String position, String email, int phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info (){
    System.out.printf("ФИО %s Должность %s e-mail %s Телефон %d Зарплата %d Возраст %d\n", fullName, position, email, phone, salary, age);
        }

    public int getAge() {
        return age;
    }
}

