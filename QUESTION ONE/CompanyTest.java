package vu.oop_exam;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Collections;

/**
 *
 * @author phill
 Question 1c) JUnit tests for the Company class
 */

class CompanyTest {

    private Company company;
    private Passenger passenger;
    private Location pickup;
    private Location dest;

    @BeforeEach
    void setUp() {
        passenger = new Passenger();
        pickup   = new Location(10, 20);
        dest     = new Location(30, 40);
    }

    // unit Test 1
    void scheduleVehicle_Succeeds_WhenVehicleAvailable() {
        // Arrange: Company with one taxi of capacity ≥1
        Vehicle taxi = new Taxi(4);
        company = new Company(Collections.singletonList(taxi));

        // Act
        boolean scheduled = company.scheduleVehicle(passenger, pickup, dest);

        // Assert
        assertTrue(scheduled, "Should schedule when a vehicle is free");
        assertEquals(Vehicle.Status.EN_ROUTE, taxi.getStatus());
    }

    //unit test 2
    void scheduleVehicle_Fails_WhenNoVehicleAvailable() {
        // Arrange: Company with no vehicles
        company = new Company(Collections.emptyList());

        // Act
        boolean scheduled = company.scheduleVehicle(passenger, pickup, dest);

        // Assert
        assertFalse(scheduled, "Should return false when no vehicles exist");
    }
}
