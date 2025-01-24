package com.ust.capstone.role_service.entity;

// import java.util.List;

// import com.fasterxml.jackson.annotation.JsonBackReference;
// import com.ust.capstone.role_service.pojo.UserInfoPojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="roles_details")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="role_id")
    private int roleId;
    @Column(name = "role_name")
    private String roleName;

    // @OneToMany(mappedBy = "roleInfo")
    // @JsonBackReference
    // private List<UserInfoPojo> allUsers;
}
