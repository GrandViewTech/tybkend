// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
class GCD
{
    //23280666755670
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public int generalizedGCD(int num, int[] arr)
    {
        // WRITE YOUR CODE HERE
        int gcd= arr[0];
        for(int i =1 ; i < num ;i++)
        {
         gcd = gcd(arr[i],gcd);
         if (gcd==1) return 1;
        }
        return gcd;
    }
    // METHOD SIGNATURE ENDS

    public int gcd(int a , int b)
    {
        if (a==0) return b;
        return gcd(b%a,a);
    }

    public static void main(String[] args) {
        GCD gcd = new GCD();
        int result=gcd.generalizedGCD(5,new int[]{2,3,4,5,6});
        System.out.println(result);
    }

}