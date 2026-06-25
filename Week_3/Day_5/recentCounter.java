public class recentCounter {
    List<Integer> list;
    int i;
    int j;
    public recentCounter() {
        list = new ArrayList<>();
        i = 0;
        j = 0;
    }
    public int ping(int t) {
        list.add(t);
        j++;
        while(i<j && list.get(i)<t-3000 > list.get(i)){
            i++;
        }
        return j - i+1;
    }
}
