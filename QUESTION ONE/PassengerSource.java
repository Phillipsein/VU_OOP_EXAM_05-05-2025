package vu.oop_exam;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author phill

 QUESTION ONE b)
 */

public class PassengerSource {
    private final Company company;

    /**
     * Constructs a PassengerSource tied to a specific Company.
     */
    public PassengerSource(Company company) {
        this.company = company;
    }

    /**
     * this generates a new Passenger request with random pickup/destination
     * locations (coordinates 0–100) and asks the company to schedule it.
     *
     * @return true if the company schedules a vehicle successfully; false otherwise
     */
    public boolean requestPickup() {
        Passenger passenger = new Passenger();

        // Generate random coordinates in [0,100]
        int px = ThreadLocalRandom.current().nextInt(0, 101);
        int py = ThreadLocalRandom.current().nextInt(0, 101);
        int dx = ThreadLocalRandom.current().nextInt(0, 101);
        int dy = ThreadLocalRandom.current().nextInt(0, 101);

        Location pickup      = new Location(px, py);
        Location destination = new Location(dx, dy) {};

        // Delegate to Company; returns true if a vehicle was assigned
        return company.scheduleVehicle(passenger, pickup, destination);
    }
}
