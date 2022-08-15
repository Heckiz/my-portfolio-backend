package com.fabo.portfolio.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Activity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String category;

    private String caption;

    private String iconURl;

    private String tooltip;






}
