package com.fabo.portfolio.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter @Getter
public class Experience {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String enterprise;

    private String logoUrl;

    private String position;

    private String startDate;

    private String endDate;

    @ElementCollection
    private List<String> jobDetails;

}
