package com.proyectoasistencia.prasis.controller;


import com.proyectoasistencia.prasis.models.InstructorModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstructorController {

    @RequestMapping(value = "ObtenerInstructor")
    public InstructorModel getInstructor(){
        InstructorModel Instructor = new InstructorModel();
        return Instructor;
    }

    @RequestMapping(value = "setInstructor")
    public InstructorModel setInstructor(int nuevoDocumento,
                                         int nuevoIDUsuario,
                                         int nuevoIDTipoDocumento,
                                         String nuevosNombres,
                                         String nuevosApellidos,
                                         int nuevoIDGenero,
                                         int nuevoTelefono,
                                         String nuevaArea,
                                         int nuevoIDRol,
                                         int nuevaIDSede){

        InstructorModel instructor = new InstructorModel();
        instructor.setDocumento(nuevoDocumento);
        instructor.setIDUsuarioInstructor(nuevoIDUsuario);
        instructor.setIDTipoDocumento(nuevoIDTipoDocumento);
        instructor.setNombres(nuevosNombres);
        instructor.setApellidos(nuevosApellidos);
        instructor.setIDGenero(nuevoIDGenero);
        instructor.setTelefono(nuevoTelefono);
        instructor.setArea(nuevaArea);
        instructor.setIDRol(nuevoIDRol);
        instructor.setIDSede(nuevaIDSede);
        return instructor;
    }
}
