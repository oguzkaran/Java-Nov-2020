package org.csystem.app.samples.company;

public class HumanResources {
    //...
    public void payInsurance(Employee employee)
    {
        System.out.println("---------------------");
        System.out.printf("Name:%s%n", employee.getName());
        System.out.printf("Citizen Id:%s%n", employee.getCitizenId());
        //...
        System.out.println("---------------------");
    }
}
