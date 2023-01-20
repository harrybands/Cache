
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class CacheTest {
	
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
	
    	long startTime;
    	long endTime; 

	    startTime = System.currentTimeMillis(); // starts counting the elapsed time
	    
	    FileInputStream fileIn;
	    Cache<Player> playerCache = null;
	    ArrayList<Player> playerList; // array list that stores player data's name
        try {
            fileIn = new FileInputStream(args[1]);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            playerList = (ArrayList<Player>) in.readObject();
            in.close();
            
            playerCache = new Cache<Player>(Integer.parseInt(args[0])); // reads the cache size in the data

            for(Player playerInfo: playerList) {
            	if(playerCache.getObject(playerInfo) == null) { // check if the player info exists 
            		playerCache.addObject(playerInfo);
            	}
            	else { // otherwise 
            		playerCache.removeCache(playerInfo);
            		playerCache.addObject(playerInfo);
            		playerCache.hits++; // update hit variable
            	}
            	playerCache.references++; // update references variable 
            }
            endTime = System.currentTimeMillis(); // ends counting the elapsed time
            
           playerCache.setEllapsedTime(endTime - startTime);

            System.out.println(playerCache.toString()); // prints out the 

        } catch (IOException e) { // catch io exception if if it exists
            e.printStackTrace();
        } catch (ClassNotFoundException e) { // catch class not found exception if it exists
            e.printStackTrace();
        }
	}
}
