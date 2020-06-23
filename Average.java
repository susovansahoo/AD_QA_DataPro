import java.util.Arrays;

public class Average {
	public static double mean(double[] data) {
    return Arrays.stream(data).sum() /data.length;
	}

    public static void main(String[] args) {
        System.out.println("Average of 1 and 2 is " + mean(new double[] {1.0, 2.0}));
    }
}