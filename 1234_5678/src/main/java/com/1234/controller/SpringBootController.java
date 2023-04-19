// Spring Boot Controller class

package com.1234.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.1234.model.ExecutiveMemos;
import com.1234.model.Wholesalers;
import com.1234.service.ExecutiveMemosService;
import com.1234.service.WholesalersService;

@RestController
@RequestMapping("/api")
public class SpringBootController {
	
	@Autowired
	private ExecutiveMemosService executiveMemosService;
	
	@Autowired
	private WholesalersService wholesalersService;
	
	@GetMapping("/executive/{memo}")
	public List<ExecutiveMemos> getExecutiveMemosByMemo(@PathVariable("memo") String memo) {
		return executiveMemosService.findByMemo(memo);
	}
	
	@GetMapping("/executive/date/{dateCreated}")
	public List<ExecutiveMemos> getExecutiveMemosByDateCreated(@PathVariable("dateCreated") String dateCreated) {
		return executiveMemosService.findByDateCreated(dateCreated);
	}
	
	@GetMapping("/executive/dow/{dow}")
	public List<ExecutiveMemos> getExecutiveMemosByDow(@PathVariable("dow") String dow) {
		return executiveMemosService.findByDow(dow);
	}
	
	@GetMapping("/executive/access/{access}")
	public List<ExecutiveMemos> getExecutiveMemosByAccess(@PathVariable("access") boolean access) {
		return executiveMemosService.findByAccess(access);
	}
	
	@GetMapping("/executive/{fieldName}/{descriptionPrompt}")
	public List<ExecutiveMemos> getExecutiveMemosByFieldNameAndDescriptionPrompt(@PathVariable("fieldName") String fieldName, 
			@PathVariable("descriptionPrompt") String descriptionPrompt) {
		return executiveMemosService.findByFieldNameAndDescriptionPrompt(fieldName, descriptionPrompt);
	}
	
	@PostMapping("/executive/delete")
	public void deleteExecutiveMemosByMemo(@RequestBody String memo) {
		executiveMemosService.deleteByMemo(memo);
	}
	
	@GetMapping("/wholesalers/{name}")
	public Wholesalers getWholesalersByName(@PathVariable("name") String name) {
		return wholesalersService.findByName(name);
	}
	
	@GetMapping("/wholesalers/number/{number}")
	public Wholesalers getWholesalersByNumber(@PathVariable("number") String number) {
		return wholesalersService.findByNumber(number);
	}
	
	@GetMapping("/wholesalers/type/{type}")
	public Wholesalers getWholesalersByType(@PathVariable("type") String type) {
		return wholesalersService.findByType(type);
	}
	
	@GetMapping("/wholesalers/contact/{contactName}")
	public Wholesalers getWholesalersByContactName(@PathVariable("contactName") String contactName) {
		return wholesalersService.findByContactName(contactName);
	}
	
	@GetMapping("/wholesalers/email/{emailAddress}")
	public Wholesalers getWholesalersByEmailAddress(@PathVariable("emailAddress") String emailAddress) {
		return wholesalersService.findByEmailAddress(emailAddress);
	}