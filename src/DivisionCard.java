import java.util.Random;

public class DivisionCard extends Flashcard{

    public DivisionCard() {
        super("/");
        System.out.println("In  Division Constructor");
        Random rand = new Random();
        op2 = Math.abs(rand.nextInt()%10) +1;
        int factor = rand.nextInt()%5;
        op1 = op2 * factor;
    }

    @Override
    public int getAnswer() {
        return op1/op2;
    }
}
