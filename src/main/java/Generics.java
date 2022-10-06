public class Generics {
    public static void maxValue(int a,int b,int c){
        Integer n1 = a;
        Integer n2 = b;
        Integer n3 = c;
        Integer max = n1;
        if(n2.compareTo(max)>0){
            max = n2;
        }
        if(n2.compareTo(max)>0){
            max = n3;
        }
        System.out.println("Maximum Number is :"+max);
    }

    public static void main(String[] args) {
        System.out.println("TC 1.1 Keeping Max Value at 1");
        maxValue(3,2,1);
        System.out.println("TC 1.2 keeping max value at 2");
        maxValue(2,3,1);
        System.out.println("TC 1.3 keeping max value at 3");
        maxValue(1,2,3);
    }
}
