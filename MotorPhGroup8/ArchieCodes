package payrollsystem.java;

import java.util.Scanner;

public class PayrollSystem {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        long empNum;
        String empName, birthday = null, address = null, phoneNumber = null, SSS = null, Philhealth = null, Pagibig = null, Tin = null, Status = null, Position = null, ImmediateSupervisor = null; 
        float basicSalary = 0, weeklyTime = 0, weeklySalary, overTime;
        float regPay, overtimePay, netPay;

        System.out.print("Enter Employee No.: ");
        empNum = inp.nextLong();
        System.out.printf("Enter Basic Salary:");
        basicSalary = inp.nextLong();
        System.out.println("Enter Weekly Time:");
        weeklyTime = inp.nextLong ();
        

        if (empNum == 10001) {
            empName = "Garcia Manuel";
            birthday = "10 11 1983";
            address = "Valero Carpark Building Valero Street 1227, Makati City";
            phoneNumber = "966-860-270";
            SSS = "44-4506057-3";
            Philhealth = "820126853951";
            Pagibig = "691295330870";
            Tin = "442-605-657-000";
            Status = "Regular";
            Position = "Chief Executive Officer";
            ImmediateSupervisor = "N/A";
    
            // ... (other details)
        } else if (empNum == 10002) {
            empName = "Insert Name";
   
        } else if (empNum == 10003) {
            empName = "insert Name";

        } else {
            empName = "Unknown Employee";
            // ... (other details for unknown employee)
        }

        if (weeklyTime < 100) {
            weeklySalary = weeklyTime;
            regPay = basicSalary * weeklyTime;
            overtimePay = 0;
            netPay = regPay;
        } else {
            weeklySalary = 200;
            overTime = weeklyTime - 40;
            regPay = basicSalary * weeklyTime;
            overtimePay = basicSalary * overTime;
            netPay = regPay + overtimePay;
        }

        System.out.println("-------------------");
        System.out.println("---PAYROLL SYSTEM---");
        System.out.println("-------------------");
        System.out.printf("Employee Number : %d\n", empNum);
        System.out.println("Employee Name : " + empName);
        System.out.println("Birthday : " + birthday);
        System.out.println("Address : " + address);
        System.out.println("PhoneNumber : " + phoneNumber);
        System.out.println("SSS : " + SSS);
        System.out.println("PhilHealth : " + Philhealth);
        System.out.println("Tin : " + Tin);
        System.out.println("Status : " + Status);
        System.out.println("Position : " + Position);
        System.out.println("Immediate Supervisor: " + ImmediateSupervisor);
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("Weekly time : " + regPay);
        System.out.println("Overtime Pay : " + overtimePay);
        System.out.println("Net Pay : " + netPay);
    }
}
