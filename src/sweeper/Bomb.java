package sweeper;

public class Bomb {
    private Matrix bombMap;
    private int totalBombs;

    Bomb(int totalBombs) {
        this.totalBombs = totalBombs;
        fixBombCount();
    }

    void start() {
        bombMap = new Matrix(Box.zero);
        for (int i = 0; i < totalBombs; i++) {
            placeBomb();

        }

    }

    Box get(Coord coord) {
        return bombMap.get(coord);
    }

    private void fixBombCount() {
        int maxBombs = Ranges.getSize().x * Ranges.getSize().y / 2;
        if (totalBombs > maxBombs)
            totalBombs = maxBombs;
    }

    private void placeBomb() {
        while (true) {
            Coord coord = Ranges.getRandomCoord();
            if (Box.bomb == bombMap.get(coord))
                continue;
            bombMap.set(coord, Box.bomb);
            incNumbersAroundBomb(coord);
            break;
        }

    }

    private void incNumbersAroundBomb(Coord coord) {
        for (Coord around : Ranges.getCoordsAround(coord))
            if (Box.bomb != bombMap.get(around))
                bombMap.set(around, bombMap.get(around).getNextNumberBox());
    }

     int getTotalBombs() {
        return totalBombs;
    }

    public void setTotalBombs(Object totalBombs) {
        this.totalBombs = (int) totalBombs;
    }
}
