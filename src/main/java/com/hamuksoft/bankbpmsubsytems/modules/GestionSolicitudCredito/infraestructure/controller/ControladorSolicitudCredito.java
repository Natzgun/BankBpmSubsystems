package com.hamuksoft.bankbpmsubsytems.modules.GestionSolicitudCredito.infraestructure.controller;
import com.hamuksoft.bankbpmsubsytems.modules.GestionSolicitudCredito.application.Servicio.IGestionarSolicitudCredito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/solicitud-credito")
public class ControladorSolicitudCredito {
    @Autowired
    private IGestionarSolicitudCredito gestionarSolicitudCredito;

    @PostMapping("/evaluar-solicitud")
    public Map<String, Object> recibirSolicitud(@RequestBody Map<String, Object> body) {
        return gestionarSolicitudCredito.evaluarSolicitud(body);
    }
}
