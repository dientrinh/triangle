package com.example.triangle.test;

import com.example.triangle.Addition;
import com.example.triangle.Constant;
import com.example.triangle.TriangleException;

import junit.framework.Assert;
import junit.framework.TestCase;

public class AdditionTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}
	 /**
     * test case: inputting all sides are negative
     * Should throw an TriangleException side is negative value
     */
    public void testShouldReturnSumOfTwoNumber() throws TriangleException {
        Addition ad=new Addition();
        Assert.assertEquals(Constant.ERROR001, ad.additionNumber(2, 3));
    }
}
