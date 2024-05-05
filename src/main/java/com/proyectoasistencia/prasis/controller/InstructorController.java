package com.proyectoasistencia.prasis.controller;


import com.proyectoasistencia.prasis.models.InstructorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;

@RestController
public class InstructorController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "ObtenerInstructor/{IDInstructor}")
    public InstructorModel getInstructor(@PathVariable Integer IDInstructor){
        String consulta = "SELECT perfilinstructor.Documento, perfilinstructor.Nombres, perfilinstructor.Apellidos, perfilinstructor.Telefono, perfilinstructor.Area, TipoDocumento.TipoDocumento, Genero.TiposGeneros, Rol.TipoRol, Sede.CentroFormacion FROM perfilinstructor INNER JOIN TipoDocumento ON perfilinstructor.IDTipoDocumento = TipoDocumento.ID INNER JOIN Genero ON perfilinstructor.IDGenero = Genero.ID INNER JOIN Rol ON perfilinstructor.IDRol = Rol.ID INNER JOIN Sede ON perfilinstructor.IDSede = Sede.ID WHERE perfilinstructor.Documento = ?";

        try {
            return jdbcTemplate.queryForObject(consulta, new Object[]{IDInstructor}, new RowMapper<InstructorModel>() {
                @Override
                public InstructorModel mapRow(ResultSet rs, int rowNum) throws SQLException {
                    InstructorModel instructor = new InstructorModel();
                    instructor.setDocumento(rs.getInt("Documento"));
                    instructor.setTipoDocumento(rs.getString("TipoDocumento"));
                    instructor.setNombres(rs.getString("nombres"));
                    instructor.setApellidos(rs.getString("apellidos"));
                    instructor.setGenero(rs.getString("TiposGeneros"));
                    instructor.setTelefono(rs.getInt("Telefono"));
                    instructor.setArea(rs.getString("Area"));
                    instructor.setRol(rs.getString("TipoRol"));
                    instructor.setSede(rs.getString("CentroFormacion"));
                    return instructor;
                }
            });
        } catch (Exception e) {
            // Imprime la traza de la pila de la excepción en caso de que ocurra un error.
            e.printStackTrace();
        }
        return null;
    }
}

