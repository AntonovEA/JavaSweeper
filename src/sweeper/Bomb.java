package sweeper;

public class Bomb {
    private Matrix bombMap;
    private int totalBombs;

    Bomb(int totalBombs) {
        this.totalBombs = totalBombs;
    }
    void start(){
        bombMap=new Matrix(Box.zero);
        placeBomb();

    }
    Box get (Coord coord){
        return bombMap.get(coord);
    }

    private void placeBomb(){
        bombMap.set(new Coord(4,4), Box.bomb);
    }
}
