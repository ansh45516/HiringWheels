package org.ncu.hirewheels.entities;

import javax.persistence.*;

@Entity
@Table(name = "role") // The name of the database table
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long roleId;

    public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Column(name = "role_name", length = 50, nullable = false, unique = true)
    private String roleName;

    // Getters and setters for the above attributes

    // You can also add constructors and other methods as needed

    @Override
    public String toString() {
        return "Role{" +
               "roleId=" + roleId +
               ", roleName='" + roleName + '\'' +
               '}';
    }
}
