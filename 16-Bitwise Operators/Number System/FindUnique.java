public class FindUnique {
    public static void main(String[] args) {
        int[] arr={2,3,3,4,2,6,4};

        System.out.println(isUnique(arr));
    }
    private static  int isUnique(int[] arr){

        // How does this work ?
        /*
        let's example {2,-2,5,6,-5,4,-4} here every element will get cancelled out with its negative
        and will get 6 and order of ele does not matter in the same way :
        Xor of element with itself will gets 0 or we can say that element will get cancel out. Hence, will get unique element.
         */
        int unique=0;

        for(int n:arr){
            // XOR all the element
            unique ^=n;
        }
        return unique;
    }
}
