package com.fabo.portfolio.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
public class Profile {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name;

    private String lastName;

    private String label;

    private String profilePictureUrl;

    private String profilePictureBgUrl;

    private String profileBgUrl;


}
