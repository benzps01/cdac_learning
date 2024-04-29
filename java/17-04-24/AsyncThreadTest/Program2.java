import java.util.stream.IntStream;

import demo.*;

class Program {
    static class Computation {
        private long start = System.currentTimeMillis();

        public long compute(int lower, int upper){
            return IntStream(lower, upper+1)
            .mapToLong(Activity::perform)
            .sum();
        }

        public double time() {
            long interval = System.currentTimeMillis() - start;
            return interval / 1000.0;
        }

        
    }
}