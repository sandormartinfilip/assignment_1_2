package com.filip.airport.persistence.entity;

import com.filip.airport.persistence.AirplaneType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * Created by sandof on 10/20/2017.
 */
@Entity
@Table(name="flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AirplaneType airplaneType;



    @OneToOne
    @JoinColumn(name="departure_city_id")
    private City departureCity;

    @NotNull
    @Column(nullable = false)
    private LocalDateTime departureTime;

    @OneToOne
    @JoinColumn(name="arrival_city_id")
    private City arrivalCity;

    @NotNull
    @Column(nullable = false)
    private LocalDateTime arrivalTime;

    public Flight() {
    }

    public Flight(AirplaneType airplaneType, City departureCity, LocalDateTime departureTime, City arrivalCity, LocalDateTime arrivalTime) {
        this.airplaneType = airplaneType;
        this.departureCity = departureCity;
        this.departureTime = departureTime;
        this.arrivalCity = arrivalCity;
        this.arrivalTime = arrivalTime;
    }

    public AirplaneType getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(AirplaneType airplaneType) {
        this.airplaneType = airplaneType;
    }

    public City getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(City departureCity) {
        this.departureCity = departureCity;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public City getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(City arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}
