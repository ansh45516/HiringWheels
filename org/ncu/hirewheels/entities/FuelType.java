package org.ncu.hirewheels.entities;

import javax.persistence.*;

@Entity
@Table(name = "fuel_type") // The name of the database table
public class FuelType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fuel_type_id")
    private Long fuelTypeId;

    @Column(name = "fuel_type", length = 50, nullable = false, unique = true)
    private String fuelType;

    // Getters and setters for the above attributes

    // You can also add constructors and other methods as needed

    @Override
    public String toString() {
        return "FuelType{" +
               "fuelTypeId=" + fuelTypeId +
               ", fuelType='" + fuelType + '\'' +
               '}';
    }

	public Long getFuelTypeId() {
		return fuelTypeId;
	}

	public void setFuelTypeId(Long fuelTypeId) {
		this.fuelTypeId = fuelTypeId;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
}
