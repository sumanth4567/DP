import java.util.Scanner;
import src.Choose;
import src.ClimbStairs;
import src.CoinChange;
import src.HouseRobber;
import src.JumpGame;
import src.JumpGameII;
import src.MinPathSum;
import src.UniquePaths;
import src.UniquePathsWithObstacles;

public class HelperClass {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            number = Choose.choose();
            switch (number) {
                case 1:
                    System.out.println("Enter the number of steps to climb : ");
                    int steps = sc.nextInt();
                    int ways = ClimbStairs.climbStairs(steps);
                    System.out.println("You can climb " + steps + " step/s in " + ways + " ways!!!");
                    break;
                case 2:
                    System.out.println("Enter the no of coin values you have in your currency : ");
                    int noOfCoins = sc.nextInt();
                    System.out.println("Now enter the value of those coins :");
                    int coins[] = new int[noOfCoins];
                    for (int i = 0; i < noOfCoins; i++) {
                        coins[i] = sc.nextInt();
                    }
                    System.out.println(
                            "Now enter the amount to see the least possible change required for the amount : ");
                    int amount = sc.nextInt();
                    int minWays = CoinChange.coinChange(coins, amount);
                    System.out.println("You can have minimum " + minWays + " coins for the amount " + amount + "!!!");
                    break;
                case 3:
                    System.out.println("Enter the no of houses present :");
                    int noOfHouses = sc.nextInt();
                    int houseWorth[] = new int[noOfHouses];
                    System.out.println("Enter the values which the houses are worth : ");
                    for (int i = 0; i < noOfHouses; i++) {
                        houseWorth[i] = sc.nextInt();
                    }
                    int maxValueRobbed = HouseRobber.rob(houseWorth);
                    System.out.println(
                            "The total value the robber has robbed without getting caught is : " + maxValueRobbed);
                    break;
                case 4:
                    System.out.println("Enter no of rows and columns of the matrix :");
                    int rows = sc.nextInt();
                    int columns = sc.nextInt();
                    int plot[][] = new int[rows][columns];
                    System.out.println("Enter the value of each plot in the 2D array : ");
                    for (int i = 0; i < plot.length; i++) {
                        for (int j = 0; j < plot[i].length; j++) {
                            plot[i][j] = sc.nextInt();
                        }
                    }
                    int sum = MinPathSum.minPathSum(plot);
                    System.out.println(
                            "The Minimum cost to travel from top left of the matrix to bottom right of the matrix is : "
                                    + sum);
                    break;
                case 5:
                    System.out.println("Enter no of rows and columns of the matrix :");
                    int row = sc.nextInt();
                    int column = sc.nextInt();
                    int plots[][] = new int[row][column];
                    System.out.println("Enter the value of each plot in the 2D array : ");
                    for (int i = 0; i < plots.length; i++) {
                        for (int j = 0; j < plots[i].length; j++) {
                            plots[i][j] = sc.nextInt();
                        }
                    }
                    int sumWithOb = MinPathSum.minPathSum(plots);
                    System.out.println(
                            "The Minimum cost to travel from top left of the matrix to bottom right of the matrix with Obstacles is : "
                                    + sumWithOb);
                    break;
                case 6:
                    System.out.println("Enter no of rows and columns of the matrix :");
                    int r = sc.nextInt();
                    int c = sc.nextInt();
                    int noOfUniquePaths = UniquePaths.uniquePaths(r, c);
                    System.out.println("The no of unique paths to reach bottom right from top left of a " + r + "x" + c
                            + " matrix are : " + noOfUniquePaths);
                    break;
                case 7:
                    System.out.println("Enter no of rows and columns of the matrix :");
                    int rowss = sc.nextInt();
                    int columnss = sc.nextInt();
                    int grid[][] = new int[rowss][columnss];
                    System.out.println("Enter the value of each plot in the 2D array : ");
                    for (int i = 0; i < grid.length; i++) {
                        for (int j = 0; j < grid[i].length; j++) {
                            grid[i][j] = sc.nextInt();
                        }
                    }
                    int noOfUniquePathsWithObstacles = UniquePathsWithObstacles.uniquePathsWithObstacles(grid);
                    System.out.println("The no of unique paths to reach bottom right from top left of a " + rowss + "x"
                            + columnss + " matrix with obstacles are : " + noOfUniquePathsWithObstacles);
                    break;
                case 8:
                    System.out.println("Enter the length of the Array : ");
                    int length = sc.nextInt();
                    int nums[] = new int[length];
                    System.out.println("Enter the elements into the array : ");
                    for (int i = 0; i < nums.length; i++) {
                        nums[i] = sc.nextInt();
                    }
                    boolean canReachEnd = JumpGame.canJump(nums);
                    if (canReachEnd) {
                        System.out.println("We can reach the end of the array with the given array");
                    } else {
                        System.out.println("We cannot reach the end of the array!!");
                    }
                    break;
                case 9:
                    System.out.println("Enter the length of the Array : ");
                    int len = sc.nextInt();
                    int jumpArray[] = new int[len];
                    System.out.println("Enter the elements into the array : ");
                    for (int i = 0; i < jumpArray.length; i++) {
                        jumpArray[i] = sc.nextInt();
                    }
                    int noOfJumps = JumpGameII.jumpGameII(jumpArray);
                    if (noOfJumps >= 0) {
                        System.out.println("We can reach the end of the array with a minimum of " + noOfJumps + " jumps.");
                    } else {
                        System.out.println("We cannot reach the end of the array!!");
                    }
                    break;
                case 10:
                    System.out.println("Exiting.....!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (number != 10);
    }
}
