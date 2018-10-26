package org.healtheta.model.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "_SampleData")
public class SampleData {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "_id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
    @JoinColumn(name = "_origin")
    private Quantity origin;

    @Column(name = "_period")
    private Integer period;

    @Column(name = "_factor")
    private Integer factor;

    @Column(name = "_lowerLimit")
    private Integer lowerLimit;

    @Column(name = "_upperLimit")
    private Integer upperLimit;

    @Column(name = "_dimensions")
    private Integer dimensions;

    @Column(name = "_data")
    private String data;
}

