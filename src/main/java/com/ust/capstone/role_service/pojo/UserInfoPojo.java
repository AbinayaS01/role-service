package com.ust.capstone.role_service.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class UserInfoPojo {
    
    private int userId;
    private String username;
    private String password;
    private String roleId;
}
