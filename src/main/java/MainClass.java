public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Barsik", 5), new Cat("Murzik", 7)};
        Plate plate = new Plate(20);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat.getName() + " is satiated: " + cat.isSatiety());
        }

        plate.addFood(10); // добавляем еду в тарелку
        plate.info();
    }
}
