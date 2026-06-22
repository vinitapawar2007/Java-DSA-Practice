package LOOP;

public class evenoddelement {
    public static void main(String[] args) {
        
        int arr[] = {10,20,30,40,47};
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                System.out.println("Even: " + arr[i]);
            }
            else{
                System.out.println("odd: " + arr[i]);
            }
        }
    }
}
