import javax.swing.text.StyledEditorKit;

public class Multiples {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i < 1000; i++) {

            Boolean multiplesOf3 = i % 3 == 0;
            Boolean multiplesOf5 = i % 5 == 0;

            if (multiplesOf5 || multiplesOf3) {
                count++;
            }
        }

        System.out.println(count);
    }
}
