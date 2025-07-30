package com.hamuksoft.bankbpmsubsytems.modules.GestionInmueble.domain;

import java.util.Optional;

public interface IInmuebleRepositorio {
    Inmueble guardar(Inmueble inmueble);
    Optional<Inmueble> buscarPorId(String id);
    void eliminar(String id);
    Inmueble actualizar(Inmueble inmueble);
}