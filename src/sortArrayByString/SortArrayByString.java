package sortArrayByString;



public class SortArrayByString {

    public String [] arr = {"Mersedes-Benz","Kia", "Volvo", "Nisan", "Deo", "Cherry" };
    String temp;

    public void sortArrayByStringLength() {

        for (int i = arr.length-1; i > 0; i--) {
            //создаем цикл для прохода по каждому элементу массива
            for (int k = 0; k < i; k++ ){
// создаем внутренний цикл для смены местами ячеек массива в случае если длина последующей меньше предыдущей
                if (arr[k].length() > arr[k+1].length() ) {


                    temp = arr[k];
                    //создаем временную переменную для хронения элементов массива
                    arr[k] = arr[k+1];
                    arr[k+1]=temp;
                }
            }
        }

    }



}
