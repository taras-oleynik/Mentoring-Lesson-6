package sortArrayByString;



public class SortArrayByString {

    public String [] arr = {"Mersedes-Benz","Kia", "Volvo", "Nisan", "Deo", "Cherry" };
    String temp;

    public void sortArrayByStringLength() {

        for (int i = arr.length-1; i > 0; i--) {
            //������� ���� ��� ������� �� ������� �������� �������
            for (int k = 0; k < i; k++ ){
// ������� ���������� ���� ��� ����� ������� ����� ������� � ������ ���� ����� ����������� ������ ����������
                if (arr[k].length() > arr[k+1].length() ) {


                    temp = arr[k];
                    //������� ��������� ���������� ��� �������� ��������� �������
                    arr[k] = arr[k+1];
                    arr[k+1]=temp;
                }
            }
        }

    }



}
