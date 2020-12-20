package com.example.DBREST.F;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class DBController {

	
	public ArrayList<Movie> getAllmovies(){
		ArrayList<Movie> movies = new ArrayList<Movie>();
		
		try {
			
			Connection con = DatabaseConnection.initializeDatabase();	//
			Statement stmt = con.createStatement();	//
			
			String sql = "SELECT * FROM movies";
			ResultSet rs = stmt.executeQuery(sql);	//
			
			while(rs.next()) {
				String filmid = rs.getString("filmid");
				String genre = rs.getString("Genre");
				String date = rs.getString("Date");
				String actor1 = rs.getString("Actor1");
				String actor2 = rs.getString("Actor2");
				String actor3 = rs.getString("Actor3");
				String lang = rs.getString("Language");
				String diesc = rs.getString("Diescription");
				
				Movie movie = new Movie(filmid, genre, date, actor1, actor2, actor3, lang, diesc );
				movies.add(movie);
			}
			
			con.close();
			
		}catch( Exception e) { e.printStackTrace();}
		
		return movies;
	}
	
	public boolean insertMovie(Movie movie) {
		boolean inserted = false;

		try {

			Connection con = DatabaseConnection.initializeDatabase();	//
			Statement stmt = con.createStatement();	//
			String sql = String.format("INSERT INTO movies VALUES('%s','%s','%s','%s','%s','%s','%s','%s')",movie.getFilmid(),movie.getGenre(),movie.getDate(),movie.getActor1(),movie.getActor2(),movie.getActor3(),movie.getLanguage(),movie.getDiescription());
			int result = stmt.executeUpdate(sql);
			
			if(result == 1) inserted = true;
			
			con.close();
		}catch( Exception e) { e.printStackTrace(); }
		
		return inserted;
	}
	

	public Movie getmovie(String filmid) {
		Movie movie = new Movie();
		
		try {
			
			Connection con = DatabaseConnection.initializeDatabase();	//
			Statement stmt = con.createStatement();	//
			
			String sql = String.format("SELECT * FROM movies WHERE filmid  = '%s ", filmid);
			ResultSet rs = stmt.executeQuery(sql);	//
			
			System.out.println("sql");
			
			while(rs.next()) {
				String filmsid = rs.getString("filmid");
				String genre = rs.getString("Genre");
				String date = rs.getString("Date");
				String actor1 = rs.getString("Actor1");
				String actor2 = rs.getString("Actor2");
				String actor3 = rs.getString("Actor3");
				String lang = rs.getString("Language");
				String diesc = rs.getString("Diescription");
				
				
				movie.setFilmid(filmsid);
				movie.setGenre(genre);
				movie.setDate(date);
				movie.setActor1(actor1);
				movie.setActor2(actor2);
				movie.setActor3(actor3);
				movie.setLanguage(lang);
				movie.setDiescription(diesc);
			}
			
			con.close();
			
		}catch( Exception e) { e.printStackTrace();}
		
		return movie;
	}
	
}

		