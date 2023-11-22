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
import java.util.Random;
public class VotesApp 
{
    private String firstStudent,secondStudent,thirdStudent;
    private int firstStudentVotes,secondStudentVotes,thirdStudentVotes;
    private double averageVotes;
    
    public VotesApp(String firstStudent, int firstStudentVotes,String secondStudent, 
                    int secondStudentVotes,String thirdStudent, int thirdStudentVotes)
       {
         this.firstStudent = firstStudent;  
         this.firstStudentVotes = firstStudentVotes;
         this.secondStudent = secondStudent;
         this.secondStudentVotes = secondStudentVotes;
         this.thirdStudent = thirdStudent;
         this.thirdStudentVotes = thirdStudentVotes;
       }
    
    private double CalculateTotalVotes()
     {
        return(this.firstStudentVotes + this.secondStudentVotes + this.thirdStudentVotes);
     }   
    private double CalculateAverageVotes()
      {
        return(this.firstStudentVotes + this.secondStudentVotes + this.thirdStudentVotes);
      }      
    private int VotingReferenceNumber()
      {
          Random rnd = new Random();
          return rnd.nextInt(1000);
      }
    public void PrintVotes()
      {
          System.out.println("STUDENT COUNCIL VOTING REPORT");
          System.out.println("*****************************");
          System.out.println("REF#" + VotingReferenceNumber());
          System.out.println("STUDENT 1:" + firstStudent);
          System.out.println("VOTES:" + firstStudentVotes);
          System.out.println("STUDENT 2:" + secondStudent);
          System.out.println("VOTES:" + secondStudentVotes);
          System.out.println("STUDENT 3:" + thirdStudent);
          System.out.println("VOTES:" + thirdStudentVotes);
          System.out.println("TOTAL VOTES:" + CalculateTotalVotes());
          System.out.println("AVERAGE VOTES:" + CalculateAverageVotes());
          System.out.println("*******************************");
          
          if(CalculateTotalVotes()>=150)
              {
                  System.out.println("GOOD VOTING ATTENDENCE");
              }
          else
              {
                  System.out.println("POOR VOTING ATTENDENCE");
              }
             System.out.println("***************************************");
      }
    
    
}
