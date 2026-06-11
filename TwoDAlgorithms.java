import java.util.ArrayList;

public class TwoDAlgorithms
{
   private int[][] matrix = null;

   public void setMatrix(int[][] theMatrix)
   {
      matrix = theMatrix;
   }

   public void print()
   {
      for(int r = 0; r < matrix.length; r++)
      {
         for(int c = 0; c < matrix[0].length; c++)
         {
            System.out.print(matrix[r][c] + " ");
         }
         System.out.println();
      }
      System.out.println();
   }

   public int getLargest()
   {
      int largest = matrix[0][0];

      for(int r = 0; r < matrix.length; r++)
      {
         for(int c = 0; c < matrix[0].length; c++)
         {
            if(matrix[r][c] > largest)
            {
               largest = matrix[r][c];
            }
         }
      }

      return largest;
   }

   public int getSmallest()
   {
      int smallest = matrix[0][0];

      for(int r = 0; r < matrix.length; r++)
      {
         for(int c = 0; c < matrix[0].length; c++)
         {
            if(matrix[r][c] < smallest)
            {
               smallest = matrix[r][c];
            }
         }
      }

      return smallest;
   }

   public int getTotal()
   {
      int total = 0;

      for(int r = 0; r < matrix.length; r++)
      {
         for(int c = 0; c < matrix[0].length; c++)
         {
            total = total + matrix[r][c];
         }
      }

      return total;
   }

   public int getCount(int value)
   {
      int count = 0;

      for(int r = 0; r < matrix.length; r++)
      {
         for(int c = 0; c < matrix[0].length; c++)
         {
            if(matrix[r][c] == value)
            {
               count++;
            }
         }
      }

      return count;
   }

   public int getColTotal(int column)
   {
      int total = 0;

      for(int r = 0; r < matrix.length; r++)
      {
         total = total + matrix[r][column];
      }

      return total;
   }

   public double getAverage()
   {
      int total = getTotal();
      int amount = matrix.length * matrix[0].length;

      return (double) total / amount;
   }

   public ArrayList<Integer> getEveryOther()
   {
      ArrayList<Integer> list = new ArrayList<Integer>();
      int count = 0;

      for(int r = 0; r < matrix.length; r++)
      {
         for(int c = 0; c < matrix[0].length; c++)
         {
            if(count % 2 == 0)
            {
               list.add(matrix[r][c]);
            }
            count++;
         }
      }

      return list;
   }

   public void reverse()
   {
      int rows = matrix.length;
      int cols = matrix[0].length;

      for(int r = 0; r < rows; r++)
      {
         for(int c = 0; c < cols / 2; c++)
         {
            int temp = matrix[r][c];
            matrix[r][c] = matrix[r][cols - 1 - c];
            matrix[r][cols - 1 - c] = temp;
         }
      }
   }

   public void shiftColumnUp(int colIndex)
   {
      int first = matrix[0][colIndex];

      for(int r = 0; r < matrix.length - 1; r++)
      {
         matrix[r][colIndex] = matrix[r+1][colIndex];
      }

      matrix[matrix.length - 1][colIndex] = first;
   }

   public boolean hasDuplicatesInRow()
   {
      for(int r = 0; r < matrix.length; r++)
      {
         for(int c1 = 0; c1 < matrix[0].length; c1++)
         {
            for(int c2 = c1 + 1; c2 < matrix[0].length; c2++)
            {
               if(matrix[r][c1] == matrix[r][c2])
               {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public ArrayList<int[]> consecutivePairs()
   {
      ArrayList<int[]> pairs = new ArrayList<int[]>();

      for(int r = 0; r < matrix.length; r++)
      {
         for(int c = 0; c < matrix[0].length - 1; c++)
         {
            int[] pair = {matrix[r][c], matrix[r][c+1]};
            pairs.add(pair);
         }
      }

      return pairs;
   }
}