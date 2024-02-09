public class Main {
    public static void main(String[] args) {
        Flashcard f = new DivisionCard();
        System.out.println(f);
        System.out.println(f.getAnswer());

        f = new AdditionCard();
        System.out.println(f);
        System.out.println(f.getAnswer());

    }
}