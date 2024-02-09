public class AdditionCard extends Flashcard{

    public AdditionCard() {
        super("+");
        //operator = "+";
    }

    @Override
    public int getAnswer() {
        return op1 + op2;
    }
}
