
import java.util.HashMap;

public class MyClass {
    public static void main(String args[]) {
     
     int[] a={3,4,5,3,4};
     HashMap<Integer, Pair> map=new HashMap();
     
     for(int i=0; i<a.length; i++){
         int c=a[i];
         for(int j=i+1; j<a.length; j++){
          
          int sum=c+a[j];
             if(map.containsKey(sum)){
                 Pair  p =map.get(sum);
                 
                 if((p.getX() != i && p.getY() != j) && (p.getX() != j && p.getY() != i)){
                     System.out.println(i+"  "+j+"  "+p.getX()+"   "+p.getY());
                 }
             }else{
                 Pair p = new Pair(i,j);
                 map.put(sum, p);
             }
         }
     }
    }
}

class Pair{
    
   int x;
   int y;
   
   Pair(int x, int y){
       this.x= x;
       this.y=y;
   }
   
   public int getX(){
       return this.x;
   }
   public int getY(){
       return this.y;
   }
}
