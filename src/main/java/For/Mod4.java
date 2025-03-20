package For;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mod4 {
    public int getMinPriceCount(int[] prices)
    {
        if (prices.length==0)
        {
            return 0;
        }
        int min=prices[0];
        int count = 1;
        for (int i =0;i<prices.length;i++)
        {
            if(prices[i]<min)
            {
                min=prices[i];
                 count=1;
            }
            else if (prices[i]==min)
            {
                count ++;
                return count;
            }
            if(count==prices[i])
            {
                return prices.length;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Mod4 Mod = new Mod4();
        int[]prices=new int[]{100, 1500, 300, 50, 10, 10, 70};
        System.out.println(Mod.getMinPriceCount(prices));
    }
}

