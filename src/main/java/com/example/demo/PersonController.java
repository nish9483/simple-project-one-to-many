package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@Autowired
	private PersonRepo pr;
	
/*	
	@PostMapping("/person")
	public ResponseEntity<Person>savePerson(@RequestBody Person person)
	{
		Person g=pr.save(person);
		return new ResponseEntity<Person>(g,HttpStatus.CREATED);
	}*/
	
	
	@GetMapping("/person")
	public List<Person>getPageOne()
	{
		Pageable p=PageRequest.of(0,2,Sort.by("id").ascending());
		Page<Person>o=pr.findAll(p);
		return o.getContent();
	}
	
	/*@PutMapping("/person/{id}")
	public ResponseEntity<Person>updatePerson(@RequestBody Person person,@PathVariable int id)
	{
Optional<Person>u=pr.findById(id);
if(u.isPresent())
{
	Person t=u.get();
	t.setName(person.getName());
	t.setAddress(person.getAddress());
	Person m=pr.save(t);
	return new ResponseEntity<Person>(m,HttpStatus.OK);
}
else
{
	return new ResponseEntity<Person>(HttpStatus.OK);
}
}
	   @DeleteMapping("/person/{id}")
	   public ResponseEntity<Void>deletePerson(@PathVariable int id)
		{
	Optional<Person>u=pr.findById(id);
	if(u.isPresent())
	{
		pr.deleteById(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	else
	{
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	}*/
	   
}