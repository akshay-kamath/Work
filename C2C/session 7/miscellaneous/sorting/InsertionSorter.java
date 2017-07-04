class InsertionSorter implements IntSorter {
    @Override
    public int[] sort(int[] arr) {
		if(arr.length==1)
    		return arr;
    		
    	for(int i=0;i<arr.length;i++){
    		int temp=arr[i];
    		int j=i-1;
          
          while(j>=0 && temp<arr[j]){
          	arr[j+1]=arr[j];
          	j--;
          }
            arr[j+1]=temp;
		}
        return arr;
    }
}
