public class MaxValueGenerics <T extends Comparable<T>> {
        T a1,a2,a3;
        public MaxValueGenerics(T a1,T a2,T a3) {
            this.a1=a1;
            this.a2=a2;
            this.a3=a3;
        }
        public static <T extends Comparable<T>> T MaxValue(T a1,T a2,T a3) {
            T max =a1;
            if(a2.compareTo(max)>0)
                max=a2;
            if(a3.compareTo(max)>0)
                max=a3;
            return max;
        }
    public static void main(String[] args) {
        System.out.println("Max value in 3 Integers is:"+MaxValue(3,2,1));
        System.out.println("Max value is 3 Float is:"+MaxValue(3.10f,2.20f,4.10f));
        System.out.println("Max value is 3 String is:"+MaxValue("Apple","Peach","Banana"));
    }
}
