package org.ncu.hirewheels.entities;

import javax.persistence.*;

@Entity
@Table(name = "vehicle_subcategory") // The name of the database table
public class VehicleSubcategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_subcategory_id")
    private Long subcategoryId;

    public Long getSubcategoryId() {
		return subcategoryId;
	}

	public void setSubcategoryId(Long subcategoryId) {
		this.subcategoryId = subcategoryId;
	}

	public String getSubcategoryName() {
		return subcategoryName;
	}

	public void setSubcategoryName(String subcategoryName) {
		this.subcategoryName = subcategoryName;
	}

	public float getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(float pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public VehicleCategory getCategory() {
		return category;
	}

	public void setCategory(VehicleCategory category) {
		this.category = category;
	}

	@Column(name = "vehicle_subcategory_name", length = 50, nullable = false, unique = true)
    private String subcategoryName;

    @Column(name = "price_per_day", precision = 10, scale = 2, nullable = false)
    private float pricePerDay;

    @ManyToOne
    @JoinColumn(name = "vehicle_category_id", referencedColumnName = "category_id")
    private VehicleCategory category;

    // Getters and setters for the above attributes

    // You can also add constructors and other methods as needed

    @Override
    public String toString() {
        return "VehicleSubcategory{" +
               "subcategoryId=" + subcategoryId +
               ", subcategoryName='" + subcategoryName + '\'' +
               ", pricePerDay=" + pricePerDay +
               // Include other attributes as needed
               '}';
    }
}
