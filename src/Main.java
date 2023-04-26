public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        Employee employee1= new Employee ("Михайлов Михаил Викторович", 1, 20000 );
        Employee employee2= new Employee ("Федотов Кирилл Алексеевич", 2, 30000 );
        Employee employee3= new Employee ("Сргеев Арсений Иванович", 1, 40000 );
        Employee employee4= new Employee ("Артемиев Никита Олегович", 3, 50000 );
        Employee employee5= new Employee ("Михайлов Александр Осипович ", 4, 60000 );
        Employee employee6= new Employee ("Иванов Михаил Михайлович", 5, 70000 );
        Employee employee7= new Employee ("Измайлов Даниил Станиславович", 5, 80000 );
        Employee employee8= new Employee ("Иванов Иван Иванович", 3, 90000 );
        Employee employee9= new Employee ("Михайлов Виктор Михайлович", 2, 10000 );
        Employee employee10= new Employee ("Сергеев Сергей Олегович ", 4, 200000 );

        employees[0]=employee1;
        employees[1]=employee2;
        employees[2]=employee3;
        employees[3]=employee4;
        employees[4]=employee5;
        employees[5]=employee6;
        employees[6]=employee7;
        employees[7]=employee8;
        employees[8]=employee9;
        employees[9]=employee10;

        System.out.println("Получить список всех сотрудников со всеми имеющимися по ним данными ");
        printAllEmployees(employees);
        System.out.println("Сумма затрат на зарплаты в месяц " );
        printSum(employees);
        System.out.println("Найти сотрудника с минимальной зарплатой ");
        printEmployeeWithMinSalary(employees);
        System.out.println("Найти сотрудника с максимальной зарплатой ");
        printEmployeeWithMaxSalary(employees);
        System.out.println("Подсчитать среднее значение зарплат ");
        printAverageSalary(employees);
        System.out.println("Получить Ф. И. О. всех сотрудников ");
        printFIO(employees);

    }
    private static void printAllEmployees(Employee[] employees){
        for (Employee i: employees){
            System.out.println(" Cписок всех сотрудников со всеми имеющимися по ним данными "+ i);
        }
    }
    private static void printSum(Employee[] employees){
        int sum=0;
        for (Employee i: employees){
            sum +=i.getSalary();
        }
        System.out.println("Cуммa затрат на зарплаты в месяц" + sum);
    }
    private static void printEmployeeWithMinSalary(Employee[] employees){
        Employee employeeWithMinSalary = employees[0];
        for (Employee i: employees){
            if (i.getSalary()< employeeWithMinSalary.getSalary()){
                employeeWithMinSalary=i;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой" + employeeWithMinSalary);
    }
    private static void printEmployeeWithMaxSalary(Employee[] employees){
        Employee employeeWithMaxSalary = employees[0];
        for (Employee i: employees){
            if (i.getSalary()> employeeWithMaxSalary.getSalary()){
                employeeWithMaxSalary=i;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой" + employeeWithMaxSalary);
    }
    private static void printAverageSalary(Employee[] employees){
        int sum=0;
        for (Employee i: employees){
            sum +=i.getSalary();
        }
        double averageSum= (double) sum / employees.length;
        System.out.println("Средняя зарплата " + averageSum);
    }
    private static void printFIO(Employee[] employees){
        for (Employee i: employees){
            System.out.println(i.getFIO());
        }
    }

}