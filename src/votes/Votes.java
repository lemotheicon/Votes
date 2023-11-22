/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votes;

/**
 *
 * @author 21267111
 */
import java.util.Scanner;
public class Votes {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String firstStudent,secondStudent,thirdStudent;
       int firstStudentVotes,secondStudentVotes,thirdStudentVotes;
       
         //First student
        System.out.println("Enter the first student name >>");     
        firstStudent = input.nextLine();
        System.out.println("How many votes did student "+firstStudent+" receive?");
        firstStudentVotes = input.nextInt();
        input.nextLine();
        
         //Second student
        System.out.println("Enter the second student name >>");    
        secondStudent = input.nextLine();
        System.out.println("How many votes did student "+secondStudent+" receive?");
        secondStudentVotes = input.nextInt();
        input.nextLine();
        
         //Third student
        System.out.println("Enter the third student name >>");     
        thirdStudent = input.nextLine();
        System.out.println("How many votes did student "+thirdStudent+" receive?");
        thirdStudentVotes = input.nextInt();
        
        VotesApp v = new VotesApp(firstStudent,firstStudentVotes,secondStudent, 
                                  secondStudentVotes,thirdStudent,thirdStudentVotes);
        
        System.out.println();
        v.PrintVotes();
    }
    
}
