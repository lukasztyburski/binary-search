import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Integer[] integersSet = {1, 4, 8, 9, 12, 17, 22, 26, 27, 35, 38, 40, 41, 42, 43};
        String[] strignsSet = {"Ala", "Bartosz", "Danka", "Janusz", "Marcin", "Ola", "Renata", "Zdzichu"};

        List<String> list = new ArrayList<>(Arrays.asList(strignsSet));

        BinarySearch<String> search = new BinarySearch<>(list);
        int result;
        String key = "łukasz";
        try {
            result = search.indexOf(key);
            System.out.println("What is the index of key?\n" + result);

        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

}
