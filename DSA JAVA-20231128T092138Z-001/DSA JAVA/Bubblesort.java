public class Bubblesort {
        public static void main(String a[]){
             int  ac[]={43,545,3,45};
             for(int i = 0 ; i<ac.length-1;i++){
                for (int j = 0; j < ac.length-i-1; j++) {
                    if(ac[j]>ac[j+1]){
                        int temp = ac[j];
                        ac[j]=ac[j+1];
                        ac[j+1]=temp;
                    }
                }
             }
               for (int i = 0; i < ac.length; i++) {
                  System.out.print(ac[i]+" ");
               }
    }
}
