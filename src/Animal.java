public class Animal {
    int run;
    int swim;
    float jump;
    int maxRun;
    int maxSwim;
    float maxJump;
    static int animalCount;


    public Animal(int maxRun, int maxSwim, float maxJump) {
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.maxJump = maxJump;
        animalCount++;
        }

    public void isRun(int run) {
        if (run <= maxRun) {
            System.out.println("run: true");
        } else {
            System.out.println("run: false");
        }
    }

    public void isSwim(int swim) {
        if (swim <= maxSwim) {
            System.out.println("run: true");
        } else {
            System.out.println("run: false");
        }


    }

    public void isJump(float jump) {
        if (jump <= maxJump) {
            System.out.println("run: true");
        } else {
            System.out.println("run: false");
        }


    }
}