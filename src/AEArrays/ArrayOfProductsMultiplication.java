package AEArrays;

public class ArrayOfProductsMultiplication {
    public static int[] arrayOfProducts(int[] array) {
        // Write your code here.
        int[] result = new int[array.length];
        for(int i = 0 ; i < array.length ; i++){
            int multiplier=1;
            for (int j = 0 ; j < array.length ; j++){
                if(i != j){
                    multiplier*=array[j];
                }
            }
            result[i] = multiplier;
        }
        return result;
    }

    public static void main(String[] args){
        int[] in = {5,1,4,2};
        int[] result = arrayOfProducts(in);
        System.out.print("{");
        for(int i = 0 ; i < result.length ; i++){
            System.out.print(result[i]+",");
        }
        System.out.print("}");
    }
}
