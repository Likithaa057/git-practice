public class largest{
    public static void main(String[] args){
        int[] arr = {10, 20, 50, 80, 60};
        int largest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.print("The largest element in an array is: " + largest);
    }
}