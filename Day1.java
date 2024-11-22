class Day1{
    public int getSecondLargest(int[] arr) {
        // Code Here
        int large=Integer.MIN_VALUE;
        int secondlarge=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                secondlarge=large;
                large=arr[i];
            }
            else if (arr[i]> secondlarge && arr[i]!=large) {
                secondlarge=arr[i];
            }
          
        }
        if(secondlarge==Integer.MIN_VALUE){
            return -1;
        }
        return secondlarge;
    }
}