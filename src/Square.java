public class Square<T extends Number>{
    private T wall;

    public Square(T wall) {
        super();
        this.wall = wall;
    }

    public T getWall() {
        return wall;
    }

    public void setWall(T wall) {
        this.wall = wall;
    }



    /*
                Zapisz w Square metodę zwracającą double o nazwie getSurfaceArea. Wewnątrz stwórz
                zmiennę typu double do której przypiszesz wynik wywołania doubleValue() na wall.
                 */
    public double getSurfaceArea(){
        double x = this.wall.doubleValue()*this.wall.doubleValue();
        return x;

    }
}
