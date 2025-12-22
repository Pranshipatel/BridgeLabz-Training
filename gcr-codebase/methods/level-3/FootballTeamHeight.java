// Program to find shortest, tallest and mean height of football players

import java.util.Arrays;

public class FootballTeamHeight {
	
	   // Method to find sum of heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int i : heights) {
            sum += i;
        }
        return sum;
    }
	

    // Method to find mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }


    // Method to find shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int i : heights) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }


    // Method to find tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int i : heights) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        // Create array for 11 players
        int[] heights = new int[11];

        // Generate heights between 150 and 250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101)+ 150;
        }

        // Print heights of players
        System.out.println("Heights of Players (in cm):");
        System.out.println(Arrays.toString(heights));

        // Calculate results
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        // Print results
        System.out.println("Sum of heights = " + sum);
        System.out.println("Mean height = " + mean);
        System.out.println("Shortest height = " + shortest + "cm");
        System.out.println("Tallest height = " + tallest + "cm");
    }


 
}
