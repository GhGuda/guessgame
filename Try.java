// import java.util.ArrayList;
// import java.util.List;
class Game{
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + score;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Game other = (Game) obj;
        if (score != other.score)
            return false;
        return true;
    }

    

    
}

public class Try {
    public static void main(String[] args) {
        
       Game obj = new Game();
       obj.setScore(10);
       Game obj2 = new Game();
       obj2.setScore(10);
       System.out.println(obj==obj2);
       System.out.println(obj2.equals(obj));
       System.out.println(obj2);
       System.out.println(obj);
    }
}
