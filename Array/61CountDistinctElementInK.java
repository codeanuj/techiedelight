ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
        // code here 
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<k; i++){
            map.put(A[i], map.getOrDefault(A[i], 0)+1);
        }
        
      list.add(map.size());
      int j=0;
      for(int i=k; i<n; i++){
          
          
          map.put(A[i], map.getOrDefault(A[i], 0)+1);
          int count=map.get(A[j]);
          map.put(A[j], count-1);
          if(map.get(A[j])<=0){
              map.remove(A[j]);
          }
          
          list.add(map.size());
          j++;
      }
      
      return list;
    }
