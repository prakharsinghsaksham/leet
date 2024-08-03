class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        
       int maxScore = Integer.MIN_VALUE;
        int maxI = values[0]; // Initialize maxI with the value of values[0] + 0
        
        for (int j = 1; j < values.length; j++) {
            // Calculate the score for the current pair (maxI, j)
            int currentScore = maxI + values[j] - j;
            // Update maxScore if the current score is greater
            maxScore = Math.max(maxScore, currentScore);
            // Update maxI for the next iteration
            maxI = Math.max(maxI, values[j] + j);
        }
        
        return maxScore;
    }
}