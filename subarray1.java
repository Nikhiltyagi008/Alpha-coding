        public class subarray1{
            public static void pairs(int arr[]){
                for(int i=0;i<arr.length;i++)
            {
                int current=arr[i];
            for(int j=i;j<arr.length;j++){
            for(int k=i;k<=j;k++){
                System.out.print(arr[k]);

            }
            System.out.println();
            }
            System.out.println(" ");
        }    }
        public static void main(String[] args) {
            int arr[]={1,2,3,4,5,6};
            pairs(arr);
        }
        }