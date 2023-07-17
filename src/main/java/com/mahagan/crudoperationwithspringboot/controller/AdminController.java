/**
 * Created By Krishna Shinde
 * Date : 17-07-2023
 * Time : 14:49
 * Project: CRUDOperationWithSpringBoot
 **/

package com.mahagan.crudoperationwithspringboot.controller;

import com.mahagan.crudoperationwithspringboot.domain.Admin;
import com.mahagan.crudoperationwithspringboot.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {
    @Autowired
    AdminService adminService;

    @PostMapping("/admin")
    public Admin saveAdmin(@RequestBody Admin admin) {
        return adminService.saveAdmin(admin);
    }

    @GetMapping("/admin")
    public List<Admin> fetchAdminDetails() {
        return adminService.fecthAdminList();
    }

    @PutMapping("/admin/{aid}")
    public Admin updateAdminDetails(@RequestBody Admin admin, @PathVariable("aid") int id) {
        return adminService.updateAdmin(admin, id);
    }

    @DeleteMapping("/admin/{aid}")
    public String deleteAdminById(@PathVariable("aid") int id) {
        adminService.deleteAdminById(id);
        return "Resource has been deleted successfully";
    }


}


