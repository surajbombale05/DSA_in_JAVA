public class Linear {
    int linearSearch(int arr[],int key){
         for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
   
    public static void main(String a[]){
        Linear l = new Linear();
        int arr[] = {4,65,6,76,78};
        int key = 76;
         System.out.print("element found "+ l.linearSearch(arr,key));
       
        
       
    }

}
