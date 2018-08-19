package figures;

public abstract class ChessPiece {
    private String name;
    private int numberPosition;
    private String letterPosition;
    private Color color;

    ChessPiece(String name, int numberPosition, String letterPosition, String color) {
        this.name = name;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;
        switch(color.toLowerCase()){
            case "black":
                this.color = ColorRepository.getBlack();
                break;
            case "white":
                this.color = ColorRepository.getWhite();
                break;
            default:
                throw new UnsupportedOperationException("Unknown color.");
        }
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ChessPiece{" +
                "name='" + name + '\'' +
                ", numberPosition=" + numberPosition +
                ", letterPosition='" + letterPosition + '\'' +
                ", color=" + color.toString() +
                '}';
    }
}
