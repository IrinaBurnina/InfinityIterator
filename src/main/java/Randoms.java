import java.util.*;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected List<Integer> set = new ArrayList<>();

    public Randoms(int min, int max) {
        int t;
        random = new Random();
        while (true) {
            t = random.ints(min, (max + 1)).findFirst().getAsInt();
            set.add(t);
            if (t == max) {
                break;
            }
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return set.iterator();
    }

}
