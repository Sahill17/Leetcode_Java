class Solution {
    
    PriorityQueue<Integer> pQ = new PriorityQueue<>();
    
    public int[][] diagonalSort(int[][] mat) {
        
        int[][] seen = new int[mat.length][mat[0].length];
        
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) {
                if(seen[i][j] != 1) {
                    loadQueue(mat, i, j);
                    loadDiagonal(mat, seen, i, j);
                }
            }
        }
        
        return mat;
    }
    
    
    public void loadQueue(int[][] mat, int i, int j) {
        if(i >= mat.length || j >= mat[0].length || i < 0 || j < 0) {
            return;
        }
        
        pQ.add(mat[i][j]);
        loadQueue(mat, i + 1, j + 1);
    }
    
    public void loadDiagonal(int[][] mat, int[][] seen,  int i, int j) {
        if(i >= mat.length || j > mat[0].length || i < 0 || j < 0 || pQ.isEmpty()) {
            return;
        }
        
        mat[i][j] = pQ.poll();
        seen[i][j] = 1;
        loadDiagonal(mat, seen, i + 1, j + 1);
    }
}