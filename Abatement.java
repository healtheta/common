package org.healtheta.model.common;


import javax.persistence.*;
import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.Date;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "_Abatement")
public class Abatement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id")
    private Long id;

    @Column(name = "_abatementDateTime")
    private Date abatementDateTime;

    @Column(name = "_abatementAge")
    private Integer abatementAge;

    @Column(name = "_abatementBoolean")
    private boolean abatementBoolean;

    @OneToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL)
    @JoinColumn(name = "_abatementPeriod")
    private Period abatementPeriod;

    //TODO RANGE
    @Column(name = "_abatementString")
    private String abatementString;
}
