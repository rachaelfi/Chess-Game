import java.util.*;

class Queen extends gamePiece {

    Queen(String name, int posX, int posY, boolean team) {
        super(name, posX, posY, team);
    }

    @Override
    public void setPosX(int posX) {
        super.setPosX(posX);
    }

    @Override
    public void setPosY(int posY) {
        super.setPosY(posY);
    }

    @Override
    public int getPosX() {
        return super.getPosX();
    }

    @Override
    public int getPosY() {
        return super.getPosY();
    }

    @Override
    public int getNumberOfMoves() {
        return super.getNumberOfMoves();
    }

    @Override
    public void incrementNumberOfMoves() {
        super.incrementNumberOfMoves();
    }

    @Override
    public boolean getTeam() {
        return super.getTeam();
    }

    public ArrayList<Coordinates> moves(gamePiece[][] grid) {
        return null;
    }

    @Override
    public String toString() {
        return getName();
    }
}