package SchoolAssignments;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice
{
    public static void main(String[] args)
    {
        // use this to test out your code

        ArrayList<Line> lines = populateLinesArrayList(new int[]{-2, -5, -4, 6, 8}, new int[]{3, 2, 1, 4, 7});
        System.out.println(lines);
        ArrayList<Line> lines1 = removeLinesWithNegativeSlopes(lines);
        System.out.println(lines1);

    }
    
    /*
     *  Returns an ArrayList of lines with the given slopes and y_intercepts.
     *
     *  Example:
     *      {-2, 5, 4}, {3, 2, 1}
     *      returns
     *      [y = -2x + 3, y = 5x + 2, y = 4x + 1]
     *
     *  Precondition: slopes.length == y_intercepts.length
     */
    public static ArrayList<Line> populateLinesArrayList(int[] slopes, int[] y_intercepts)
    {
        ArrayList<Line> lines = new ArrayList<Line>();
        for(int i = 0; i < slopes.length; i++)
        {
            lines.add(new Line(slopes[i], y_intercepts[i]));
        }
        return lines;
    }
    
    /*
     *  Returns the ArrayList lines with all of the lines in additionalLines added to it.
     *
     *  Example:
     *      lines: [y = -2x + 3, y = 5x + 2, y = 4x + 1]
            additionalLines: [y = -10x + -2, y = 7x + 8]
     *      returns
     *      [y = -2x + 3, y = 5x + 2, y = 4x + 1, y = -10x + -2, y = 7x + 8]
     */
    public static ArrayList<Line> appendArrayList(ArrayList<Line> lines, ArrayList<Line> additionalLines)
    {
        //lines.addAll(additionalLines);
        for(Line line : lines)
        {
            lines.add(line);
        }
        return lines;
    }
    
    /*
     *  Returns the ArrayList lines after removing all lines with a negative slope.
     *
     *  Example:
     *      [y = -2x + 3, y = -3x + 1, y = 2x + 4]
     *      returns
     *      [y = 2x + 4]
     *
     *  HINT: The solution isn't as simple as it seems... try tracing your code.
     */
    public static ArrayList<Line> removeLinesWithNegativeSlopes(ArrayList<Line> lines)
    {
//        for(int i= 0; i < lines.size(); i++)
//        {
//            if(lines.get(i).getSlope() < 0)
//            {
//                lines.remove(i);
//                i--;
//            }
//        }
        for(int i = lines.size()-1; i >= 0; i--)
        {
           lines.remove(i);
        }

        Iterator<Line> iterator = lines.iterator();
        while(iterator.hasNext())
        {
            Line current = iterator.next();
            if(current.getSlope() < 0)
            {
                iterator.remove();
            }
        }


        return lines;
    }
}