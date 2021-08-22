int minimumDiff(int[] a){
  
  int low=0;
  int high=a.length-1;
 
  int result=Integer.MAX_VALUE;
  while(low<high){
    
    if(a[low]+a[high]<0){
      result =Math.min(result, Math.abs(a[low]+a[high]));
      low++;
    }else if(a[low]+a[high]>0){
    result =Math.min(result, Math.abs(a[low]+a[high]));
      high--;
    }else{
    return 0;
    }
  }
  return result;
}
