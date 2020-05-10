package edu.muzhe.duke.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author muzhe-wang on 2020/5/10.
 */
public class IsPalindrome9Test {

    private IsPalindrome9 isPalindrome9 = new IsPalindrome9();

    @Test
    public void isPalindrome() {

        boolean palindrome = isPalindrome9.isPalindrome(1001);
        Assert.assertTrue(palindrome);
    }
}