package org.healtheta.model.common;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.*;


import java.io.Serializable;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "Participant")
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL)
    @JoinColumn(name = "_type")
    private CodeableConcept type;

    //TODO convert to reference
    @OneToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL)
    @JoinColumn(name = "_actor")
    private Reference actor;

    @Column(name = "_required")
    private String required; //required|optional|information-only

    @Column(name = "_status")
    private String status; //accepted| declined | tentative | needs-action
}
