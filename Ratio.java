package org.healtheta.model.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "_Ratio")
public class Ratio {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "_id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
    @JoinColumn(name = "_numerator")
    private Quantity numerator;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL)
    @JoinColumn(name = "_denominator")
    private Quantity denominator;
}
