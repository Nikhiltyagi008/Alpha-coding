public class prefix {
    public static void maxarray(int arr[]){
        int maximum=Integer.MIN_VALUE;
        int currsum=0;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=arr[i]+prefix[i-1];
        }
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                currsum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(maximum<currsum){
                    maximum=currsum;
                }
                
            }
        }
        System.out.println("maximum sum="+maximum);
    }
    public static void main(String[] args) {
        int arr[]={-1,2,-4,8,9,-10};
        maxarray(arr);
    }
}
