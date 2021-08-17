 
		  public int getMaxproduct(int[] array){
        
      int negative_count=0;
		  int product=1;
		  int zero_count=0;
		  int min=Integer.MIN_VALUE;
		  for(int i=0; i<array.length; i++){
		      if(array[i]==0){
		         zero_count++;
		          continue;
		      }
		      if(array[i]<0){
		    	  negative_count++;
		          min=Math.max(min, array[i]);
		      }
		      
		      product*=array[i];
		  }
		  
		  if(zero_count==array.length){
		     return 0;
		  }
		
		  
		  if(negative_count%2 != 0 && zero_count!=array.length-1){
		      product=product/min;
		  }
return product;
}
