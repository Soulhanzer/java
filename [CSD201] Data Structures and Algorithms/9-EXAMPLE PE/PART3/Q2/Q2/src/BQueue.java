// ======= DO NOT EDIT THIS FILE ============
import java.util.*;
public class BQueue
  {LinkedList<Node> t;
   BQueue() {t=new LinkedList<Node>();}
   boolean isEmpty() {return(t.isEmpty());}
   void enqueue(Node p) {t.addLast(p);}
   Node dequeue() 
     {if(isEmpty()) return(null);
      return(t.removeFirst());
     }
  }
