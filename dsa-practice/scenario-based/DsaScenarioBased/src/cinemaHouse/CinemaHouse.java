package cinemaHouse;

public class CinemaHouse {
	public static void bubbleSort(MovieShow[] shows) {
        int n = shows.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (shows[j].showTime > shows[j + 1].showTime) {
                    
                    MovieShow temp = shows[j];
                    shows[j] = shows[j + 1];
                    shows[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        MovieShow[] shows = {
            new MovieShow("Avatar", 18.30),
            new MovieShow("Inception", 14.00),
            new MovieShow("Titanic", 10.30),
            new MovieShow("Joker", 21.00),
            new MovieShow("Interstellar", 16.00)
        };

        bubbleSort(shows);

        System.out.println("Sorted Movie Shows by Time:");
        for (MovieShow show : shows) {
            System.out.println(show.movieName + " - " + show.showTime);
        }
    }
	

}
