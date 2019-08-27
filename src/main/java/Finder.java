//Github and JUnit Practice
//Two Methods get the max and min int for a given array
//JUnit is used to test the cases
//Done by Henry Roden on 8/25/2019

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class Finder {

    public Integer findMax(int[] intArray) {
        //int maxInt = intArray[0];

        if (intArray == null || intArray.length == 0 ) {
            return null;
        }
        else {
            int maxInt = intArray[0];


            for (int itteration : intArray) {
                if (itteration > maxInt) {
                    maxInt = itteration;
                }
            }

            return maxInt;
        }
    }

    public Integer findMin(int[] intArray) {
        if (intArray == null || intArray.length == 0) {
            return null;
        }
        else {
            int minInt = intArray[0];

            for (int itteration : intArray) {
                if (itteration < minInt) {
                    minInt = itteration;
                }

            }

            return minInt;
        }
    }

    @Test
     public void findMaxTest(){
        int[] a = {4,3,1,3,2,5};
        assertSame(5, findMax(a));

    }

    @Test
    public void findMinTest(){
        int[] a = {4,3,1,3,2,5};
        assertSame(1, findMin(a));

    }

    @Test
    public void findMaxEmptyStringTest(){
        int[] a = {};
        assertNull(findMax(a));

    }

    @Test
    public void findMinEmptyStringTest(){
        int[] a = {};
        assertNull(findMin(a));

    }

    @Test
    public void findMaxNullTest(){
        int[] a = null;
        assertNull(findMax(a));

    }

    @Test
    public void findMinNullTest(){
        int[] a = null;
        assertNull(findMin(a));

    }
}
