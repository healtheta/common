package org.healtheta.model.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "_Quantity")
public class Quantity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "_id")
    private Long id;

    @Column(name = "_value")
    private Integer value;

    @Column(name = "_comparator")
    private String comparator;

    @Column(name = "_unit")
    private String unit;

    @Column(name = "_system")
    private String system;

    @Column(name = "_code")
    private String code;
}
