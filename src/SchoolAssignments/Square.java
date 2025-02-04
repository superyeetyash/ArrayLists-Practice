package SchoolAssignments;// ****************************************************************
// SchoolAssignments.Square.java
//
// Define a SchoolAssignments.Square class with methods to create and read in
// info for a square matrix and to compute the sum of a row,
// a col, either diagonal, and whether it is magic.
//          
// ****************************************************************
import java.io.*;
import java.util.Scanner;

public class Square
{
    private int[][] square;
    //--------------------------------------
    //create new square from a data file
    // DO NOT CHANGE THIS CONSTRUCTOR
    //--------------------------------------
    public Square(String filename) throws IOException
    {
        square = readSquare(filename);
    }

    //-----------------------------------
    //return size of the square
    // DO NOT CHANGE THIS METHOD
    //-----------------------------------
    public int size()
    {
        return square.length;
    }
    
    
    //--------------------------------------
    //return the sum of the values in the given row
    //--------------------------------------
    public int sumRow(int row)
    {
        int sum = 0;
        for(int c = 0; c < size(); c++)
        {
            sum += square[row][c];
        }
        return sum;
    }

    //--------------------------------------
    //return the sum of the values in the given column
    //--------------------------------------
    public int sumCol(int col)
    {
        int sum = 0;
        for(int r = 0; r < size(); r++)
        {
            sum += square[r][col];
        }
        return sum;
    }

    //--------------------------------------
    //return the sum of the values in the main diagonal
    //--------------------------------------
    public int sumMainDiag()
    {
        int sum = 0;
        for(int i = 0; i < size(); i++)
        {
            sum += square[i][i];
        }
        return sum;
    }

    //--------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //--------------------------------------
    public int sumOtherDiag()
    {
        int sum = 0;
        for(int i = 0; i < size(); i++)
        {
            sum += square[size()-1-i][i];
        }
        return sum;
    }

    //--------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //-------------------------------------
    public boolean magic()
    {
        boolean isMagic = false;
        boolean diag = sumMainDiag() == sumOtherDiag();
        int diagSum = sumMainDiag();
        if(diag)
        {
            for (int i = 0; i < size(); i++)
            {
                int sum = sumRow(i);
                isMagic = sum == sumCol(i) && sum == diagSum;
                if(!isMagic)
                {
                    break;
                }
            }
        }
        return isMagic;
    }



    //---------------------------------------------------
    //returns the contents of the square, neatly formatted
    // tab between values, each row on a new line.
    // MUST BE DONE with a nested enhanced for loop!
    //---------------------------------------------------
    public String printSquare()
    {
        StringBuilder s = new StringBuilder();
        int count = 0;
        for(int[] r : square)
        {
            for(int c : r)
            {
                s.append(c).append("\t");
                
            }
            s.append("\n");
        }
        return s.toString();
    }
    //--------------------------------------
    //read info into the square from a file
    // DO NOT CHANGE THIS METHOD
    //--------------------------------------
    public int[][] readSquare(String fileName) throws IOException
    {
        Scanner scan = new Scanner (new File(fileName));
        int size = scan.nextInt();
        int [][] readSquare = new int[size][size];
        for (int row = 0; row < readSquare.length; row++)
            for (int col = 0; col < readSquare.length; col ++)
                readSquare[row][col] = scan.nextInt();
        return readSquare;
    }

    

}