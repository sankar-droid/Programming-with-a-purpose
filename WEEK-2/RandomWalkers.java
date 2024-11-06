

public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int denom = trials;
        int sum = 0;
        for (int j = 0; j < trials; j++) {
            int x = 0;
            int y = 0;
            int i = 0;
            while (Math.abs(x) + Math.abs(y) != r) {
                double a = Math.random();
                if (a < 0.25) x++;
                else if (a < 0.5) x--;
                else if (a< 0.75) y++;
                else y--;
                i++;
            }
            sum += i;
        }
        double avg = (double) sum / denom;
        System.out.println("average number of steps = " + avg);

    }
}