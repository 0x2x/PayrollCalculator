package org.nigel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    static void main() {
        try {
            FileReader fileReader = new FileReader("src/main/data.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);
            String input;

            while((input = bufReader.readLine()) != null) {

                String[] inputParse = input.split("\\|");
                String UserId = inputParse[0];
                String UserName = inputParse[1];
                String HoursWorked = inputParse[2];
                String PayRate = inputParse[3];

                Employee employee = new Employee(Integer.parseInt(UserId), UserName, Double.parseDouble(HoursWorked), Double.parseDouble(PayRate));

                System.out.println("====Employee Data====");
                System.out.printf("\tName: %s\n", employee.getName());
                System.out.printf("\tUser ID: %s\n", employee.getEmployeeId());
                System.out.printf("\tHours Worked: %s\n", employee.getHoursWorked());
                System.out.printf("\tPay Rate: %s\n", employee.getPayRate());
                System.out.printf("\tGross Pay: %s\n", employee.getGrossPay());
                System.out.println();
            }
            bufReader.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
