package org.healtheta.model.common;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "_Reference")
public class Reference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "_id")
    private Long id;

    @Column(name = "_reference")
    private String reference;

    @OneToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL)
    @JoinColumn(name = "_identifier")
    private Identifier identifier;

    @Column(name = "_display")
    private String display;

    public Long getId() {
        return id;
    }

    public String getReference() {
        return reference;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public String getDisplay() {
        return display;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
}
