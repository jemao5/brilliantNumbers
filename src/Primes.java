import java.util.ArrayList;

public class Primes {
    ArrayList<Integer> primes = new ArrayList<Integer>();

    public Primes(int n) {
        initPrimes(n);
    }

    // Find the smallest prime number that is greater or equal to n
    public int nextPrime(int n) {
        int previousPrime = n;
        while(true){
            if(Main.isPrime(previousPrime)){
                return previousPrime;
            }
            previousPrime++;
        }
    }

    public boolean isPrime(int n) {
        if(n > primes.get(0)){
            buildPrimes(nextPrime(n));
        }

        return primes.contains(n);   // STUB
    }

    // n is the number of primes that should be in the ArrayList
    public void initPrimes(int n) {
        primes.clear();
        int previousPrime = 2;
        for(int i = 0; i < n; i++){
            primes.add(0, previousPrime);
            previousPrime = nextPrime(previousPrime + 1);
        }
    }

    // n is the number up to which all primes should be stored
    // Example: if n is 25, then the primes ArrayList should be
    //   [23, 19, 17, 13, 11, 7, 5, 3, 2]
    public void buildPrimes(int n) {
        primes.clear();
        for(int i = 2; i <= nextPrime(n); i = nextPrime(i + 1)){
            primes.add(0, i);
        }
    }

    public int size() {
        return primes.size();
    }

    public int get(int n) {
        return primes.get(n);
    }

    public ArrayList<Integer> get() {
        return primes;    // STUB
    }

    public String toString() {
        return primes.toString();
    }
}
