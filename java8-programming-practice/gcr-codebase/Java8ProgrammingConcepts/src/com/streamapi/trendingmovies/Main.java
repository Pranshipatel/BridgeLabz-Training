package com.streamapi.trendingmovies;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Movies> movies = Arrays.asList(
		        new Movies("Dhurandar", 3.5, 2026),
		        new Movies("Sultan", 4.0, 2016),
		        new Movies("Bahubali", 4.8, 2015),
		        new Movies("KGF Chapter 1", 4.6, 2018),
		        new Movies("KGF Chapter 2", 4.9, 2022),
		        new Movies("RRR", 4.7, 2022),
		        new Movies("Pushpa", 4.2, 2021),
		        new Movies("Pathaan", 3.9, 2023),
		        new Movies("Jawan", 4.1, 2023)
		       
		);
		
		List<Movies> topMovie = movies.stream().filter(movie -> movie.getRating() >= 4.0 )
				.sorted(Comparator.comparing(Movies:: getRating).reversed()
						.thenComparing(Movies:: getReleaseYear).reversed())
				.limit(5).collect(Collectors.toList());
		
		topMovie.forEach(System.out::println);
		
		

	}

}
