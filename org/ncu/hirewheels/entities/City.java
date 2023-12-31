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
//@Table(name = "city") // The name of the database table
//public class City {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "city_id")
//    private Long cityId;
//
//    @Column(name = "city_name", length = 50, nullable = false)
//    private String cityName;
//
//    // Getters and setters for the above attributes
//
//    // You can also add constructors and other methods as needed
//
//    @Override
//    public String toString() {
//        return "City{" +
//               "cityId=" + cityId +
//               ", cityName='" + cityName + '\'' +
//               '}';
//    }
//
//	public Long getCityId() {
//		return cityId;
//	}
//
//	public void setCityId(Long cityId) {
//		this.cityId = cityId;
//	}
//
//	public String getCityName() {
//		return cityName;
//	}
//
//	public void setCityName(String cityName) {
//		this.cityName = cityName;
//	}
//}
