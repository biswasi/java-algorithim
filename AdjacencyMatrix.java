import java.util.Arrays;

public class AdjacencyMatrix {

    public static void addEdge(int[][] matrix, int i, int j) {
        matrix[i][j] = 1;
        matrix[j][i] = 1; // Since the graph is undirected
    }

    public static void displayMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Create a graph with 4 vertices and no edge
        int V = 4;
        int[][] matrix = new int[V][V];
        // Now add edges one by one
        addEdge(matrix, 0, 1);
        addEdge(matrix, 0, 2);
        addEdge(matrix, 1, 2);
        addEdge(matrix, 2, 3);

        System.out.println("Adjacency Matrix Representation");
        displayMatrix(mat);
    }
}
}
