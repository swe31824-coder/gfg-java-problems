class Solution {
    public static int nextPrime(int n) {

        // code here to find next prime number
        // return next prime number
        int d=n+1;
        while(true){
            int p=0;
            for(int i=1;i<=d;i++){
                if(d%i==0){
                    p++;
                }
            }
            if(p==2){
                return d;
            }
            d++;
        }
    }
}
