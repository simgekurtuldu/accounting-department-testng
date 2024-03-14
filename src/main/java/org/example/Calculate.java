package org.example;

import lombok.*;
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Calculate {

    String employeeName;
    int numberOfDaysWorked;
    int dailyWage;
    boolean bonus;
    int monthlyBonus;

    public Calculate(String employeeName, int numberOfDaysWorked, int dailyWage){
        this.employeeName = employeeName;
        this.numberOfDaysWorked = numberOfDaysWorked;
        this.dailyWage = dailyWage;
    }

    public void calculateSalary(){
        if(numberOfDaysWorked > 25){
            bonus = true;
            calculateBonus(numberOfDaysWorked);
            System.out.println("Sevgili " + employeeName + " bu ay " + monthlyBonus + " TL prim kazandınız. Tebrikler!");
        }
        System.out.println(employeeName + " çalışanının aylık maaşı: " + dailyWage*numberOfDaysWorked);
        if(bonus){
            System.out.println(employeeName + " çalışanının prim ile birlikte aylık toplam maaşı: " + ((dailyWage*numberOfDaysWorked) + monthlyBonus));
            bonus = false;
        }
    }
    public int calculateBonus( int numberOfDaysWorked){
        return monthlyBonus = (numberOfDaysWorked - 25) * 1000;
    }
}
