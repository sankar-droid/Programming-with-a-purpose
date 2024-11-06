

public class RandomWalker {
	public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int i = 0;
        System.out.println("(0, 0)");
        while (Math.abs(x) + Math.abs(y) != n) {
            double a = Math.random();
            if (a < 0.25) x++;
            else if (a < 0.5) x--;
            else if (a < 0.75) y++;
            else y--;
            System.out.println("(" + x + ", " + y + ")");
            i++;
        }
        System.out.println("steps = " + i);
    }
}
