package homework_01_19_2023;

public class Task2 {

    public static void main(String[] args) {
        int[][] costs = new int[][]{
                {0, 2, 4, 1, 6, 7},
                {0, 2, 4, 1, 6, 7},
                {9, 2, 4, 1, 6, 0}
        };
        System.out.println(minimalCost(costs, 0, 0));
    }

    private static int minimalCost(int[][] costs, int i, int j) {
        if (i >= costs.length || j >= costs[0].length) return 1000000;
        if (i == costs.length - 1 && j == costs[0].length - 1) return costs[i][j];
        int minCost = costs[i][j] + Math.min(minimalCost(costs, i + 1, j), minimalCost(costs, i, j + 1));
        return minCost;
    }
}
