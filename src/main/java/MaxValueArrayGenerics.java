public class MaxValueArrayGenerics {
    public static < T extends Comparable <T> > void MaxValue(T[] inputArray) {

        int n = inputArray.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (inputArray[j].compareTo(inputArray[j+1]) > 0) {
                    T temp = inputArray[j];
                    inputArray[j] = inputArray[j+1];
                    inputArray[j+1] = temp;
                }
            }
        }
        printMax(inputArray);
    }
    public static <T> void printMax(T [] inputArray) {
        int a =inputArray.length;
        System.out.println(inputArray[a-1]);
    }
    public static void main(String[] args) {
        Integer [] intArray = {4,2,5,3,1};
        Double[] doubleArray = { 11.2, 12.2, 13.3, 14.4, 15.5 };
        String [] stringArray = {"Apple","Peach","Orange","Banana","Kiwi"};

        System.out.println( "Max Integer Array" );
        MaxValue( intArray );

        System.out.println( "Max Double Array" );
        MaxValue( doubleArray );

        System.out.println( "Max String Array" );
        MaxValue( stringArray );
    }
}
