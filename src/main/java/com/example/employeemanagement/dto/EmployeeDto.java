package com.example.employeemanagement.dto;

public class EmployeeDto {
        private Long id;
        private String name;
        private String designation;
        private String email;
        private Long mobile;
        private Double salary;

        public Long getId() {
        return id;}


        public void setId(Long id) {
        this.id = id;
    }

        public String getName() {
        return name;
    }

        public void setName(String name) {
        this.name = name;
    }

        public String getDesignation() {
        return designation;
    }

        public void setDesignation(String designation) {
        this.designation = designation;
    }

        public String getEmail() {
        return email;
    }

        public void setEmail(String email) {
        this.email = email;
    }

        public Long getMobile() {
        return mobile;
    }

        public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

        public Double getSalary() {
        return salary;
    }

        public void setSalary(Double salary) {
        this.salary = salary;
    }

}
