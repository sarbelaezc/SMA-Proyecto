package ontology;

import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
 * Protege name: Trip
 * 
 * @author ontology bean generator
 * @version 2019/08/14, 07:16:34
 */
@SuppressWarnings({ "serial", "unused" })
public class Trip implements Concept {
	
	/**
	 * Protege name: departureTime
	 */
	private String departureTime;
	
	public Trip(String departureTime, int capacity, int id, int route) {
		super();
		this.departureTime = departureTime;
		this.capacity = capacity;
		this.id = id;
		this.route = route;
	}

	public Trip() {
		super();
	}

	public Trip(String string, int i, int j) {
		this.departureTime = string;
		this.capacity = i;
		this.id = j;
	}

	public void setDepartureTime(String value) {
		this.departureTime = value;
	}

	public String getDepartureTime() {
		return this.departureTime;
	}

	/**
	 * Protege name: Capacity
	 */
	private int capacity;

	public void setCapacity(int value) {
		this.capacity = value;
	}

	public int getCapacity() {
		return this.capacity;
	}

	/**
	 * Protege name: id
	 */
	private int id;

	public void setId(int value) {
		this.id = value;
	}

	public int getId() {
		return this.id;
	}

	/**
	 * Protege name: seats
	 */
	private List seats = new ArrayList();

	public void addSeats(Seat elem) {
		List oldList = this.seats;
		seats.add(elem);
	}

	public boolean removeSeats(Seat elem) {
		List oldList = this.seats;
		boolean result = seats.remove(elem);
		return result;
	}

	public void clearAllSeats() {
		List oldList = this.seats;
		seats.clear();
	}

	public Iterator getAllSeats() {
		return seats.iterator();
	}

	public List getSeats() {
		return seats;
	}

	public void setSeats(List l) {
		seats = l;
	}

	/**
	 * Protege name: route
	 */
	private int route;

	public void setRoute(int value) {
		this.route = value;
	}

	public int getRoute() {
		return this.route;
	}

}
