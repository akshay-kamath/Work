class MergeSorter implements IntSorter {
    @Override
    public int[] sort(int[] arr) {
        int len=arr.length;
        
        if(len==1)
        	return arr;
        
        int mid=len/2;
        
        int leftCopy[]=new int[mid];
        
        int rightCopy[]=new int[len-mid];
        
        for(int i=0;i<mid;i++){
        	leftCopy[i]=arr[i];
        }
         int k=0;
         for(int j=mid;j<arr.length;j++){
        	rightCopy[k]=arr[j];
        	k++;
        }	
       
        
        int leftSorted[]=sort(leftCopy);
        int rightSorted[]=sort(rightCopy);
        
        return merge(leftSorted,rightSorted);
    }
    
    
    public int[] merge(int left[],int right[]){
    	int l=left.length;
    	int m=right.length;
    	int n=left.length+right.length;
    	int sorted[]=new int[n];
    	int i=0,j=0,k=0;
    	
    	while(i<l && j<m){
    		
    		if(left[i]<right[j]){
    			sorted[k]=left[i];
    			i++;
    		}
    		else
    		{
    			sorted[k]=right[j];
    			j++;	
    		}
    		k++;
    	}
    	
    	while(i<l){
    			sorted[k]=left[i];
    			i++;
    			k++;
    	}
    	
    	while(j<m){
    			sorted[k]=right[j];
    			j++;
    			k++;
    	}
    	
    	return sorted;
    	
    }
    
    
    
    
}
