class SelectionSorter implements IntSorter {
    @Override
    public int[] sort(int[] arr) {
    	if(arr.length==1)
    	return arr;
    	
    	int temp;
		for(int i=0;i<arr.length;i++){
			int iMin=i;
			for(int j=i;j<arr.length;j++){
				
				if(arr[j]<arr[iMin]){
					iMin=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[iMin];
			arr[iMin]=temp;
		}

        return arr;
    }
}
