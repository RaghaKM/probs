package IK.concurrency;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/**
 * Created by amallya on 8/13/17.
 */
public class TimerWithLatchesAshok {

    static long time(Executor executor, int concurrency, final Runnable action) throws InterruptedException {

        CountDownLatch ready = new CountDownLatch(concurrency);
        CountDownLatch start = new CountDownLatch(1);
        CountDownLatch finish = new CountDownLatch(concurrency);

        for(int i = 0 ; i < concurrency ; i++) {
            SynchronizedRunnable myRunnable = new SynchronizedRunnable(action, ready, start, finish);
            executor.execute(myRunnable);
        }

        ready.await(); // Wait till all threads are ready;
        long before = System.currentTimeMillis();
        start.countDown(); // Since all threads are now ready, tell them to start
        finish.await(); // Wait for all threads to finish

        return System.currentTimeMillis() - before ;
    }

    static class SynchronizedRunnable implements Runnable {

        CountDownLatch ready ;
        CountDownLatch start ;
        CountDownLatch finish ;
        Runnable action ;

        SynchronizedRunnable(Runnable action, final CountDownLatch ready, CountDownLatch start, CountDownLatch finish) {
            this.ready = ready;
            this.start = start ;
            this.finish = finish;
            this.action = action;
        }

        @Override
        public void run() {
            ready.countDown(); // tell master that I'm ready
            try {
                start.await(); // wait for master to tell me to start
                action.run();
            } catch (InterruptedException oops) {
                oops.printStackTrace(); // oops!
            } finally {
                finish.countDown(); // tell master that I'm done. We _have_ to decrement the finish latch
            }
        }
    }


}