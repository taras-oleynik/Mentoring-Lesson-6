package sortArrayByString;



public class SortArrayByString {

    public String [] arr = {"Mersedes-Benz","Kia", "Volvo", "Nisan", "Deo", "Cherry" };
    String temp;

    public void sortArrayByStringLength() {

        for (int i = arr.length-1; i > 0; i--) {
            //create a loop to iterate through each element of the array
            for (int k = 0; k < i; k++ ){
// create inner loop to change the place of the cells array's in the case where the length of follow-up less than the previous
                if (arr[k].length() > arr[k+1].length() ) {


                    temp = arr[k];
                    //Create a temporary variable to store the array elements
                    arr[k] = arr[k+1];
                    arr[k+1]=temp;
                }
            }
        }

    }



}
