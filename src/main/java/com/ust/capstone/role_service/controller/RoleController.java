package com.ust.capstone.role_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.capstone.role_service.entity.RoleEntity;
import com.ust.capstone.role_service.service.RoleService;

@RestController
@RequestMapping("/api")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping("/roles")
    public ResponseEntity<List<RoleEntity>> getAllRoles() {
        return new ResponseEntity<List<RoleEntity>>(roleService.getAllRoles(), HttpStatus.OK);

    
}
@GetMapping("/roles/{id}")
public ResponseEntity<RoleEntity> getRoleById(@PathVariable int id) {
    return new ResponseEntity<RoleEntity>(roleService.getRoleById(id), HttpStatus.OK);
}

@PostMapping("/roles")
public ResponseEntity<RoleEntity> createRoles(@RequestBody RoleEntity newRole){
    return new ResponseEntity<RoleEntity>(roleService.createRole(newRole),HttpStatus.OK);
}
}