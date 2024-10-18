public class subarraysum {
    public static void maximumsum(int arr[]){
        int largest=Integer.MIN_VALUE;
       int sum=0;
        
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=0;j<arr.length;j++){
                int end=j;
                sum=0;//here use sum =0 to reset the sum
                for(int k=start;k<=end;k++){
            
                    sum=sum+arr[k];
        
                
                }
                if (largest<sum) {
                    largest=sum;
                    
                }
                
            }
           
        }
        System.out.println("largest sum is:"+sum);
    

    }
    public static void main(String[] args) {
        int arr[]={-1,2,-4,8,9,-10};
        maximumsum(arr);
    }
}

    

