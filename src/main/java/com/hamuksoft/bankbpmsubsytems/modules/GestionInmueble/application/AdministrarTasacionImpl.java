package com.hamuksoft.bankbpmsubsytems.modules.GestionInmueble.application;
import com.hamuksoft.bankbpmsubsytems.modules.GestionInmueble.application.servicio.IAdministrarTasacion;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class AdministrarTasacionImpl implements IAdministrarTasacion {

    @Override
    public Map<String, Object> iniciarTasacion(Map<String, Object> datos) {
        System.out.println("Iniciando Tasación: " + datos);
        return Map.of("tasacionUuid", 1, "tasacionValor", 1000000);
    }
}
