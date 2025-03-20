package pole;

public class spaceShip {
    // Приватне поле для серійного номера
    private String serialNumber;

    // Геттер для отримання значення серійного номера
    public String getSerialNumber() {
        return serialNumber;
    }

    // Сеттер для встановлення значення серійного номера
    public void setSerialNumber(String serialNumber) {
        // Перевірка на правильний формат серійного номера
        if (serialNumber != null && serialNumber.length() == 8 && serialNumber.startsWith("SN")) {
            // Якщо формат правильний, встановлюємо значення
            this.serialNumber = serialNumber;
        }
        // Якщо формат неправильний, нічого не робимо
    }

    public static void main(String[] args) {
        // Створення об'єкта SpaceShip
        spaceShip ship = new spaceShip();

        // Встановлення серійного номера
        ship.setSerialNumber("SN506788");
        System.out.println(ship.getSerialNumber()); // Повинно вивести: SN506788

        // Спроба встановити некоректний серійний номер
        ship.setSerialNumber("EE123456");
        System.out.println(ship.getSerialNumber()); // Повинно вивести: SN506788 (старе значення)
    }
}
