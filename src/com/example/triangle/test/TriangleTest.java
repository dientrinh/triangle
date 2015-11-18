package com.example.triangle.test;

import com.example.triangle.Constant;
import com.example.triangle.Triangle;
import com.example.triangle.TriangleException;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by dien.tv on 11/5/2015.
 * @author dien.tv
 * @version 1.0
 * To-do list
 * - all sides are negative
 * - all sides are zero
 * - one of sides is zero
 * - one of sides is negative
 * - two sides are negative
 * - two sides are zero
 * - one side is bigger sume of remaining two sides
 * - is equilateral triangle
 * - is isosceles triangle
 * - is scalene triangle
 * Copyright 2013 Technologic Arts VietNam
 * All Right Reserve
 */
public class TriangleTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}
	 /**
     * test case: inputting all sides are negative
     * Should throw an TriangleException side is negative value
     */
    public void testAllSidesAreNegative() throws TriangleException {
        Triangle triangle = new Triangle(-1,-2,-3);
        Assert.assertEquals(Constant.ERROR001,triangle.checkTriangleType());
    }
    /**
     * test case: inputting all sides are negative
     * Should throw an TriangleException side is negative value
     */
    public void testAllSidesAreZero() throws TriangleException {
        Triangle triangle = new Triangle(0,0,0);
        Assert.assertEquals(Constant.ERROR001,triangle.checkTriangleType());
    }
    /**
     * test case: inputting all sides are negative
     * Should throw an TriangleException side is negative value
     */
    public void testOneSideIsZero() throws TriangleException {
        Triangle triangle = new Triangle(0,2,3);
        Assert.assertEquals(Constant.ERROR001,triangle.checkTriangleType());
    }
    /**
     * test case: inputting all sides are negative
     * Should throw an TriangleException side is negative value
     */
    public void testOneSideIsNegative() throws TriangleException {
        Triangle triangle = new Triangle(-1,2,3);
        Assert.assertEquals(Constant.ERROR001,triangle.checkTriangleType());
    }
    /**
     * test case: inputting all sides are negative
     * Should throw an TriangleException side is negative value
     */
    public void testTwoSideAreZero() throws TriangleException {
        Triangle triangle = new Triangle(0,2,0);
        Assert.assertEquals(Constant.ERROR001,triangle.checkTriangleType());
    }
    /**
     * test case: inputting all sides are negative
     * Should throw an TriangleException side is negative value
     */
    public void testTwoSidesAreNegative() throws TriangleException {
        Triangle triangle = new Triangle(-1,-2,3);
        Assert.assertEquals(Constant.ERROR001,triangle.checkTriangleType());
    }
    /**
     * test case: inputting all sides are negative
     * Should throw an TriangleException. Illegal side length input
     */
    public void testOneSideBiggerSumOfTwoSides() throws TriangleException {
        Triangle triangle = new Triangle(1,2,4);
        Assert.assertEquals(Constant.ERROR001,triangle.checkTriangleType());
    }
    /**
     * test case: Equilateral Triangle
     * Should return 1
     */
    public void testIsEquilateralTriangle() throws TriangleException {
        Triangle triangle = new Triangle(1,1,1);
        Assert.assertEquals(1,triangle.checkTriangleType());
    }
    /**
     * test case: Isosceles Triangle
     * Should return 2
     */
    public void testIsIsoscelesTriangle() throws TriangleException {
        Triangle triangle = new Triangle(2,2,3);
        Assert.assertEquals(2,triangle.checkTriangleType()); 
    }
    /**
     * test case: Scalene Triangle
     * Should return 3
     */
    public void testIsScaleneTriangle() throws TriangleException {
        Triangle triangle = new Triangle(5,6,7);
        Assert.assertEquals(4,triangle.checkTriangleType());
    }
}
