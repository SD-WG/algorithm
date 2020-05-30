package edu.muzhe.duke.leetcode;

import edu.muzhe.duke.leetcode.qq50.IsValid20;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

    @Test
    public void testToArray() {

        Object nums = new short[]{1, 2, 3, 4};

        Class<?> componentType = nums.getClass().getComponentType();
        System.out.println(componentType);

        if (componentType == int.class) {
            int[] numArray = (int[]) nums;

            for (Object obj : numArray) {
                System.out.println(obj);
            }
        }

        Object[] object = (Object[]) nums;
        System.out.println(object.length);


    }
}