package src;
import java.util.Scanner;
public class Choose {
    @SuppressWarnings("resource")
    public static int choose(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("There are 9 options from 1-9 choose any one to proceed : ");
        System.out.println("Below are the option values :");
        System.out.println("1 . ClimbStairs");
        System.out.println("2 . CoinChange");
        System.out.println("3 . HouseRobber");
        System.out.println("4 . MinPathSum");
        System.out.println("5 . MinPathSumWithObstacles");
        System.out.println("6 . UniquePaths");
        System.out.println("7 . UniquePathsWithObstacles");
        System.out.println("8 . JumpGame");
        System.out.println("9 . Exit");
        System.out.println("Now choose a number from above : ");
        int number  = sc.nextInt();
        return number;
    }
}
