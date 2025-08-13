package src;

public class JumpGame {
    public static boolean canJump(int[] nums) {
        if (nums.length <= 1) return true;
        if (nums[0] == 0) return false;

        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) return false; // stuck
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= nums.length - 1) return true; // goal reached
        }
        return false;
    }
}
