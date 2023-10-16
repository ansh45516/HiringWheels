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
//@Table(name = "location") // The name of the database table
//public class Location {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "location_id")
//    private Long locationId;
//
//    public Long getLocationId() {
//		return locationId;
//	}
//
//	public void setLocationId(Long locationId) {
//		this.locationId = locationId;
//	}
//
//	public String getLocationName() {
//		return locationName;
//	}
//
//	public void setLocationName(String locationName) {
//		this.locationName = locationName;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public City getCity() {
//		return city;
//	}
//
//	public void setCity(City city) {
//		this.city = city;
//	}
//
//	public String getPincode() {
//		return pincode;
//	}
//
//	public void setPincode(String pincode) {
//		this.pincode = pincode;
//	}
//
//	@Column(name = "location_name", length = 50, nullable = false)
//    private String locationName;
//
//    @Column(name = "address", length = 100, nullable = false)
//    private String address;
//
//    @ManyToOne
//    @JoinColumn(name = "city_id", referencedColumnName = "city_id")
//    private City city;
//
//    @Column(name = "pincode", length = 6, nullable = false)
//    private String pincode;
//
//    // Getters and setters for the above attributes
//
//    // You can also add constructors and other methods as needed
//
//    @Override
//    public String toString() {
//        return "Location{" +
//               "locationId=" + locationId +
//               ", locationName='" + locationName + '\'' +
//               ", address='" + address + '\'' +
//               ", pincode='" + pincode + '\'' +
//               // Include other attributes as needed
//               '}';
//    }
//}
