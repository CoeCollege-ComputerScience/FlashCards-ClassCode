public class SubtractionCard extends Flashcard {

    public SubtractionCard() {
        super("-");
        //operator = "-";
    }

    @Override
    public int getAnswer() {
        return op1 - op2;
    }
}
