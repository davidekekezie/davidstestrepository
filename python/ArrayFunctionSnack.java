package classWork;

import java.util.Arrays;

public class ArrayFunctionSnack {


    int []arr;

    public int maximumReturner(int[]arr){
    int maximumNUmber=arr[0];

        for (int index:arr) {

            if (index>maximumNUmber){
               maximumNUmber=index;
            }

        }


        return maximumNUmber;
    }


    public void reserveArray(int length) {
        int[] arr= new int[length];

        this.arr=arr;
            }

    public String elementChecker(int[]arr){
        String StringArr= Arrays.toString(arr);



    return null;
    }

    public int []oddprinter(int []arr){
        int []container =new int[arr.length];
        for (int  index = 0;index <arr.length ; index++) {

            if (index%2==1){
                container[index]=index;
            }

        }


        return container;
    }
    public int []evenprinter(int [ ]arr){
        int []container =new int[arr.length];
        for (int  index = 0;index <arr.length ; index++) {

            if (index%2==0){
                container[index]=index;
            }

        }


        return container;
    }
    public int totalFinder(int[] arr){
        int total =0;
        for (int element:arr) {
            total+=element;
        }



        return total;

    }

    public String concatinator(String[] arr1,String[] arr2){

        String []arr = new String[arr1.length+arr2.length];
        int index=0;
        for (; index <arr1.length ; index++) {
            arr[index]=arr1[index];

        }
        for (int indexing = 0; indexing < arr2.length; indexing++) {

            arr[index]=arr2[indexing];
            index++;

        }
       String Stringed_arr=Arrays.toString(arr);
return Stringed_arr;


    }

    public String interSwitchedConcatination(String[]arr1,String[]arr2){
        String []arr = new String[arr1.length+ arr2.length];

        int counter1=0;
        int counter2=0;

        for (int index = 0; index < (arr1.length+arr2.length); index++) {
            if(index%2==0)
            {arr[index]=arr1[counter1];
            counter1++;}
            if(index%2==1){
                arr[index]=arr2[counter2];
                counter2++;
            }


        }
        String container=Arrays.toString(arr);

        return container;
    }

    public String numberToArray(int numbers){
        String numbering;
        numbering = Integer.toString(numbers);

        int[]arr = new int[numbering.length()];
        int counter = 0;
        for (int index = 0; index < numbering.length(); index++) {
        


        }
        String stringArr= Arrays.toString(arr);

return stringArr;

    }










}
