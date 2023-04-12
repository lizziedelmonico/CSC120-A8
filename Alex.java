import java.util.ArrayList;

/**
 * The Alex program implements the methods used in the interface and allows her to do many things. 
 * @author Lizzie DelMonico
 */
public class Alex implements Contract{
    
    public String item;
    public String direction;
    int x;
    int y;
    public ArrayList<String> inventory;
    public String potion; 

    public Alex(){
        this.inventory = new ArrayList<String>();
    }

    /**
     * Grabs an item from the ground. 
     * @param item: The item that is being picked up.
     */
    public void grab(String item){
        this.inventory.add(item);
    }

    /**
     * Drops an item that was previously grabbed. 
     * @param item: The item that is being dropped. 
     */
    public String drop(String item){
        this.inventory.remove(item);
        return item;
    }

    /**
     * Examines an item that has been picked up. 
     * @param item: The item that is being examined. 
     */
    public void examine(String item){
        if (inventory.contains(item)){
            System.out.println(item);
        }
    }

    /**
     * Uses an item. 
     * @param item: The item being used.
     */
    public void use(String item){
        this.inventory.remove(item);
        System.out.println("This item has been used.");
    }

    /**
     * Moves Alex in a specific direction.
     * @param direction: The direction Alex is moving in. 
     */
    public boolean walk(String direction){
        if (direction == "forward"){
            return true;
        }
        if (direction == "backward"){
            return true;
        }
        else{
            return false;
        }
        
    }

    /**
     * 
     * @param x: How far Alex will fly.
     * @param y: How high Alex will fly.
     */
    public boolean fly(int x, int y){
        if (x >= 0 || y >= 0){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Shrinks Alex and makes her half her original size. 
     */
    public Number shrink(){
        if (potion == "shrinking"){
            System.out.println("Alex is now half her original size.");
            return 0.5;
        }
        else{
            return 1;
        }
    }

    /**
     * Grows Alex and makes her twice her original size. 
     */
    public Number grow(){
        if (potion == "growing"){
            System.out.println("Alex is now twice her original size.");
            return 2;
        }
        else{
            return 1;
        }
    }

    /**
     * Lets Alex sleep through the night. 
     */
    public void rest(){
        System.out.println("Alex is now sleeping.");
    }

    /**
     * Undoes a previously completed method. 
     */
    public void undo(){
        System.out.println("Silly goose! You can't do that!!");
    }

}
