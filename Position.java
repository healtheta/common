package org.healtheta.model.common;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "_Position")
public class Position {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "_id")
    private Long id;

    @Column(name = "_longitude")
    private String longitude;

    @Column(name = "_latitude")
    private String latitude;

    @Column(name = "_altitude")
    private String altitude;
}
