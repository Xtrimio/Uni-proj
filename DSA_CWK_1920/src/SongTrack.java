import java.util.LinkedList;

public class SongTrack 
{ 
    public static void main(String args[]) 
    { 
     
        LinkedList<String> object = new LinkedList<String>(); 
  
        
        object.add("Track ID"); 
        object.add("Track Title"); 
        object.addLast("Artist"); 
        object.addFirst("Track Lenght"); 
        object.add(2, "Composer"); 
        object.add("Relese Date"); 
        object.add("Album"); 
        object.add("Genre"); 
        System.out.println("Linked list : " + object); 
  
        
        object.remove("Terack Title"); 
        object.remove(3); 
        object.removeFirst(); 
        object.removeLast(); 
        System.out.println("Linked list after deletion: " + object); 
  
        
        boolean status = object.contains("E"); 
  
        if(status) 
            System.out.println("List contains the element 'E' "); 
        else
            System.out.println("List doesn't contain the element 'E'"); 
  
        
        int size = object.size(); 
        System.out.println("Size of linked list = " + size); 
  
        
        Object element = object.get(2); 
        System.out.println("Element returned by get() : " + element); 
        object.set(2, "Y"); 
        System.out.println("Linked list after change : " + object); 
    } 
    public class TrackID {
    	  int x; 

    	  
    	  public TrackID() {
    	    x = 5;  
    	  }

    	  public void main(String[] args) {
    		  TrackID myObj = new TrackID(); 
    	    System.out.println(myObj.x); 
    	  }
    	}
}
