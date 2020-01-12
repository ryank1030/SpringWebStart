package com.example.thing.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Data
@Table(name = "Thing")
public class Thing {

    @Id
    @Column(name = "THING_ID")
    @Type(type = "uuid-char")
    @Setter(AccessLevel.NONE)
    private UUID thingId;

    @Column(name = "NAME")
    private String name;
}
