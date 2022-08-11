package com.fabo.portfolio.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter @Setter
public class Study {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String institute;

    private String certified;

    private String logoUrl;

    private String startDate;

    private String endDate;

    private String description;

}
