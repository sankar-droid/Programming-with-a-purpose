
public class DiscreteDistribution {
	public static void main(String args[])
	{
		
	int samples = Integer.parseInt(args[0]);
    int sum = 0;
    int[] s = new int[args.length + 1];
    for (int i = 1; i < args.length; i++) {
        sum += Integer.parseInt(args[i]);
    }
    s[0] = 0;
    for (int i = 1; i < args.length; i++) {
        s[i] = Integer.parseInt(args[i]) + s[i - 1];
    }
    s[args.length] = s[args.length - 1] + 1;
    for (int i = 0; i < samples; i++) {
        double rand = sum * Math.random();
        int randi = (int) rand;
        for (int j = 0; j < args.length; j++) {
            if (randi >= s[j] && randi < s[j + 1]) {
                System.out.print(j + 1 + " ");
                break;
            }
        }
    }
    System.out.println();
  }
}
