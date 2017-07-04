/*METHOD 1(Use sum formula)
Algorithm:

1. Get the sum of numbers 
       total = n*(n+1)/2
2  Subtract all the numbers from sum and
   you will get the missing number.*/
   
   
   // Java program to find missing Number
 
class Main
{

    static int getMissingNo (int a[], int n)
    {
        int i, total;
        total  = (n+1)*(n+2)/2;   
        for ( i = 0; i< n; i++)
           total -= a[i];
        return total;
    }
      
    public static void main(String args[])
    {
        int a[] = {1,2,4,5,6};
        int miss = getMissingNo(a,5);
        System.out.println(miss);   
    }
}


/*METHOD 2(Use XOR)

  1) XOR all the array elements, let the result of XOR be X1.
  2) XOR all numbers from 1 to n, let XOR be X2.
  3) XOR of X1 and X2 gives the missing number.*/
  
  // Java program to find missing Number
// using xor
class Main
{

    static int getMissingNo (int a[], int n)
    {
        int i;
        int x1 = a[0]; 
        int x2 = 1; 
         
        /* For xor of all the elements 
           in array */
        for (i = 1; i< n; i++)
            x1 = x1^a[i];
                 
        /* For xor of all the elements 
           from 1 to n+1 */        
        for ( i = 2; i <= n+1; i++)
            x2 = x2^i;         
         
        return (x1^x2);
    }
      

    public static void main(String args[])
    {
        int a[] = {1,2,4,5,6};
        int miss = getMissingNo(a,5);
        System.out.println(miss);
    }
}


