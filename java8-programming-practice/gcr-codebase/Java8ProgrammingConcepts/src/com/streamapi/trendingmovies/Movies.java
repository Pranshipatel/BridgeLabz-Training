package com.streamapi.trendingmovies;

public class Movies {
	String movieName;
	double rating;
	int releaseYear;
	
	
	public Movies(String movieName, double rating, int releaseYear) {
		super();
		this.movieName = movieName;
		this.rating = rating;
		this.releaseYear = releaseYear;
	}
	
	
	public String getMovieName() {
        return movieName;
    }

    public double getRating() {
        return rating;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return movieName + " | Rating: " + rating + " | Year: " + releaseYear;
    }
	

}
