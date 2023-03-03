package Strings;

import java.util.Locale;
import java.util.Random;

import static java.lang.StrictMath.random;

public class Employee {
    int EmployeeId;
    String EmployeeName;
    String Department="Sales Department";
    int Experience;
    Integer Salary;
    void employeeIdGeneration()
    {
        Random random=new Random(System.currentTimeMillis());
        EmployeeId= (2*random.nextInt()+1)%100;
    }
    void employeeNameGeneration(int employee)
    {
        Random randomFirstName=new Random(System.currentTimeMillis());
        Random randomLastName=new Random(System.currentTimeMillis()+100000);
        int length=6;
        String chars="";
        if(employee==0)
        chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if(employee==1)
            chars="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if(employee==2)
            chars="abcdefghijklmnopqrstuvwxyz";

        StringBuffer firstName=new StringBuffer(length);
        StringBuffer lastName=new StringBuffer(length);
        int i=1;
        while(i<=length)
        {
                char ch1=chars.charAt(randomFirstName.nextInt(chars.length()));
                char ch2=chars.charAt(randomLastName.nextInt(chars.length()));
                firstName.append(ch1);
                lastName.append(ch2);
                i++;
        }
        EmployeeName=firstName+" "+lastName;
    }
    void getEmployeeName()
    {
        EmployeeName=EmployeeName.toLowerCase();
        String[] str=EmployeeName.split(" ");
        str[0]=str[0].substring(0,1).toUpperCase()+str[0].substring(1);
        str[1]=str[1].substring(0,1).toUpperCase()+str[1].substring(1);
        EmployeeName=str[0]+" "+str[1];
    }
    public Integer getTotalSalaryForDepartment()
    {
        return Salary*Experience;
    }
    void display()
    {
        System.out.println(EmployeeId);
        System.out.println(EmployeeName);
        System.out.println(Department);
        System.out.println(Experience);
        System.out.println(Salary);
        System.out.println();
    }
    public static void main(String args[])
    {
        int minSalary=10000;
        int maxSalary=50000;
        Employee[] employees=new Employee[3];
        for(int i=0;i<3;i++)
        {
            employees[i]=new Employee();
            Random random=new Random(System.currentTimeMillis());
            employees[i].employeeIdGeneration();
            employees[i].Salary=minSalary+random.nextInt(maxSalary-minSalary+1);
            employees[i].Experience=random.nextInt(11)+1;
            employees[i].employeeNameGeneration(i);
            employees[i].getEmployeeName();
            employees[i].getTotalSalaryForDepartment();
            employees[i].display();
        }

    }
}
