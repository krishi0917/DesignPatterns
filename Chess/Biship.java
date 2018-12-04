package DesignPatterns.Chess;

/**
 * Created by rkhurana on 12/3/18.
 */
public class Biship extends Piece {
    public Biship(boolean b) {
        super(b);
    }

    @Override
    public boolean canMove(Board board, Box start, Box end) {
        return false;
    }
}
