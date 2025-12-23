// Program to create, shuffle, and distribute a deck of cards

import java.util.Scanner;

public class DeckOfCards {

    // Create deck
    public static String[] calculateDeckOfCards(String[] ranks, String[] suits) {
        int numOfCards = ranks.length * suits.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index++] = ranks[j] + " of " + suits[i];
            }
        }
        return deck;
    }

    // Shuffle deck
    public static String[] shuffleDeckOfCards(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + (int)(Math.random() * (deck.length - i));

            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
        return deck;
    }

    // Distribute cards
    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {

        if (players * cardsPerPlayer > deck.length) {
            return null;
        }

        String[][] distributed = new String[players][cardsPerPlayer];
        int index = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                distributed[i][j] = deck[index++];
            }
        }
        return distributed;
    }

    // Display cards
    public static void display(String[][] distributedCards) {
        for (int i = 0; i < distributedCards.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < distributedCards[i].length; j++) {
                System.out.println("  " + distributedCards[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        String[] ranks = {"2","3","4","5","6","7","8","9",
                          "10","Jack","Queen","King","Ace"};

        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};

        String[] deck = calculateDeckOfCards(ranks, suits);
        deck = shuffleDeckOfCards(deck);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int players = input.nextInt();

        System.out.print("Enter cards per player: ");
        int cards = input.nextInt();

        String[][] distributedCards = distributeCards(deck, players, cards);

        if (distributedCards == null) {
            System.out.println("Not enough cards to distribute.");
        } else {
            display(distributedCards);
        }

        input.close();
    }
}
