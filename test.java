public class Main
{
    public static void main(String[] args)
    {
        int[][] data = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        TwoDAlgorithms alg = new TwoDAlgorithms();
        alg.setMatrix(data);

        System.out.println("Largest: " + alg.getLargest());
        System.out.println("Average: " + alg.getAverage());
    }
}
