/**
 * Created By Krishna Shinde
 * Date : 17-07-2023
 * Time : 14:19
 * Project: CRUDOperationWithSpringBoot
 **/

package com.mahagan.crudoperationwithspringboot.service;

import com.mahagan.crudoperationwithspringboot.domain.Admin;

import java.util.List;

public interface AdminServiceImpl {
    Admin saveAdmin(Admin admin);

    List<Admin> fecthAdminList();

    Admin updateAdmin(Admin admin, int id);

    void deleteAdminById(int id);

}
