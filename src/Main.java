import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) {

        String A =" This is String, split by StringTokenizer. Created by Student:Larionov";
        StringTokenizer stringTokenizer = new StringTokenizer(A, ", .");
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }

    }
}
