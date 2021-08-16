 int maxPathSum(int ar1[], int ar2[])
    {
        // Your code here
        
        int i=0;
        int j=0;
        int sum1=0;
        int sum2=0;
        
        int finalsum=0;
        
        while(i<ar1.length && j<ar2.length){
            
          while(i<ar1.length-1 && ar1[i]==ar1[i+1]){
          sum1+=ar1[i];
          }
          while(j<ar2.length-1 && ar2[j]==ar2[j+1]){
          sum2+=ar2[j];
          }
           if(ar1[i]<ar2[j]){
                sum1+=ar1[i++];
            }else if(ar1[i]>ar2[j]){
                sum2+=ar2[j++];
            }else{
               
                finalsum=finalsum+Math.max(sum1, sum2)+ar1[i];
                sum1=0;
                sum2=0;
                i++;
                j++;
                
            }
        }
        
        while(i<ar1.length){
            sum1+=ar1[i++];
        }
        
         while(j<ar2.length){
            sum2+=ar2[j++];
        }
        finalsum=finalsum+Math.max(sum1, sum2);
        return finalsum;
        
    }
