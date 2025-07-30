package com.hamuksoft.bankbpmsubsytems.modules.GestionSolicitudCredito.application.Servicio;

import java.util.Map;

public interface IGestionarSolicitudCredito {
    Map<String, Object> evaluarSolicitud(Map<String, Object> datos);
}
