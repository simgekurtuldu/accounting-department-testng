package org.example;

public class AccountingDepartment {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        calculate.setEmployeeName("Simge");
        calculate.setNumberOfDaysWorked(30);
        calculate.setDailyWage(350);

        calculate.calculateSalary();

    }
}
