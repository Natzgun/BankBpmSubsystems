package com.hamuksoft.bankbpmsubsytems.modules.GestionInmueble.application;
import com.hamuksoft.bankbpmsubsytems.modules.GestionInmueble.application.servicio.IGestionInmueble;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class GestionInmuebleImpl implements IGestionInmueble {

    @Override
    public Map<String, Object> registrarInmueble(Map<String, Object> datos) {
        System.out.println("Registrando Inmueble: " + datos);
        return Map.of("inmuebleUuid", 2);
    }
}
