import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

public class Answer17 {
    /** ループ回数. */
    private static final int COUNT = 100_000_000;

    /** ある long 変数. */
    private static volatile long variable = -1L;
    // あるlong型の変数の参照を100万回するだけのスレッドAと、
    // その同じ変数を0か-1かどちらかを代入することを100万回繰り返すスレッドBを同時に動作させ、
    // スレッドAではこの変数の値を参照したときに必ず0または-1となるようにするプログラムを実装せよ。
    public static void main(String[] args) throws InterruptedException {
        // スレッドの数を指定して、全部終わるまで待つ処理をあとで書く
        final CountDownLatch latch = new CountDownLatch(2);
        // 最大スレッド数を指定する。あとでsubmitしたタイミングでスレッドを起動する
        final ExecutorService executor = Executors.newFixedThreadPool(2);
        // long型変数をアトミックな値に設定するためのクラス.
        final AtomicLong atom = new AtomicLong();

        // スレッドA
        executor.submit(() -> {
            atom.set(variable);
            long atomVariable = atom.get();
            for (int i = 0; i < COUNT; i++) {
                if (atomVariable != 0 && atomVariable != -1) {
                    System.out.printf("variable (%d) is not 0 or -1.\n", variable);
                }
            }
            latch.countDown();
        });

        // スレッドB
        executor.submit(() -> {
            for (int i = 0; i < COUNT; i++) {
                if (i % 2 == 1) {
                    variable = 0;
                    continue;
                }
                variable = -1L;
            }
            latch.countDown();
        });

        // A, B 両方の終了まで待機.
        latch.await();
        executor.shutdown();
    }
}
