package com.ubs.Controller;

import com.ubs.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Employee employee = applicationContext.getBean(Employee.class);
        System.out.println("employee details: " + employee.toString());

    }
}
