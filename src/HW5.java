public class HW5 {

        public static void main(String[] args) {

                employee[] employeeArray = new employee[5];

                employeeArray[0] = new employee("Петр Петров", "Менеджер", "p.petrov@mail.ru", 223322223, 40000, 41);
                employeeArray[1] = new employee("Иванов Иван", "Бухгалтер", "i.ivanov@mail.ru", 223322221, 50000, 38);
                employeeArray[2] = new employee("Сергеев Сергей", "Директор", "s.sergeev@mail.ru", 223322222, 60000, 45);
                employeeArray[3] = new employee("Алексеев Алексей", "Юрисконсульт", "a.alekseev@mail.ru", 223322224, 45000, 35);
                employeeArray[4] = new employee("Андреев Андрей", "Инженер", "a.andreev@mail.ru", 2233222, 50000, 43);

                for (int i = 0; i < employeeArray.length; i++) {
                        if (employeeArray[i].getAge() > 40){
                                employeeArray[i].info();
                        }
                }
        }
}
