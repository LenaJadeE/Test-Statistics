package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {

    public static void main(String[] args) {
        // 2 rows times 5 columns equals 10 test scores.
        int[][] scores = {
                {88, 92, 79 ,65, 94},
                {73, 85, 90, 58, 81}
        };

        int sum = 0;
        int high = scores[0][0];
        int low = scores[0][0];
        int count = 0;

        for (int row = 0; row < scores.length; row++) {
            for (int col = 0; col < scores[row].length; col++){
                int score = scores[row][col];

                sum+= score;
                count++;

                if (score > high) {
                    high = score;
                }
                if (score < low) {
                    low = score;
                }
            }
        }








    }
}
// EXERCISE 3
//  Step 1
//      Create a Java application named test-statistics.  Create an array of 10 test scores.
//      Print out the following statistics of your test scores: - - -
//          average
//          high score
//          low score
//  BONUS:  Calculate and display the median value (what is the difference between the average and the median).
//  Step 2
//      1. Ensure all your changes are committed and pushed to GitHub
//      2. Send your repository URL to your Instructor