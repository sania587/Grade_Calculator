package Calculator;
import java.util.Scanner;
/*Input: Take marks obtained (out of 100) in each subject.
Calculate Total Marks: Sum up the marks obtained in all subjects.
Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
average percentage.
Grade Calculation: Assign grades based on the average percentage achieved.
Display Results: Show the total marks, average percentage, and the corresponding grade to the user*/

public class Student_Grade_Calculator {

	
	//main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true)
		{System.out.println("----------------------------------------------");
		System.out.println("----------------- Calculator -----------------");
		System.out.println("----------------------------------------------");
		System.out.println();
		
		 int numSubjects = getNumSubjects();
	        int totalMarks = getMarks(numSubjects);
	        double averagePercentage = calculateAveragePercentage(totalMarks, numSubjects);
	        String grade = calculateGrade(averagePercentage);
	        displayResults(totalMarks, averagePercentage, grade);
	        System.out.println("----------------------------------------------");
	        System.out.println("Calculate again? (Y/N) or (y/n)");
	        Scanner scanner = new Scanner(System.in);
	        String answer = scanner.next();
	        if(answer=="Y"|| answer=="y")
	        {
	        	//continue
	        }
	        else if(answer=="N"|| answer=="n")
	        {
	         break;
	        }
	        else
	        {
	        	 System.out.println("Invalid input. Back to calulator.");
	        }
	        System.out.println("----------------------------------------------");
		}
	    }

	    private static int getNumSubjects() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("----------------------------------------------");
	        System.out.println("      Enter the total number of subjects: ");
			System.out.println("----------------------------------------------");
			
	      	int numSubjects = scanner.nextInt();
	        while (numSubjects <= 0) {
	            System.out.println("Invalid input. Please enter a positive integer.");
	            System.out.println("----------------------------------------------");
		        System.out.print("      Enter the total number of subjects: ");
				System.out.println("----------------------------------------------");
	            numSubjects = scanner.nextInt();
	        }
	        return numSubjects;
	    }

	    private static int getMarks(int numSubjects) {
	        Scanner scanner = new Scanner(System.in);
	        int totalMarks = 0;
	        String subject="";
	        for (int i = 1; i <= numSubjects; i++) {
	        	 System.out.println("----------------------------------------------");
	 	        System.out.println("      Enter the name of subjects : ");
	 	        subject = scanner.next();
	            System.out.print("Enter marks for subject : " + subject + " out of 100: ");
	            int marks = scanner.nextInt();
	            while (marks < 0 || marks > 100) {
	                System.out.println("Invalid marks. Please enter a value between 0 and 100.");
	                System.out.println("----------------------------------------------");
		 	        System.out.print("      Enter the name of subjects: ");
		 	        subject = scanner.next();
		            System.out.print("Enter marks for subject : " + subject +  " out of 100: ");
	                marks = scanner.nextInt();
	            }
	            totalMarks += marks;
	            System.out.println("----------------------------------------------");
	        }
	        return totalMarks;
	    }

	    private static double calculateAveragePercentage(int totalMarks, int numSubjects) {
	        return (double) totalMarks / numSubjects;
	    }

	    private static String calculateGrade(double averagePercentage) {
	        final int GRADE_THRESHOLD_90 = 90;
	        final int GRADE_THRESHOLD_95 = 95;
	        final int GRADE_THRESHOLD_80 = 80;
	        final int GRADE_THRESHOLD_70 = 70;
	        final int GRADE_THRESHOLD_60 = 60;
	        if (averagePercentage >= GRADE_THRESHOLD_95) {
	        	return "A+";
	        }
	        if (averagePercentage >= GRADE_THRESHOLD_90) {
	            return "A";
	        } else if (averagePercentage >= GRADE_THRESHOLD_80) {
	            return "B";
	        } else if (averagePercentage >= GRADE_THRESHOLD_70) {
	            return "C";
	        } else if (averagePercentage >= GRADE_THRESHOLD_60) {
	            return "D";
	        } else {
	            return "F";
	        }
	    }

	    private static void displayResults(int totalMarks, double averagePercentage, String grade) {
	    	System.out.println();
	    	System.out.println();
	    	System.out.println("----------------------------------------------");
			System.out.println("----------------- Calculation -----------------");
			System.out.println("----------------------------------------------");
	        System.out.println("           Total Marks: " + totalMarks);
	        System.out.println("         Average Percentage: " + averagePercentage + "%");
	        System.out.println("               Grade: " + grade);
			System.out.println("----------------------------------------------");
			System.out.println();
			System.out.println();
	    }
	

}
