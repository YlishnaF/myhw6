public class Dog extends Animal {
    static int dogCount;

    public Dog(int maxRun, int maxSwim, float maxJump) {
        super(maxRun, maxSwim, maxJump);
        dogCount++;
    }

}

