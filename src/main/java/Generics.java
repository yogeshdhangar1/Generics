public class Generics {
    public static void MaxFloatValue(Float a,Float b,Float c){
        Float n1=a;
        Float n2=b;
        Float n3=c;
        Float max=n1;
        if(n2.compareTo(max)>0) {

            max=n2;
        }
        if(n3.compareTo(max)>0) {
            max=n3;
        }
        System.out.println("Maximum number is "+max);
    }

    public static void main(String[] args) {
        System.out.println("TC 1.1 Keeping max value at 1");
        MaxFloatValue(3.10f,2.20f,1.10f);
        System.out.println("TC 1.2 keeping max value at 2");
        MaxFloatValue(2.20f,3.10f,1.10f);
        System.out.println("TC 1.3 keeping max value at 3");
        MaxFloatValue(1.10f,2.20f,3.10f);
    }
}
