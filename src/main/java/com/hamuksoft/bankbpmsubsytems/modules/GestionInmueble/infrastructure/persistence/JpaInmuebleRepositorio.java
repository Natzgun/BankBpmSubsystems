package com.hamuksoft.bankbpmsubsytems.modules.GestionInmueble.infrastructure.persistence;

import com.hamuksoft.bankbpmsubsytems.modules.GestionInmueble.domain.IInmuebleRepositorio;
import com.hamuksoft.bankbpmsubsytems.modules.GestionInmueble.domain.Inmueble;

import java.util.Optional;

public class JpaInmuebleRepositorio implements IInmuebleRepositorio {

    @Override
    public Inmueble guardar(Inmueble inmueble) {
        return null;
    }

    @Override
    public Optional<Inmueble> buscarPorId(String id) {
        return Optional.empty();
    }

    @Override
    public void eliminar(String id) {
    }

    @Override
    public Inmueble actualizar(Inmueble inmueble) {
        return null;
    }
}
