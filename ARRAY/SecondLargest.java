package Array;

public class SecondLargest {
    public static void main(String[] args) {
    

        int arr[] = {12, 45, 67, 23, 89, 54};

        int largest = arr[0];
        int second = arr[0];

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] > largest) {
                second = largest;
                largest = arr[i];
            }
            else if(arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }

        System.out.println("Second Largest = " + second);
    }
}
    
