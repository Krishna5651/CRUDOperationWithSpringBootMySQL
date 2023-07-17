/**
 * Created By Krishna Shinde
 * Date : 16-07-2023
 * Time : 22:35
 * Project: CRUDOperationWithSpringBoot
 **/

package com.mahagan.crudoperationwithspringboot.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String admin_Name;
    private String admin_Address;
    private String admin_Age;
}


