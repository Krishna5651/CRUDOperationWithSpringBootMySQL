/**
 * Created By Krishna Shinde
 * Date : 17-07-2023
 * Time : 14:17
 * Project: CRUDOperationWithSpringBoot
 **/

package com.mahagan.crudoperationwithspringboot.repository;

import com.mahagan.crudoperationwithspringboot.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {

}
