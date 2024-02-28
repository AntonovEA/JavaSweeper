package sweeper;

class Flag {
    private Matrix flagMap;

    void start() {

        flagMap = new Matrix(Box.closed);


    }

    Box get(Coord coord) {
        return flagMap.get(coord);
    }

    public void setOpenedToBox(Coord coord) {
        flagMap.set(coord, Box.opened);

    }
    public void toggleFlaggedToBox(Coord coord) {
        switch (flagMap.get(coord)){
            case flaged : setClosedToBox(coord);
                break;
            case closed: setFlaggedToBox(coord);
        }
    }
    private void setClosedToBox(Coord coord) {
        flagMap.set(coord, Box.closed);

    }
    public void setFlaggedToBox(Coord coord) {
        flagMap.set(coord, Box.flaged);
    }




}
