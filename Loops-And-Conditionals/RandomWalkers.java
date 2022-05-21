public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double stepAve = 0;
        for (int i = 0; i < trials; i++) {
            int x = 0, y = 0;
            int step = 0;
            while (Math.abs(x) + Math.abs(y) < r) {
                double rand = Math.random();
                if (rand < 0.25) {
                    x++;
                } else if (rand < 0.5) {
                    x--;
                } else if (rand < 0.75) {
                    y++;
                } else {
                    y--;
                }
                step++;
            }
            stepAve += step;
        }
        stepAve /= trials;
        System.out.println("average number of steps = " + stepAve);
    }
}
