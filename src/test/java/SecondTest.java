import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondTest {
    @Test
    void 初期コンストラクタはnonameをwordに代入する() {
        //when
        String actual = new Second().word;
        //then
        assertEquals("no name", actual);
    }

    @Test
    void 引数ありコンストラクタは引数の値をwordに代入する() {
        // when
        String testValue = "testだよ";
        String actual = new Second(testValue).word;
        // then
        assertEquals(testValue, actual);
    }

}
