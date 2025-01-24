package com.ust.capstone.role_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.capstone.role_service.dao.RoleRepository;
import com.ust.capstone.role_service.entity.RoleEntity;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public List<RoleEntity> getAllRoles() {
        return roleRepository.findAll();
       
}

    public RoleEntity getRoleById(int id) {
        return roleRepository.findById(id).orElse(null);
    }
    
    public RoleEntity createRole(RoleEntity role) {
        return roleRepository.save(role);
    }
}
