class Solution {
    public int reachNumber(int target) {
        int distance = Math.abs(target);
        int minMoves = (int) Math.ceil((-1.0 + Math.sqrt(1 + 8 * distance)) / 2);
        int sum = minMoves * (minMoves + 1) / 2;
        int diff = sum - distance;
        if (diff % 2 == 0) {
            return minMoves;
        } else {
            return minMoves + ((minMoves % 2 == 0) ? 1 : 2);
        }
    }
}
