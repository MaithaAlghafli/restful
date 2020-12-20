package com.example.DBREST.F;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestHandler {

	@GetMapping("movies")
	public ArrayList<Movie> returnAllUsers(){
		DBController ctrl = new DBController();
		return ctrl.getAllmovies();
	}
	
	@GetMapping("/movies/{moviename}")
	public Movie returnUser(@PathVariable("filmid") String filmid) {
	DBController ctrl = new DBController();
		return ctrl.getmovie(filmid);
	}
	
	
	@PostMapping(value="/movies/add", consumes="application/json", produces="application/json")
	public void Insertmovie(@RequestBody Movie movie) {
		System.out.println(movie.toString());
		DBController ctrl = new DBController();
		ctrl.insertMovie(movie);
	}
	
}
