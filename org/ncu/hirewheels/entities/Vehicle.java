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
//@Table(name = "vehicle") // The name of the database table
//public class Vehicle {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "vehicle_id")
//    private Long vehicleId;
//
//    public Long getVehicleId() {
//		return vehicleId;
//	}
//
//	public void setVehicleId(Long vehicleId) {
//		this.vehicleId = vehicleId;
//	}
//
//	public String getVehicleModel() {
//		return vehicleModel;
//	}
//
//	public void setVehicleModel(String vehicleModel) {
//		this.vehicleModel = vehicleModel;
//	}
//
//	public String getVehicleNumber() {
//		return vehicleNumber;
//	}
//
//	public void setVehicleNumber(String vehicleNumber) {
//		this.vehicleNumber = vehicleNumber;
//	}
//
//	public VehicleSubcategory getSubcategory() {
//		return subcategory;
//	}
//
//	public void setSubcategory(VehicleSubcategory subcategory) {
//		this.subcategory = subcategory;
//	}
//
//	public String getColor() {
//		return color;
//	}
//
//	public void setColor(String color) {
//		this.color = color;
//	}
//
//	public Location getLocation() {
//		return location;
//	}
//
//	public void setLocation(Location location) {
//		this.location = location;
//	}
//
//	public FuelType getFuelType() {
//		return fuelType;
//	}
//
//	public void setFuelType(FuelType fuelType) {
//		this.fuelType = fuelType;
//	}
//
//	public Integer getAvailabilityStatus() {
//		return availabilityStatus;
//	}
//
//	public void setAvailabilityStatus(Integer availabilityStatus) {
//		this.availabilityStatus = availabilityStatus;
//	}
//
//	public String getVehicleImageUrl() {
//		return vehicleImageUrl;
//	}
//
//	public void setVehicleImageUrl(String vehicleImageUrl) {
//		this.vehicleImageUrl = vehicleImageUrl;
//	}
//
//	@Column(name = "vehicle_model", length = 50, nullable = false)
//    private String vehicleModel;
//
//    @Column(name = "vehicle_number", length = 10, nullable = false)
//    private String vehicleNumber;
//
////    @ManyToOne
////    @JoinColumn(name = "vehicle_subcategory_id", referencedColumnName = "subcategory_id")
//    private VehicleSubcategory subcategory;
//
//    @Column(name = "color", length = 50, nullable = false)
//    private String color;
//
//    @ManyToOne
//    @JoinColumn(name = "location_id", referencedColumnName = "location_id")
//    private Location location;
//
////    @ManyToOne
////    @JoinColumn(name = "fuel_type_id", referencedColumnName = "fuel_type_id")
//    private FuelType fuelType;
//
//    @Column(name = "availability_status", nullable = false)
//    private Integer availabilityStatus;
//
//    @Column(name = "vehicle_image_url", length = 500, nullable = false)
//    private String vehicleImageUrl;
//
//    // Getters and setters for the above attributes
//
//    // You can also add constructors and other methods as needed
//
//    @Override
//    public String toString() {
//        return "Vehicle{" +
//               "vehicleId=" + vehicleId +
//               ", vehicleModel='" + vehicleModel + '\'' +
//               ", vehicleNumber='" + vehicleNumber + '\'' +
//               ", color='" + color + '\'' +
//               // Include other attributes as needed
//               '}';
//    }
//}
