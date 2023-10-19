package com.self.bookmyshow.models;

import com.self.bookmyshow.models.constants.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class City extends BaseModel {
    @Column(name = "CityName")
    private String name;
    @OneToMany
    private List<Theatre> theatres;
}
