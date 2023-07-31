package com.example_collinsromeo.weeksixtask.Model;

import com.example_collinsromeo.weeksixtask.Enum.Gender;
import lombok.Builder;
import lombok.Data;

//@Builder
@Data
public class User {
    private int age;
    private int id;
    private String first_name;
    private String last_name;
    private String birth_date;
    private String email;
    private String password;
    private String phone_number;
    private Gender gender;


    public User(int id, String first_name, String last_name, String birth_date, String email, String password, String phone_number,Gender gender) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.birth_date = birth_date;
        this.email = email;
        this.password = password;
        this.phone_number = phone_number;
        this.gender = gender;
    }

    public User(String email, String password, String phone_number, int age, String gender) {
        this.email = email;
        this.password = password;
        this.phone_number = phone_number;
        this.age = age;
        this.gender = Gender.valueOf(gender);
    }

    public User() {}


}
