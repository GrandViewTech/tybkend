// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
import java.util.List;
import java.util.ArrayList;
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{
    public static void main(String[] args) {

        List<Integer> result=cellCompete(new int[]{1,0,0,0,0,1,0,0},1);
        result.forEach(System.out::print);
    }
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public static List<Integer> cellCompete(int[] states, int days)
    {
        // WRITE YOUR CODE HERE
        int day=1;
        int houses=states.length;
        while(day<=days)
        {
            int [] tempArrangement= new int[houses];
            for(int house=0 ; house<houses;house++)
            {
                int leftHouse = house-1;
                int rightHouse = house+1;
                if((leftHouse==-1 && states[rightHouse]==0) || ((rightHouse == (houses)) && states[leftHouse]==0))
                {
                    tempArrangement[house]=0;
                }
                else if(leftHouse>=0 && rightHouse< houses &&(states[leftHouse]==states[rightHouse]))
                {
                    tempArrangement[house]=0;
                }
                else
                {
                    tempArrangement[house]=1;
                }
            }
            states=tempArrangement;
            day=day+1;
        }

        List<Integer> result=  new ArrayList<>();
        for(Integer state:states)
        {
            result.add(state);
        }
        return result;
    }
    // METHOD SIGNATURE ENDS
}