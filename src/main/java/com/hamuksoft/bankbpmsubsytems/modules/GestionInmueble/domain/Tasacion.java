package com.hamuksoft.bankbpmsubsytems.modules.GestionInmueble.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class Tasacion {
    private String id;
    private String idInmueble;
    private double valorTasacion;
    private String informe;
    private boolean validado;
    private LocalDate fechaTasacion;

    @Override
    public String toString() {
        return "Tasacion{" +
                "id='" + id + '\'' +
                ", idInmueble='" + idInmueble + '\'' +
                ", valorTasacion=" + valorTasacion +
                ", informe='" + informe + '\'' +
                ", validado=" + validado +
                ", fechaTasacion=" + fechaTasacion +
                '}';
    }
}