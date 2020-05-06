package com.example.demo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.databaseConnection.EmployeeService;
import com.example.demo.databaseConnection.Ticket;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext applicationContext=SpringApplication.run(DemoApplication.class, args);
//		String[] lst=applicationContext.getBeanDefinitionNames();
//		for(String objString:lst) {
//			System.out.println(objString);
//		}
//		EmployeeService objEmployee=applicationContext.getBean("employeeService", EmployeeService.class);
//		Ticket objTicket = new Ticket();
//		objTicket.setSticketName("Peru");
//		objTicket.setNstatus(1);
//		objTicket.setSbookeddate(new Date());
//		objTicket.setNticketID(1);
//		objTicket=objEmployee.lstGetTicket(objTicket);
//		System.out.println(objTicket.getSticketName());
	}
	

}
