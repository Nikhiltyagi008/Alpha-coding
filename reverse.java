public class reverse {
    public static void reversearray(int arr[]){
        int start=0; 
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
             arr[start]=arr[end];
             arr[end]=temp;
             start++;
             end--;
        }
    }
    public static void pairsarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+curr+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        //reversearray(arr);
        //for(int i=0;i<arr.length;i++){
           // System.out.print(arr[i]+" ");
        pairsarr(arr);
        }
        
    }
    

