/**
 * Created By Krishna Shinde
 * Date : 17-07-2023
 * Time : 14:23
 * Project: CRUDOperationWithSpringBoot
 **/

package com.mahagan.crudoperationwithspringboot.service;

import com.mahagan.crudoperationwithspringboot.domain.Admin;
import com.mahagan.crudoperationwithspringboot.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class AdminService implements AdminServiceImpl {
    @Autowired
    AdminRepository adminRepository;

    @Override
    public Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public List<Admin> fecthAdminList() {
        return (List<Admin>) adminRepository.findAll();
    }

    @Override
    public Admin updateAdmin(Admin admin, int id) {
        Admin admin1 = adminRepository.findById(id).get();
        if (Objects.nonNull(admin.getId())
                && !"".equalsIgnoreCase(admin.getAdmin_Name())) {
            admin1.setAdmin_Name(admin.getAdmin_Name());
        }
        if (Objects.nonNull(admin.getId())
                && !"".equalsIgnoreCase(admin.getAdmin_Age())) {
            admin1.setAdmin_Age(admin.getAdmin_Age());
        }
        if (Objects.nonNull(admin.getId())
                && !"".equalsIgnoreCase(admin.getAdmin_Address())) {
            admin1.setAdmin_Address(admin.getAdmin_Address());
        }
        return adminRepository.save(admin1);
    }

    @Override
    public void deleteAdminById(int id) {
        adminRepository.deleteById(id);
    }
}


