package io.github.joaomlneto.travis_ci_tutorial_java;

public class CalcDriver {
	public static final void main(String[] args) {
		SimpleCalculator myCalc = new SimpleCalculator();
		int mynum = 17;
		
		mynum = myCalc.mul(mynum, 3);
		mynum = myCalc.mul(mynum, 7);
		mynum = myCalc.mul(mynum, 13);
		mynum = myCalc.mul(mynum, 37);
		
		System.out.println("mynum: " + mynum);
	}
}
