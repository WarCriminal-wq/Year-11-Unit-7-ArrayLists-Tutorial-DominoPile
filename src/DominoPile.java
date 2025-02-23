import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class DominoPile {
    private ArrayList<Domino> pile;

    public DominoPile() {
        this.pile=new ArrayList<>();
    }

    public ArrayList<Domino> getPile() {
        return pile;
    }

    public void newStack6() {
        pile.clear();
        for (int i=0;i<=6;i++) {
            for (int diddy=i;diddy<=6;diddy++) {
                pile.add(new Domino(i,diddy));
            }
        }
    }

    public void shuffle() {
        ArrayList<Domino> newPile=new ArrayList<>(pile);
        Collections.shuffle(newPile);
        pile=newPile;
    }


}
