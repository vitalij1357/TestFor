package pole;

public class testPole {
    private String name;
    private String serialNumber;
    // Метод для встановлення імені корабля
    public void setName(String name) {
        this.name = name;
    }

    // Метод для встановлення серійного номера
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    // Метод для виведення інформації про корабель
    public void printInfo() {
        System.out.println("Name is " + name + ", serial number is " + serialNumber);
    }

    public static void main(String[] args) {
        // Створюємо об'єкт корабля
        testPole ship = new testPole();

        // Встановлюємо ім'я та серійний номер
        ship.setName("Voyager");
        ship.setSerialNumber("SN506788");

        // Виводимо інформацію про корабель
        ship.printInfo();
    }
}
