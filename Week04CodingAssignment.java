package week04;

import java.lang.reflect.Array;

public class Week04CodingAssignment {

	public static void main(String[] args) {
//1		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		System.out.println(ages[ages.length - 1] - ages[0]);

		int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(ints[ints.length - 1] - ints[0]);
		
		double sumOfAges = 0;
		for (Integer digits : ages) {
			sumOfAges += digits;
		}
		System.out.println("Answer for problem 1:");
		System.out.println(sumOfAges);
		System.out.println(sumOfAges  / ages.length);
		System.out.println("Answer for problem 2:");

//2
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		double sumOfNamesLengths = 0;
		for (String string : names) {
			sumOfNamesLengths += string.length();
		}
		System.out.println(sumOfNamesLengths);
		System.out.println(sumOfNamesLengths / names.length);
		System.out.println("Answer for problem 3:");
		
//3
		System.out.println(ages[ages.length - 1]);
		System.out.println(ints[ints.length - 1]);
		System.out.println("Answer for problem 4:");
		
//4
		System.out.println(ages[0]);
		System.out.println(ints[0]);
		System.out.println("Answer for problem 5:");
		
//5
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
			}
		for (int length : nameLengths) {
			System.out.println(length);
		}
		System.out.println("Answer for problem 6:");
//6
			int sumOfNameLengths = 0;
			for (int lengthOfNameLengths : nameLengths) {
				sumOfNameLengths += lengthOfNameLengths;
			}
			System.out.println(sumOfNameLengths);
			System.out.println("Answer for problem 7:");
			
//7
			System.out.println(concatenatedStrings("Hello", 3));
			System.out.println("Answer for problem 8:");
			
//8
			System.out.println(fullName("Kevin", "Dinh"));
			System.out.println("Answer for problem 9:");

//9
			System.out.println(sumOfIntsGreaterThanAHundred(ages));
			System.out.println(sumOfIntsGreaterThanAHundred(ints));
			System.out.println("Answer for problem 10:");
			
//10
			double[] findTheAverage = { 2.0, 2.5, 3.5, 4.0};	//sum of array is 12, with 4 elements
			System.out.println(averageOfArray(findTheAverage));
			System.out.println("Answer for problem 11:");
			
//11
			double[] firstBoolean = {1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0}; 
			double[] secondBoolean = {0.5, 1.0, 1.5, 2.0, 2.5, 3.0};
			System.out.println(greaterAverage(firstBoolean, secondBoolean));
			System.out.println("Answer for problem 12:");
			
//12
			System.out.println(willBuyDrink(true, 20));			//first day		hot and have money
			System.out.println(willBuyDrink(true, 5.20));		//second day	hot but no money
			System.out.println(willBuyDrink(false, 15.50));		//fifth day		cold but have money
			System.out.println("Answer for problem 13:");
			
//13
//prompt: Write a method that takes the inputs of boolean student status, boolean is available, double low amounts of school work
// 			per week, and is financially stable for the duration of school, return a true if conditions are in favor to work, else, return false;
			
			System.out.println(shouldAStudentHaveAJob(true, true, 20.00, 150.00)); //is a student, is available to work, low school work load, not financially stable -- meets all conditions to work
			System.out.println(shouldAStudentHaveAJob(true, false, 15.00, 200.00)); //is a student, but has to take care of a very ill child for a month, low school work load,not financially stable -- not available to work
			System.out.println(shouldAStudentHaveAJob(true, true, 15.00, 10000.00)); //is a student, is available to work, low school work load, financially stable -- focus on education
			System.out.println(shouldAStudentHaveAJob(false, true, 0.00, 100.00)); //is not a student, should work
	
		}
//13
		public static boolean shouldAStudentHaveAJob(boolean isStudent, boolean availability, double schoolWork, double balance) {
			if ((availability == true && schoolWork <= 20.00 && balance < 350) || (isStudent == false)){
				return true;
			} else {
				return false;
			}
		}
//12
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			if (isHotOutside == true && moneyInPocket > 10.50) {
				return true;
			} else {
				return false;
			}
		}
	
//11	
		public static boolean greaterAverage(double[] first, double[] second) {	
			double averageOfFirst = averageOfArray(first);
			double averageOfSecond = averageOfArray(second);
			
			if(averageOfFirst > averageOfSecond) {
				return true;
			} else {
				return false;
			}
		}

//10
		public static double averageOfArray(double[] array) {
			double sum = 0;
			for (double unit : array) {
				sum += unit;
			}
			return sum / array.length;
		}
	
//9
	public static boolean sumOfIntsGreaterThanAHundred(int[] array) {
		int sum = 0;
		for (int integer : array) {
			sum += integer;
		}
		if (sum <= 100) {
			return false;
		} else {
			return true;
		}
	}
	
//8
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
//7
	 public static String concatenatedStrings(String word, int n) {
		 String results = "";
		 for (int i = 0; i < n; i++) {
			 results += word;
		 }
		 return results;
  }
	
}


