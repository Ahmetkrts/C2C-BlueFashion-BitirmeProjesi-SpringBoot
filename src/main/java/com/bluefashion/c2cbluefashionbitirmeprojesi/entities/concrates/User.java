package com.bluefashion.c2cbluefashionbitirmeprojesi.entities.concrates;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;
    @Column(name = "user_first_name")
    private String userFirstName;
    @Column(name = "user_last_name")
    private String userLastName;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_password")
    private String userPassword;
    @Column(name = "user_mail")
    private String userMail;
    @Column(name = "user_country")
    private String userCountry;
    @Column(name = "user_register_date")
    private Date userRegisterDate;
    @Column(name = "user_about")
    private String userAbout;
    @Column(name = "user_seller")
    private String userSeller;

    @OneToOne
    @JoinColumn(name = "cover_image_id")
    private Image coverImage;

    @OneToOne
    @JoinColumn(name = "profile_image_id")
    private Image profileImage;


}
