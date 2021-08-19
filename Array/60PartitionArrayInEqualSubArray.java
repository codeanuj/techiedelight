 int[] A = {6, -5, 2, -4, 1 };
		  //HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		  int total=0;
		  for(int i=0; i<A.length;i++) {
			  total+=A[i];
		  }
		  
		  int sum=0;
		  int j=-1;
		  int r=0;
		  for(int i=0; i<A.length; i++){
		      sum+=A[i];
		      r=total-sum;
		      if(r==sum){
		           j=i;
		         break;
		      }
		      
		      
		  }
		  
		  for(int i=0; i<=j; i++)
		      System.out.println(A[i]);
		      
		      
		  System.out.println("-----------");
		  
		   for(int i=j+1; i<A.length; i++)
		      System.out.println(A[i]);
		  
		  
