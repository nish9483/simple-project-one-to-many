package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepo extends JpaRepository<Movie ,Integer> {

}
