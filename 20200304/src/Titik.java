
/**
 *
 * @author dooriq
 */
public class Titik {
    private int x;
    private int y;
    
    public Titik(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public Titik() {
        this.x=0;
        this.y=0;
        
    }   
    
    public void setX(int x){
        this.x=x;
    }
    
    public int getX(){
        return x;
    }
    
    public void setY(int y){
        this.y=y;
    }
    
    public int getY(){
        return y;
    }
    
    void naik(){
        y++;
    }
    
    
    
    
    public String toString(){
        return "("+x+" , "+y+")";
    }
    
}
