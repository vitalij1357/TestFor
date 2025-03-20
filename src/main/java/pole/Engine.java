package pole;
class  XFuelEngine extends Engine{
    protected String serialNumber;
    protected int power;
    @Override
    public void setPower(int power){
        this.power=power;
    }
    public void setSerialNumber(String serialNumber)
    {
        this.serialNumber=serialNumber;
    }
    @Override
    public String getFuelType()
    {
        return "XFuel";
    }
}
class AdvancedXFuelEngine extends XFuelEngine {
    public void printInfo(){
        System.out.println("Serial number is "+ serialNumber+"power is "+ power);
    }
}
public class Engine {
    private int power;

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
    public String getFuelType() {
        return "A500";
    }
    public static void main(String[] args) {
        AdvancedXFuelEngine start = new AdvancedXFuelEngine();
        start.setPower(1000);
        start.setSerialNumber("SN504030");
        start.printInfo();

        // Викликаємо getFuelType() для об'єкта типу Engine
        System.out.println(new Engine().getFuelType());
        System.out.println(new XFuelEngine().getFuelType());// Виведе: A500
    }
}
