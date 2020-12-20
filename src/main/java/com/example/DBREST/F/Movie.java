package com.example.DBREST.F;

public class Movie {
	
	private String filmid;
	private String Genre;
	private String Date;
	private String Actor1;
	private String Actor2;
	private String Actor3;
	private String Language;
	private String Diescription;
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(String filmid, String genre, String date, String actor1, String actor2, String actor3, String language,
			String diescription) {
		super();
		this.filmid = filmid;
		Genre = genre;
		Date = date;
		Actor1 = actor1;
		Actor2 = actor2;
		Actor3 = actor3;
		Language = language;
		Diescription = diescription;
	}

	public String getFilmid() {
		return filmid;
	}

	public void setFilmid(String filmid) {
		this.filmid = filmid;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getActor1() {
		return Actor1;
	}

	public void setActor1(String actor1) {
		Actor1 = actor1;
	}

	public String getActor2() {
		return Actor2;
	}

	public void setActor2(String actor2) {
		Actor2 = actor2;
	}

	public String getActor3() {
		return Actor3;
	}

	public void setActor3(String actor3) {
		Actor3 = actor3;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	public String getDiescription() {
		return Diescription;
	}

	public void setDiescription(String diescription) {
		Diescription = diescription;
	}

	@Override
	public String toString() {
		return "Movie [filmid=" + filmid + ", Genre=" + Genre + ", Date=" + Date + ", Actor1=" + Actor1 + ", Actor2="
				+ Actor2 + ", Actor3=" + Actor3 + ", Language=" + Language + ", Diescription=" + Diescription + "]";
	}
	
	
	
}
	





