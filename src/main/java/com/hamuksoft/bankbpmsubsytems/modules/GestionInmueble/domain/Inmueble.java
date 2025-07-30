package com.hamuksoft.bankbpmsubsytems.modules.GestionInmueble.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class Inmueble {
    private String id;
    private String propietarioNombre;
    private String propietarioDni;
    private String direccion;
    private LocalDate fechaRegistro;

    @Override
    public String toString() {
        return "Inmueble{" +
                "id='" + id + '\'' +
                ", propietarioNombre='" + propietarioNombre + '\'' +
                ", propietarioDni='" + propietarioDni + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fechaRegistro=" + fechaRegistro +
                '}';
    }
}