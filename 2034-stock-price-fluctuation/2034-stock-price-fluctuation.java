class StockPrice {

    HashMap<Integer, Integer> map = new HashMap<>();
    TreeMap<Integer, Integer> tree = new TreeMap<>();

    int latest = 0;

    public StockPrice() {

    }

    public void update(int timestamp, int price) {

        if (map.containsKey(timestamp)) {

            int old = map.get(timestamp);

            tree.put(old, tree.get(old) - 1);

            if (tree.get(old) == 0) {
                tree.remove(old);
            }
        }

        map.put(timestamp, price);

        tree.put(price, tree.getOrDefault(price, 0) + 1);

        latest = Math.max(latest, timestamp);
    }

    public int current() {
        return map.get(latest);
    }

    public int maximum() {
        return tree.lastKey();
    }

    public int minimum() {
        return tree.firstKey();
    }
}

/**
 * Your StockPrice object will be instantiated and called as such:
 * StockPrice obj = new StockPrice();
 * obj.update(timestamp,price);
 * int param_2 = obj.current();
 * int param_3 = obj.maximum();
 * int param_4 = obj.minimum();
 */