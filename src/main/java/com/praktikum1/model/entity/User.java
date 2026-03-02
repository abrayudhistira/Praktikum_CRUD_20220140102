package com.praktikum1.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "users")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

}
