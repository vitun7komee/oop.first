class Solution {

    private Strategy strategy;

    public Solution() {
        this.strategy = new RabinKarpStrategy();
    }

    public Solution(Strategy strategy) {
        this.strategy = strategy;
    }

    public void SetStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public boolean GetSolution(String string, String substring) {
        return strategy.IsSubstring(string, substring);
    }
}
