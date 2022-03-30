package com.bluefashion.c2cbluefashionbitirmeprojesi.entities.concrates;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "images")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private int imageId;
    @Column(name = "image_subinfo")
    private String imageSubInfo;
    @Column(name = "image_Url")
    private String imageUrl;

    @OneToOne(mappedBy = "coverImage")
    private User coverUser;

    @OneToOne(mappedBy = "profileImage")
    private User profileUser;

}
