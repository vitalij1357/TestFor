package pole;

public class SpaceRocketLauncher  {
    private int bigRocketCount;
    private int smallRocketCount;
    public void setSmallRocketCount(int smallRocketCount)
    {
        if(smallRocketCount<0 ^ smallRocketCount<=100)
        {
            this.smallRocketCount=smallRocketCount;
        }
        else return;
    }
    public void setbigRocketCount(int bigRocketCount )
    {
        if(bigRocketCount<0^bigRocketCount<=100)
        {
            this.bigRocketCount=bigRocketCount;
        }
        else return;
    }
    public int getBigRocketCount()
    {
        return bigRocketCount;
    }
    public int getSmallRocketCount()
    {
        return smallRocketCount;
    }
    public void launchBigRocket()
    {
        if(bigRocketCount>0)
        {
            bigRocketCount --;
            System.out.println("Launch big rocket");
        }
    }
    public void launchSmallRocket()
    {
        if (smallRocketCount>0)
        {
            smallRocketCount --;
            System.out.println("Launch small rocket");
        }
    }
    public int getTotalPower()
    {
       return smallRocketCount*50+bigRocketCount*100;
    }

    public static void main(String[] args) {
        SpaceRocketLauncher launcher =new SpaceRocketLauncher();
        launcher.setbigRocketCount(5);
        launcher.setSmallRocketCount(10);

        System.out.println("total power is " + launcher.getTotalPower());

        launcher.launchBigRocket();
        System.out.println("Big rocket count is " + launcher.getBigRocketCount());

        launcher.launchSmallRocket();
        System.out.println("Small rocket count is " + launcher.getSmallRocketCount());

        System.out.println("total power is " + launcher.getTotalPower());
    }
}
