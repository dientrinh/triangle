package com.example.triangle;
/**
 * Created by dien.tv on 11/5/2015.
 * @author dien.tv
 * @version 1.0
 * To-do list
 * - Constructor
 * - check triangle type
 * - check is valid triangle
 * - check negative number
 * - check is valid side length of triangle
 * Copyright 2013 Technologic Arts VietNam
 * All Right Reserve
 */
public class Triangle extends Constant {

    private int firstSide;
    private int secondSide;
    private int thirdSide;
    /**
     * init values for param
     */
    public Triangle(int firstSide, int secondSide, int thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    /**
     * check triangle type
     * @return
     * - 0 -> not triangle
     * - 1 -> equilateral triangle
     * - 2 -> isosceles triangle
     * - 3 -> scalene triangle
     */
    public int checkTriangleType(){
        try {
			if(isValidTriangle()){
			    if((firstSide == secondSide)&&(firstSide == thirdSide)){    //all sides are equal
			        return 1;
			    }else{
			        if((firstSide == secondSide)||(firstSide == thirdSide)||(secondSide == thirdSide)){ //any qwo sides is equal
			            return 2;
			        }else{
			            return 3;
			        }
			    }
			}else{
		        return ERROR001;
			}
		} catch (TriangleException e) {
			// TODO Auto-generated catch block
			return ERROR001;
		}

    }
    /**
     * check valid triangle
     * @return true if is triangle; false is not triangle
     */
    private boolean isValidTriangle() throws TriangleException{
        if(isValidSide(firstSide, secondSide, thirdSide) && isValidSideLength(firstSide, secondSide, thirdSide)){
            return true;
        }
        else{
            throw new TriangleException("side is negative value");
        }
    }
    /**
     * check valid sidle
     * @return true if all side is valid
     */
    private boolean isValidSide(int firstSide, int secondSide, int thirdSide){
        return !(isNegativeNumber(firstSide) || isNegativeNumber(secondSide) || isNegativeNumber(thirdSide));
    }
    /**
     * check negative number
     * @return true if side>0
     */
    private boolean isNegativeNumber(int side){
        return side <= 0 ;
    }
    /**
     * check valid sidle
     * @return true if all side is valid
     */
    private boolean isValidSideLength(int firstSide, int secondSide, int thirdSide) throws TriangleException{
        if((firstSide+secondSide<=thirdSide)||(firstSide+thirdSide<=secondSide)||(thirdSide+secondSide<=firstSide)){ //check valid side. in a triangle any side have to be less than sum of other two sides
            throw new TriangleException("Illegal side length input");
        }else{
            return true;
        }
    }

}
