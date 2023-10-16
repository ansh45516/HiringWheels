//package org.ncu.hirewheels.entities;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name = "fuel_type") // The name of the database table
//public class FuelType {
//    public FuelType(Long fuelTypeId, String fuelType) {
//		super();
//		this.fuelTypeId = fuelTypeId;
//		this.fuelType = fuelType;
//	}
//
//	@Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "fuel_type_id")
//    private Long fuelTypeId;
//
//    @Column(name = "fuel_type", length = 50, nullable = false, unique = true)
//    private String fuelType;
//
//    // Getters and setters for the above attributes
//
//    // You can also add constructors and other methods as needed
//
//    @Override
//    public String toString() {
//        return "FuelType{" +
//               "fuelTypeId=" + fuelTypeId +
//               ", fuelType='" + fuelType + '\'' +
//               '}';
//    }
//
//	public Long getFuelTypeId() {
//		return fuelTypeId;
//	}
//
//	public void setFuelTypeId(Long fuelTypeId) {
//		this.fuelTypeId = fuelTypeId;
//	}
//
//	public String getFuelType() {
//		return fuelType;
//	}
//
//	public void setFuelType(String fuelType) {
//		this.fuelType = fuelType;
//	}
//}
