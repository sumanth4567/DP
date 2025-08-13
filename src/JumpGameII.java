package src;

public class JumpGameII {
    public static int jumpGameII(int nums[]){
        if(nums.length <= 1){
            return 0;
        }
        if(nums[0] == 0){
            return -1;
        }
        if(nums[0] >= nums.length-1){
            return 1;
        }
        int jumps = 0;
        int currentEnd = 0;
        int farthestEnd = 0;
        for (int i = 0; i < nums.length; i++) {
            farthestEnd = Math.max(farthestEnd, i+nums[i]);
            if(i == currentEnd){
                jumps++;
                currentEnd=farthestEnd;
            }
            if(currentEnd >= nums.length-1){
                break;
            }
        }
        return jumps;
    }
}
