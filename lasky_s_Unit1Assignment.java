public class lasky_s_Unit1Assignment
{
   public static void main(String[] args)
   {
     //1. Create Sorted List of 20 numbers
     int[] list = {4, 9, 17, 35, 46, 55, 63, 80, 81, 89, 92, 95, 102, 113, 128, 143, 162, 169, 171, 199};
     int linearIteration = 0;
     int binaryIteration = 0;
     //2. Search for each element using linear search and print out the number of iterations before the item is found.
     for(int x = 0; x < list.length; x++)
     {
       int key = list[x];
       int linear = seqSearch(list, key);
       System.out.println("Using Linear Search the number of iterations to find " + key
                            + " is " + linear);
       linearIteration = linearIteration + linear;
       
     
       
     }
     //3. Now use binary search and print the same information.
     
      for(int i = 0; i < list.length; i++)
     {
       int keyB = list[i];
       int binary = binSearch(list, keyB);
       System.out.println("Using Binary Search the number of iterations to find " + keyB
                            + " is " + binary);
       binaryIteration = binaryIteration + binary;
       
     
       
     }
      //4. Print the average number of iterations for each search.
      
     int averageBinIter = 0;
     int averageSeqIter = 0;
     
     averageSeqIter = linearIteration / list.length;
     averageBinIter = binaryIteration / list.length;
     
     System.out.println("The average number of iterations for a Linear Search is " + averageSeqIter);
     System.out.println("The average number of iterations for a Binary Search is " + averageBinIter);
     
     
   }
   
   public static int binSearch(int [] array, int searchItem)
    {
       int iterations = 0;
       int start = 0;
       int end = array.length-1;
       int mid;
       while (start <= end)
       {
    iterations++;
           mid = (start+end)/2;
           if (searchItem == array[mid])
             {
               return iterations;
             }
           else if (searchItem < array[mid])
             {
               end = mid-1;
             }
           else
             {
               start = mid+1;
             }
       }
       return -1;
    }
   
   public static int seqSearch( int[] array, int searchItem )
  {
 int iterations = 0;
     for ( int j=0; j  < array.length; j++ ){
  iterations++;
          if ( array[j] == searchItem)
   return iterations; 
     }
     return -1 ; 
  }
   
   
}