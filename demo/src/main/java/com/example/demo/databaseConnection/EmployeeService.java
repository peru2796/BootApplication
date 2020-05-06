package com.example.demo.databaseConnection;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	public EmployeeDAO objEmployeeDAO;
	
	
//	public Ticket lstGetTicket(Ticket objTicket) throws Exception{
//		return objEmployeeDAO.save(objTicket);
//	}
//	
//	public List<Ticket> getTicket() throws Exception{
//		return (List<Ticket>) objEmployeeDAO.findAll();
//	}
	public List<unit> getUnits() throws Exception{
		return (List<unit>) objEmployeeDAO.findAll();
	}
	
//	public Optional<Ticket> getTicket(int id) throws Exception{
//		return  objEmployeeDAO.findById(id);
//	}
}
