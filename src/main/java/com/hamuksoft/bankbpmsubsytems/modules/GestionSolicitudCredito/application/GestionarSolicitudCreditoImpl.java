package com.hamuksoft.bankbpmsubsytems.modules.GestionSolicitudCredito.application;
import com.hamuksoft.bankbpmsubsytems.modules.GestionSolicitudCredito.application.Servicio.IGestionarSolicitudCredito;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class GestionarSolicitudCreditoImpl implements IGestionarSolicitudCredito {
    @Override
    public Map<String, Object> evaluarSolicitud(Map<String, Object> datos) {
        System.out.println("Procesando Solcitud: " + datos);
        return Map.of("mensaje", "ok", "clienteAprobado", false);
    }
}
