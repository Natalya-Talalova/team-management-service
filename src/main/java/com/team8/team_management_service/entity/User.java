package com.team8.team_management_service.entity;

import jakarta.persistence.*;

@Entity(name = "users")
public class User {
    //TODO Profile picture, opportunity to be added to the team
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    String name;
    String lastname;
    String position;
    String expirience;
    String messenger;
    int phone_number;
    String skills;
    String area_of_responsibility;
    int age;
    boolean visibility;

     public User(String name, String lastname, int age, String position, String messenger, int phone_number) {
         this.name = name;
         this.lastname = lastname;
         this.age = age;
         this.position = position;
         this.messenger = messenger;
         this.phone_number = phone_number;
     }

     public void setName(String name) {
         if(name.length() < 100) {
             this.name = name;
         } else {
             System.out.println("Имя слишком длинное");
         }
     }

    public void setLastname(String lastname) {
        if(lastname.length() < 100) {
            this.lastname = lastname;
        } else {
            System.out.println("Фамилия слишком длинная");
        }
    }

    public void setAge(int age) {
        if(age < 0) {
            this.age = age;
        } else {
            System.out.println("Возраст не может быть отрицательным");
        }
    }

    public void setPosition(String position) {
        if(position.length() < 100) {
            this.position = position;
        } else {
            System.out.println("Должность слишком длинная");
        }
    }

    public void setExpirience(String expirience) {
         this.expirience = expirience;
    }

    public void setMessenger(String messenger) {
        if(messenger.length() < 100) {
            this.messenger = messenger;
        } else {
            System.out.println("Мессенджер слишком длинный");
        }
    }

    public void setPhone_number(int phone_number) {
        if(phone_number == 11) {
            this.phone_number = phone_number;
        } else {
            System.out.println("Должность слишком длинная");
        }
    }

    public void setSkills(String skills) {
            this.skills = skills;
        }

    public void setArea_of_responsibility(String area_of_responsibility) {
        if(area_of_responsibility.length() < 100) {
            this.area_of_responsibility = area_of_responsibility;
        } else {
            System.out.println("Зона ответственности слишком длинная");
        }
    }

    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPosition() {
        return position;
    }

    public String getExpirience() {
        return expirience;
    }

    public String getMessenger() {
        return messenger;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public String getSkills() {
        return skills;
    }

    public String getArea_of_responsibility() {
        return area_of_responsibility;
    }

    public int getAge() {
        return age;
    }

    public boolean isVisibility() {
        return visibility;
    }
}