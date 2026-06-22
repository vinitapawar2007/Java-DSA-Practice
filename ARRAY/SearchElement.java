package Array;

public class SearchElement {
    public static void main(String[] args) {

        int arr[] = {5, 10, 15, 20, 25};

        int key = 20;
        boolean found = false;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
}
    
