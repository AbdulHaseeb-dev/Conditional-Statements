public class TernaryOperators {
    public static void main(String[] args) {
        int number = 5;
        String type = ((number %2) == 0) ? "even" : "odd";
        System.out.println(type);

        // question practice

        int marks = 45;
        String reportCard = marks >= 33 ? "pass" : "odd";
        System.out.println(reportCard);
    }
}
