public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(150,0,1);
        Cat cat1 = new Cat(250,0,1.5f);
        Dog dog = new Dog(500,10,2);

        cat.isJump(2);
        cat1.isRun(100);
        System.out.println(Animal.animalCount);
        System.out.println(Cat.catCount);


    }
}
