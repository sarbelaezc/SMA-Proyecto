package ontology;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: Seat
* @author ontology bean generator
* @version 2019/08/14, 18:52:46
*/
public class Seat implements Concept {

   /**
* Protege name: ocupant
   */
   private String ocupant;
   public void setOcupant(String value) { 
    this.ocupant=value;
   }
   public String getOcupant() {
     return this.ocupant;
   }

}
