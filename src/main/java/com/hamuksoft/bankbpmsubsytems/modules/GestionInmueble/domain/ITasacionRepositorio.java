package com.hamuksoft.bankbpmsubsytems.modules.GestionInmueble.domain;

import java.util.Optional;

public interface ITasacionRepositorio {
    Tasacion guardar(Tasacion tasacion);
    Optional<Tasacion> buscarPorId(String id);
    void eliminar(String id);
    Tasacion actualizar(Tasacion tasacion);
}