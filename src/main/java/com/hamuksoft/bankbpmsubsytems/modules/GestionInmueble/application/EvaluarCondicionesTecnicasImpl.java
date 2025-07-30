package com.hamuksoft.bankbpmsubsytems.modules.GestionInmueble.application;
import com.hamuksoft.bankbpmsubsytems.modules.GestionInmueble.application.servicio.IEvaluarCondicionesTecnicas;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class EvaluarCondicionesTecnicasImpl implements IEvaluarCondicionesTecnicas {

    @Override
    public Map<String, Object> evaluarRequisitos(Map<String, Object> datos) {
        System.out.println("Evaluando Condiciones Técnicas: " + datos);
        boolean condicionesCumplidas = (int) datos.get("montoPreAprobado") <= (int) datos.get("tasacionValor");
        return Map.of("condicionesCumplidas", condicionesCumplidas);
    }
}
