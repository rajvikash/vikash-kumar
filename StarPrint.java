/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package star.print;

/**
 *
 * @author Vikash Kumar
 */
public class StarPrint {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args){
        int i;
        int j;
       for(i=1; i<4; i++)// for rows
        {
            for(j=1; j<=i; j++)//for columns
            {
                System.out.print("*");
                
            }
            System.out.println();
        }
       for(i=1; i<=4; i++)
       {
            for(j=4; j>=i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
            
            
            }
       }
        // TODO code application logic here
    }
    

