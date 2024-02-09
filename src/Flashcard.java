import java.util.Random;

public abstract class Flashcard {
    protected int op1;
    protected int op2;
    protected String operator;


    public Flashcard(String operator) {
        Random rand = new Random();
        op1 = rand.nextInt()%10 ;
        op2 = rand.nextInt()%10;
        this.operator = operator;
    }
    //Abstract
    public abstract int getAnswer();

    @Override
    public String toString() {
        return op1 + operator + op2;
    }
}
