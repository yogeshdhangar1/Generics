public class Generics {
    public static void MaxStringValue(String a,String b,String c){
        String st1=a;
        String st2=b;
        String st3=c;
        String max=st1;
        if(st2.compareTo(max)>0) {
            max=st2;
        }
        if(st3.compareTo(max)>0) {
            max=st3;
        }
        System.out.println("Maximum number is "+max);
    }
    public static void main(String[] args) {
        System.out.println("TC 1.1 Keeping max string at 1");
        MaxStringValue("Apple","Peach","Banana");
        System.out.println("TC 1.2 keeping max string at 2");
        MaxStringValue("Peach","Apple","Banana");
        System.out.println("TC 1.3 keeping max string at 3");
        MaxStringValue("Banana","Peach","Apple");
    }
}
