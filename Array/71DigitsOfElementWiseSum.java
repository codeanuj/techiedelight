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
}
