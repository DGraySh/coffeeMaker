package com.dgraysh.coffeemaker.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "BREWED")
public class BrewedDrink {

    @Id
    @Column(name = "BREWED_AT")
    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime brewTime;

    @ManyToOne
    @JoinColumn(name = "DRINK_ID")
    private Drink drink;

}
