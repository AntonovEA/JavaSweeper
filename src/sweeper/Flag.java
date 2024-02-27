package sweeper;

 class Flag {
     private Matrix flagMap;

     void start(){

         flagMap = new Matrix(Box.closed);
         for (Coord around : Ranges.getCoordsAround(new Coord(4,4)))
         flagMap.set(around, Box.opened);

     }
     Box get (Coord coord){
         return flagMap.get(coord);
     }

}
