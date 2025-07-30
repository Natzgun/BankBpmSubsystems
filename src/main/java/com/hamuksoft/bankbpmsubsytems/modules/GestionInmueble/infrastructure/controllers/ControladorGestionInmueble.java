package com.hamuksoft.bankbpmsubsytems.modules.GestionInmueble.infrastructure.controllers;
import com.hamuksoft.bankbpmsubsytems.modules.GestionInmueble.application.servicio.IGestionInmueble;
import com.hamuksoft.bankbpmsubsytems.modules.GestionInmueble.application.servicio.IEvaluarCondicionesTecnicas;
import com.hamuksoft.bankbpmsubsytems.modules.GestionInmueble.application.servicio.IAdministrarTasacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/gestion-inmueble")
public class ControladorGestionInmueble {
    @Autowired
    private IGestionInmueble gestionInmueble;
    @Autowired
    private IEvaluarCondicionesTecnicas evaluarCondicionesTecnicas;
    @Autowired
    private IAdministrarTasacion administrarTasacion;

    @PostMapping("/registrar-inmueble")
    public Map<String, Object> registrarInmueble(@RequestBody Map<String, Object> body) {
        return gestionInmueble.registrarInmueble(body);
    }

    @PostMapping("/iniciar-tasacion")
    public Map<String, Object> iniciarTasacion(@RequestBody Map<String, Object> body) {
        return administrarTasacion.iniciarTasacion(body);
    }

    @PostMapping("/evaluar-requisitos")
    public Map<String, Object> evaluarRequisitos(@RequestBody Map<String, Object> body) {
        return evaluarCondicionesTecnicas.evaluarRequisitos(body);
    }
}