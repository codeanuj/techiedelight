public class MyClass {
    public static void main(String args[]) {
     
     int[] a ={1, 4, 10, -2, 4 };
     
     int max1=Integer.MIN_VALUE;
     int max2=Integer.MIN_VALUE;
     
     int min1=Integer.MAX_VALUE;  
      int min2=Integer.MAX_VALUE;
       int min3=Integer.MAX_VALUE;


      for(int i=0; i<a.length; i++){
           
           if(a[i]>max1){
               max2=max1;
               max1=a[i];
           }else if(a[i]>max2){
               max2=a[i];
           }
           
           
           if(a[i]<min1){
               min3=min2;
               min2=min1;
               min1=a[i];
           }else if(a[i]<min2){
               min3=min2;
               min2=a[i];
           }else if(a[i]<min3){
               min3=a[i];
           }
      }

   long result=Math.min(min1*min2*min3, max1*max2*min1);
      System.out.println(result);
    }
}
