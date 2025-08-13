package src;

public class UniquePathsWithObstacles {
    public static int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        if (grid[0][0] == 1) return 0; // Start blocked

        dp[0][0] = 1;

        // Fill first column
        for (int i = 1; i < m; i++) {
            dp[i][0] = (grid[i][0] == 0 && dp[i - 1][0] == 1) ? 1 : 0;
        }

        // Fill first row
        for (int j = 1; j < n; j++) {
            dp[0][j] = (grid[0][j] == 0 && dp[0][j - 1] == 1) ? 1 : 0;
        }

        // Fill rest of dp table
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (grid[i][j] == 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                } else {
                    dp[i][j] = 0; // Obstacle
                }
            }
        }

        return dp[m - 1][n - 1];
    }
}
