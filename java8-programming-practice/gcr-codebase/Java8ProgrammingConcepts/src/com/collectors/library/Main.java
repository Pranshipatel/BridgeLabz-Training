package com.collectors.library;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		  List<Book> books = Arrays.asList(
	                new Book("Harry Potter", "Fantasy", 450),
	                new Book("Lord of the Rings", "Fantasy", 1200),
	                new Book("The Hobbit", "Fantasy", 310),
	                new Book("Clean Code", "Technology", 464),
	                new Book("Effective Java", "Technology", 412),
	                new Book("The Alchemist", "Fiction", 197),
	                new Book("1984", "Fiction", 328)
	        );
		  
		  Map<String, IntSummaryStatistics> bookStatsByGenre =
	                books.stream()
	                     .collect(Collectors.groupingBy(
	                             Book::getGenre,
	                             Collectors.summarizingInt(Book::getPages)
	                     ));

	        
	        bookStatsByGenre.forEach((genre, stats) -> {
	            System.out.println("Genre: " + genre);
	            System.out.println("Total Pages: " + stats.getSum());
	            System.out.println("Average Pages: " + stats.getAverage());
	            System.out.println("Maximum Pages: " + stats.getMax());
	            System.out.println("---------------------");
	        });

	}

}
