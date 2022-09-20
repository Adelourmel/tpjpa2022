package com.springproject.springproject.domain;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Doctor extends Person implements Serializable {

    @NotNull
    private Specialisation specialisation;

    public Doctor() {}

    public Doctor(String firstName, String lastName, Specialisation spe) {
        super(firstName, lastName);
        this.specialisation = spe; }

    public Doctor(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Enumerated(EnumType.ORDINAL)
    public Specialisation getSpecialisation() {
        return specialisation;
    }

    @Enumerated(EnumType.ORDINAL)
    public void setSpecialisation(Specialisation specialisation) {
        this.specialisation = specialisation;
    }

    @Override
    public String toString() {
        return "Medecin [id=" + id + ", first name=" + firstName + ", last name=" + lastName + ", specialisation=" + specialisation.toString();
    }
}

