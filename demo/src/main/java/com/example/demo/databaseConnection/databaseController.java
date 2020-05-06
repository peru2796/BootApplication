package com.example.demo.databaseConnection;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Ticket")
public class databaseController {
	@Autowired
	public EmployeeService EmployeeService;
	
//	@PostMapping(value = "/getTickets")
//	public List<Ticket> getTickets() throws Exception {
//		return EmployeeService.getTicket();
//	}
//	
//	@PostMapping(value = "/getWholeTickets/{ticketid}")
//	public Optional<Ticket> getTickets(@PathVariable("ticketid")Integer ticketid) throws Exception {
//		return EmployeeService.getTicket(ticketid);
//	}
//	@PostMapping(value = "/InsertTicket")
//	public Ticket InsertTicket(@RequestBody Ticket objTicket) throws Exception {
//		return (Ticket) EmployeeService.lstGetTicket(objTicket);
//	}
	@GetMapping(value = "/getUnits")
	public List<unit> getUnits() throws Exception {
		return EmployeeService.getUnits();
	}
}
