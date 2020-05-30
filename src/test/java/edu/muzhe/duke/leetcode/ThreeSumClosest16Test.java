package edu.muzhe.duke.leetcode;

import edu.muzhe.duke.leetcode.qq50.ThreeSumClosest16;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author muzhe-wang on 2020/5/24.
 */
public class ThreeSumClosest16Test {

    private ThreeSumClosest16 threeSumClosest16 = new ThreeSumClosest16();

    @Test
    public void threeSumClosest() {

        int[] nums = new int[]{-1, 2, 1, -4};
        int target = 1;
        int i = threeSumClosest16.threeSumClosest(nums, target);
        System.out.println(i);
    }
}