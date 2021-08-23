import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      int[] a={2,3,4,5};
      int[] b={1,12,3};

      ArrayList<Integer> list = new ArrayList(); 
      int i=0;
      int j=0;
      String s="";

      StringBuilder sb=new StringBuilder();
     while(i<a.length && j<b.length){
         
         int sum=a[i]+b[i];
         sb.append(String.valueOf(sum));
         
         for(int l=0; l<sb.length(); l++){
             int o=Integer.parseInt(String.valueOf(sb.charAt(l)));
             list.add(o);
         }
         i++;
         j++;
         sb.setLength(0);
     }
     
     
     while(i<a.length){
         
         sb.append(String.valueOf(a[i]));
         
         for(int l=0; l<sb.length(); l++){
             int o=Integer.parseInt(String.valueOf(sb.charAt(l)));
             list.add(o);
         }
         i++;
         sb.setLength(0);
     }
     
      while(j<b.length){
         
         sb.append(String.valueOf(b[j]));
         
         for(int l=0; l<sb.length(); l++){
             int o=Integer.parseInt(String.valueOf(sb.charAt(l)));
             list.add(o);
         }
         i++;
         sb.setLength(0);
     }
     System.out.println(list);
     
    }
    
    
    
    ///////////////////////////////////////////////
    
      public static void add(int[] a, int[] b, List<Integer> result)
    {
        int m = a.length, n = b.length;
        String str = "";
 
        // loop till either `a` or `b` runs out
        int i = 0;
        while (i < m && i < n)
        {
            str += (a[i] + b[i]);
            i++;
        }
 
        // process remaining elements of the first list, if any
        while (i < m) {
            str += (a[i++]);
        }
 
        // process remaining elements of the second list, if any
        while (i < n) {
            str += (b[i++]);
        }
 
        // add characters of the output string to a given list of integers
        char[] chars = str.toCharArray();
        for (char c: chars) {
            result.add(c - '0');
        }
    }
 
    public static void main(String[] args)
    {
        // input lists
        int[] a = { };
        int[] b = { 4, 67, 2, 8 };
 
        // list to store the output
        List<Integer> result = new ArrayList<>();
        add(a, b, result);
 
        // print the output list
        System.out.print(result);
    }
}
