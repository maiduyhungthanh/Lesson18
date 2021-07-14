public class Player {
    private int number;
    private String name;
    private Position position;
    public Player(int number, String name, Position gk) {
        this.number = number;
        this.name = name;
        this.position = gk;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Position getPosition() {
        return position;
    }
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return number+"-"+name+"-Position."+position;
    }
}
