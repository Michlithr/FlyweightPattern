import figures.*;

public class Main {
    public static void main(String[] argv){

        ChessPiece blackPawn = new BlackPiece();
        ChessPiece whitePawn = new WhitePiece();
        ChessPiece blackQueen = new BlackKing();
        ChessPiece whiteQueen = new WhiteQueen();

        System.out.println(blackPawn);
        System.out.println(whitePawn);
        System.out.println(whiteQueen);
        System.out.println(blackQueen);

        System.out.println(blackPawn.getColor()==blackQueen.getColor());
        System.out.println(whitePawn.getColor()==whiteQueen.getColor());
    }
}
