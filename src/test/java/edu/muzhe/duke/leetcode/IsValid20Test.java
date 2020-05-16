package edu.muzhe.duke.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author muzhe-wang on 2020/5/14.
 */
public class IsValid20Test {

    private IsValid20 isValid20 = new IsValid20();

    @Test
    public void isValid() {

        boolean valid = isValid20.isValid("()");
        Assert.assertTrue(valid);
    }
}