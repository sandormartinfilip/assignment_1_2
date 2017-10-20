package com.filip.airport.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by sandof on 10/20/2017.
 */
@Entity
@Table(name="cities")
public class City {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private Float longitude;

    @NotNull
    private Float latitude;

}
