package com.geekster.UserManagementAssignmentValidation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    private Integer userId;
    private String userName;
    private String userDOB;
    private String userEmail;
    private Integer userNumber;
    private LocalDate userDate;
    private LocalTime userTime;
}
