package com.tocodeacademy.odontologo.controller;

import com.tocodeacademy.odontologo.Paciente;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aplicacionController {
    
    @GetMapping("paciente/traer")
    @ResponseBody
    public List<Paciente> traerPacientes(){
        List <Paciente> listaPacientes = new ArrayList<Paciente>();
        listaPacientes.add(new Paciente(1L, "123456", "Zlatan", "Ibrahimovic", LocalDate.of(2015,8,18)));
        listaPacientes.add(new Paciente(2L, "134679", "Cristiano", "Ronaldo", LocalDate.of(2017, 5, 20)));
        listaPacientes.add(new Paciente(3L, "987654", "Lionel", "Messi", LocalDate.of(2000, 1, 31)));
        listaPacientes.add(new Paciente(4L, "741852", "Lain", "Merengue", LocalDate.of(1987, 5, 20)));
        listaPacientes.add(new Paciente(5L, "852963", "Ñaña", "Ñañis", LocalDate.of(1929, 10, 31)));

        return listaPacientes;
    }

    @GetMapping("paciente/traer/menores")
    @ResponseBody
    public List<Paciente> traerPacientesMenores(){
        List <Paciente> listaPacientes = new ArrayList<Paciente>();
        listaPacientes.add(new Paciente(1L, "123456", "Zlatan", "Ibrahimovic", LocalDate.of(2015,8,18)));
        listaPacientes.add(new Paciente(2L, "134679", "Cristiano", "Ronaldo", LocalDate.of(2017, 5, 20)));
        listaPacientes.add(new Paciente(3L, "987654", "Lionel", "Messi", LocalDate.of(2000, 1, 31)));
        listaPacientes.add(new Paciente(4L, "741852", "Lain", "Merengue", LocalDate.of(1987, 5, 20)));
        listaPacientes.add(new Paciente(5L, "852963", "Ñaña", "Ñañis", LocalDate.of(1929, 10, 31)));
        
        List <Paciente> listaMenores = new ArrayList<Paciente>();
        for (Paciente menor: listaPacientes){
            
            //Fecha de hoy
            LocalDate hoy = LocalDate.now();
            
            //Diferencia de años entre la fecha de nacimiento y la fecha de hoy
            Period anios = Period.between(menor.getFechaNacimiento(), hoy);
            
            if (anios.getYears() < 18){
                listaMenores.add(menor);
            }
        }
        return listaMenores;
    }
    
}
