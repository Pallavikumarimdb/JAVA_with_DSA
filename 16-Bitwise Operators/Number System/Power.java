public class Power {

    /*
    3^6 = 3^110 = 3^2 * 3^4;

    3^110 = 3^4*1 * 3^2*1 * 3^0*0
     */
    public static void main(String[] args) {
        int base=3;
        int p=4;

        int ans=1;

        while(p > 0){
            if((p&1)==1){
                ans=ans*base;
            }
            base=base*base;
            p=p>>1;
        }
        System.out.println(ans);
    }

}
