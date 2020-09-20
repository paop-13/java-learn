import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Answer20 {
    private static final String[] MEDALS = new String[]{
            "GOLD", "SILVER", "BRONZE"
    };

    public static void main(String[] args) {
        final List<String> medals = new ArrayList<>();
        medals.addAll(Arrays.asList(MEDALS));
        medals.forEach(System.out::println) ;

        final List medals2 = new ArrayList();
        medals2.addAll(Arrays.asList(MEDALS));
        medals2.forEach(System.out::println);
    }
}
