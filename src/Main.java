    public class Main {
        public static Primes p;

        public static void main(String[] stuff) {

            // GENERAL STRATEGY FOR PRIME NUMBER COMPUTATION
            // Memoize the primes; if there is a need for a bigger prime than is
            // memoized, the Primes object will do its buildPrimes method to
            // memoize whatever number of primes is needed.
//
//            System.out.println(isBrilliant(49));
//            System.out.println(isBrilliant(5));
//            System.out.println(isBrilliant(14));
            p = new Primes(50);
    //        System.out.println(p.toString());
    //		System.out.println(p.get());
    //		System.out.println(p.isPrime(37));
    //		System.out.println(p.get());
    //		System.out.println(p.isPrime(2701));
    		System.out.println(p.get());
    		Brilliant b = new Brilliant(20);  // stores arraylist of 20 brilliant numbers
    		System.out.println(b.getBrilliants());
        }

        // Static: One copy for the whole class
        public static boolean isPrime(int n) {
            boolean ret = n % 2 != 0;

            for(int i = 3; i * i <= n; i += 2) {
                if (n % i == 0) {
                    ret = false;
                    break;
                }
            }

            return ret;
        }

        public static boolean isBrilliant(int n) {
            Primes primeList = new Primes(1);
            primeList.buildPrimes(n/2);
//            System.out.println(primeList.get());

            for(int number : primeList.get()) {
                if(n % number == 0) {
                    if (primeList.isPrime(n / number) && sameNumberOfDigits(number, n / number)) {
                        return true;
                    }
                }
            }

            return false;
        }

        public static boolean sameNumberOfDigits(int n1, int n2) {
            return numDigits(n1) == numDigits(n2);
        }

        public static int numDigits(int n) {
            return (int)(Math.log10(n) + 1);
        }
    }
