// class --> blueprints
// interface is a blueprints of a class.
// 100 % abstraction is achived
// muliple inheritance 2. total abstraction
// interface --> implements
// by default public,abstract & without implementation
// final, public and static
interface ChessPlayer {
    void moves();
}
class Queen implements ChessPlayer {
   public void moves() {
        System.out.println("up,down,left,right,dig");
    }
}
class Rook implements ChessPlayer {
   public void moves() {
        System.out.println("up,down,left,right");
    }
}
class King implements ChessPlayer {
   public void moves() {
        System.out.println("up,down,left,right,dig(1step)");
    }
}
public class Interface2 {
    public static void main(String []args) {
        Queen q = new Queen();
        q.moves();
        
    }
}
