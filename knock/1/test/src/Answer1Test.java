package src;

import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Answer1Test {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void before() {
        // 何に出力するのか決める
        // 今回はバイト配列にいれてあとで文字列でとってきたりできるようにするため
        System.setOut(new PrintStream(new BufferedOutputStream(outContent)));
    }

    @Test
    void HelloWorldを表示() {
        // when
        Answer1.main(null);
        System.out.flush();
        final String actual = outContent.toString();

        // then
        final String expected = "Hello, World!";
        assertEquals(expected, actual);
    }

    @After
    public void after() {
        System.setOut(originalOut);
    }
}
