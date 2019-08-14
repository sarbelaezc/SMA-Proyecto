package ontology;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: RequestRoutes
* @author ontology bean generator
* @version 2019/08/14, 07:26:48
*/
public class RequestRoutes implements Predicate {

   /**
* Protege name: trips
   */
   private List trips = new ArrayList();
   public void addTrips(Trip elem) { 
     List oldList = this.trips;
     trips.add(elem);
   }
   public boolean removeTrips(Trip elem) {
     List oldList = this.trips;
     boolean result = trips.remove(elem);
     return result;
   }
   public void clearAllTrips() {
     List oldList = this.trips;
     trips.clear();
   }
   public Iterator getAllTrips() {return trips.iterator(); }
   public List getTrips() {return trips; }
   public void setTrips(List l) {trips = l; }

}
