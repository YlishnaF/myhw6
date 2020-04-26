public class Cat extends Animal {
    static int catCount;

    public Cat(int maxRun, int maxSwim, float maxJump) {
        super(maxRun, maxSwim, maxJump);
        catCount++;
    }

    @Override
    public void isSwim(int swim) {
        System.out.println("Коты не плавают");
    }
}