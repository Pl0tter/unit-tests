package seminar02.hw;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    static Car testCar;
    static Motorcycle testMotorcycle;

    @BeforeAll
    static void setup() {
        testCar = new Car("Company", "Model", 2020);
        testMotorcycle = new Motorcycle("TestCompany", "TestModel", 2021);
    }

    /**
     * Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
     */
    @Test
    public void carInstanceOf() {
        assertInstanceOf(Vehicle.class, testCar, "Объект Car не является наследником Vehicle");
    }

    /**
     * Проверить, что объект Car создается с 4-мя колесами.
     */
    @Test
    public void carWheelsCount() {
        assertEquals(4, testCar.getNumWheels(), "У машины не 4 колеса");
    }

    /**
     * Проверить, что объект Motorcycle создается с 2-мя колесами.
     */
    @Test
    public void motoWheelsCount() {
        assertEquals(2, testMotorcycle.getNumWheels(), "У мотоцикла не 2 колеса");
    }

    /**
     * Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
     */
    @Test
    public void carTestDriveSpeed() {
        testCar.testDrive();
        assertEquals(60, testCar.getSpeed(), "Скорость машины на тест-драйве не 60 кмч");
    }

    /**
     * Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
     */
    @Test
    public void motoTestDriveSpeed() {
        testMotorcycle.testDrive();
        assertEquals(75, testMotorcycle.getSpeed(), "Скорость мотоцикла на тест-драйве не 75 кмч");
    }
    /**
     * Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
     */
    @Test
    public void carParkingSpeed() {
        testCar.testDrive();
        testCar.park();
        assertEquals(0, testCar.getSpeed(), "Машина не остановилась");
    }
    /**
     * Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
     */
    @Test
    public void motoParkingSpeed() {
        testMotorcycle.testDrive();
        testMotorcycle.park();
        assertEquals(0, testMotorcycle.getSpeed(), "Мотоцикл не остановился");
    }
}