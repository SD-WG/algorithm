package edu.muzhe.duke.leetcode;

import edu.muzhe.duke.leetcode.qq50.FindKthLargest215;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author muzhe-wang on 2020/5/19.
 */
public class FindKthLargest215Test {

    private FindKthLargest215 findKthLargest215 = new FindKthLargest215();

    @Test
    public void findKthLargest() {
        int[] nums = new int[]{3, 2, 1, 5, 6, 4};
        int kthLargest = findKthLargest215.findKthLargest(nums, 2);

        System.out.println(kthLargest);
    }
}