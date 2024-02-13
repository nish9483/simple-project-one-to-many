package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
public class MovieController {
	
	@Autowired
	private MovieRepo mr;
	
	
	/*@PostMapping("/movie")
	public ResponseEntity<Movie>saveMovie(@RequestBody Movie movie)
	{
		Movie g=mr.save(movie);
		return new ResponseEntity<Movie>(g,HttpStatus.CREATED);
	}*/
	
	
	@GetMapping("/movie")
	public List<Movie>getPageTwo()
	{
		Pageable p=PageRequest.of(0,2,Sort.by("id").ascending());
		Page<Movie>o=mr.findAll(p);
		return o.getContent();
	}
	
	/*@PutMapping("/movie/{id}")
	public ResponseEntity<Movie>updateMovie(@RequestBody Movie movie,@PathVariable int id)
	{
Optional<Movie>u=mr.findById(id);
if(u.isPresent())
{
	Movie t=u.get();
	t.setMoviename(movie.getMoviename());
	t.setSeatno(movie.getSeatno());
	Movie m=mr.save(t);
	return new ResponseEntity<Movie>(m,HttpStatus.OK);
}
else
{
	return new ResponseEntity<Movie>(HttpStatus.OK);
}
}
	   @DeleteMapping("/movie/{id}")
	   public ResponseEntity<Void>deleteMovie(@PathVariable int id)
		{
	Optional<Movie>u=mr.findById(id);
	if(u.isPresent())
	{
		mr.deleteById(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	else
	{
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	}*/
	   
}


