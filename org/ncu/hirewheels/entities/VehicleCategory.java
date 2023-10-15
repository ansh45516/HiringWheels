package org.ncu.hirewheels.entities;

import javax.persistence.*;

@Entity
@Table(name = "vehicle_category") // The name of the database table
public class VehicleCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_category_id")
    private Long categoryId;

    @Column(name = "vehicle_category_name", length = 50, nullable = false, unique = true)
    private String categoryName;

    // Getters and setters for the above attributes

    // You can also add constructors and other methods as needed

    public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
    public String toString() {
        return "VehicleCategory{" +
               "categoryId=" + categoryId +
               ", categoryName='" + categoryName + '\'' +
               '}';
    }
}
