package ClassActivities.JavaLambda;

public class lambda {
    public static void main(String[] args) {
        int[] x = {args.length};
        Runnable task = () -> System.out.println(++x[0]);
        task.run();
    }
}
