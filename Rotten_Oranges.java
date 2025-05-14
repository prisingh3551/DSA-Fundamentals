class Solution {
    class Pair {
        int i, j;
        Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
    public int orangesRotting(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        Queue<Pair> que = new LinkedList<>();
        int countMin = 0, cntFresh = 0;

        // Count fresh oranges and enqueue all initially rotten ones
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                if(mat[i][j] == 1) {
                    cntFresh++;
                }
                else if(mat[i][j] == 2) {
                    que.add(new Pair(i, j));
                }
            }
        }
      
        // No fresh oranges means no time needed
        if(cntFresh == 0) return 0;
        int dir[][] = {{0, -1}, {1, 0}, {0, 1}, {-1, 0}};  // directions - up, right, down, left
        while(!que.isEmpty()) {
            boolean didTurn = false;  // check if any orange is turned rotten in this round
            int size = que.size();
            for(int i = 0; i < size; ++i) {
                Pair p = que.poll();
                int x = p.i;
                int y = p.j;

                // Check all 4 directions around (x, y)
                for(int j = 0; j < 4; ++j) {
                    int nx = x + dir[j][0], ny = y + dir[j][1];

                    // Check if the new position is within bounds and contains a fresh orange
                    if(nx >= 0 && nx < n && ny >= 0 && ny < m && mat[nx][ny] == 1) {
                        cntFresh--;
                        // Make the fresh orange rotten and add it to the queue
                        mat[nx][ny] = 2; 
                        que.add(new Pair(nx, ny));
                        didTurn = true;
                    }
                }
            }   
            if(!didTurn) break;  
            countMin++; // Only increment minutes if at least one orange rotted
        }
        return cntFresh == 0 ? countMin: -1;
    }
}
