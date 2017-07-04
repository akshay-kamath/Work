/*Algorithm:

1: Initialize:
    str  =  "test string" /* input string */
    //ip_ind =  0          /* index to  keep track of location of next
                          //   character in input string 
   // res_ind  =  0         /* index to  keep track of location of
                       //     next character in the resultant string 
  //  bin_hash[0..255] = {0,0, ….} /* Binary hash to see if character is 
                            //            already processed or not 
//2: Do following for each character *(str + ip_ind) in input string:
 //             (a) if bin_hash is not set for *(str + ip_ind) then
                   // if program sees the character *(str + ip_ind) first time
                    /*     (i)  Set bin_hash for *(str + ip_ind)
                         (ii)  Move *(str  + ip_ind) to the resultant string.
                              This is done in-place.
                         (iii) res_ind++
              (b) ip_ind++
  /* String obtained after this step is "te sringng" */
//3: Remove extra characters at the end of the resultant string.
  /*  String obtained after this step is "te sring" */ 
  
  import java.util.*;
 
class RemoveDuplicates
{
    /* Function removes duplicate characters from the string
    This function work in-place */
    void removeDuplicates(String str)
    {
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        for(int i=0;i<str.length();i++)
            lhs.add(str.charAt(i));
         
        // print string after deleting duplicate elements
        for(Character ch : lhs)
            System.out.print(ch);
    }
     
    /* Driver program to test removeDuplicates */
    public static void main(String args[])
    {
        String str = "geeksforgeeks";
        RemoveDuplicates r = new RemoveDuplicates();
        r.removeDuplicates(str);
    }
}
 