import java.util.ArrayList;

public class Brilliant {
    ArrayList<Integer> brilliants = new ArrayList<Integer>();

    public Brilliant() {
    }

    public Brilliant(int n) {
        initBrilliants(n);
    }

//    public int nextBrilliant() {
//        brilliants.get(0);
//        return 0;   // STUB
//    }

    public void initBrilliants(int n) {
        for (int i = 4; n > 0; i++) {
            if (Main.isBrilliant(i)) {
                brilliants.add(i);
                n--;

            }
        }
    }

    public ArrayList<Integer> getBrilliants() {
        return brilliants;
    }

    public int size() {
        return brilliants.size();
    }
}
