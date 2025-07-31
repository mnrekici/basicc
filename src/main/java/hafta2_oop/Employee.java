package hafta2_oop;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee (String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if(salary<1000) {
            return 0;
        }else {
            return salary * 0.03;
        }
    }

    public double bonus(){
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30;
        } else {
            return 0;
        }
    }
    public double raiseSalary() {
        int currentYear = 2021;
        int yearsWorked = currentYear - hireYear;

        if (yearsWorked < 10) {
            return salary * 0.05;
        } else if (yearsWorked < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();

        double salaryWithBonusTax = salary - tax + bonus;
        double totalSalary = salary + raise;

        return "Adı : " + name +
                "\nMaaşı : " + salary +
                "\nÇalışma Saati : " + workHours +
                "\nBaşlangıç Yılı : " + hireYear +
                "\nVergi : " + tax +
                "\nBonus : " + bonus +
                "\nMaaş Artışı : " + raise +
                "\nVergi ve Bonuslar ile birlikte maaş : " + salaryWithBonusTax +
                "\nToplam Maaş : " + totalSalary;
    }
}


