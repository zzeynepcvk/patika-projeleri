public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int yearsOfWork = 2021 - hireYear;
        if (yearsOfWork < 10) {
            return salary * 0.05;
        } else if (yearsOfWork >= 10 && yearsOfWork < 20) {
            return salary * 0.1;
        } else {
            return salary * 0.15;
        }
    }

    public double getTotalSalary() {
        return salary + bonus() - tax() + raiseSalary();
    }

    @Override
    public String toString() {
        return "Adı: " + name + "\n"
                + "Maaşı: " + salary + "\n"
                + "Çalışma Saati: " + workHours + "\n"
                + "Başlangıç Yılı: " + hireYear + "\n"
                + "Vergi: " + tax() + "\n"
                + "Bonus: " + bonus() + "\n"
                + "Maaş Artışı: " + raiseSalary() + "\n"
                + "Vergi ve Bonuslar ile birlikte maaş: " + getTotalSalary() + "\n"
                + "Toplam Maaş: " + (salary + raiseSalary());
    }
}
