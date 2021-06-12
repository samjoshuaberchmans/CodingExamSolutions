package ArrayExamples;

public class ReplaceWithPreviousNumber {

    public static String[] addNumberForNull(String[] input){
//        Code goes here.
        if(input == null || input.length == 0)
            return input;
        String priorNumber = null;
        String[] result = new String[input.length];
        for(int i = 0; i < input.length ; i++){
            if(input[i]!=null){
//                System.out.println("--");
                priorNumber = input[i];
                result[i] = input[i];
            }else{
//                System.out.println("-");
                result[i] = priorNumber;
            }
        }
        return result;
    }

    public static void printArray(String[] inNumberToPrint){
        if(inNumberToPrint==null)
            System.out.println("Null Array");
        else if(inNumberToPrint.length==0)
            System.out.println("In Array is 0");
        else {
            System.out.print("{");
            for (String s : inNumberToPrint) System.out.print(s + ",");
            System.out.println("}");
        }
    }

    public static void main(String[] args){
        String[] input1 = null;
        String[] input2 = new String[0];
        String[] input3 = {null,"1",null};
        String[] input4 = {"1",null,"2",null,null,"3",null};

        String[] result1 = addNumberForNull(input1);
        printArray(result1);
        String[] result2 = addNumberForNull(input2);
        printArray(result2);
        String[] result3 = addNumberForNull(input3);
        printArray(result3);
        String[] result4 = addNumberForNull(input4);
        printArray(result4);

    }
}
