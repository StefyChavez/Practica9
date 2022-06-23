/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Candidato;
import modelo.Dignidad;
import servicio.CandidatoServicio;
import servicio.DignidadServicio;

/**
 *
 * @author admin
 */
public class CandidatoControl {
    
    private final DignidadServicio dignidadServicio = new DignidadServicio();
    private final CandidatoServicio candidatoServicio = new CandidatoServicio();
    
    public Candidato crear(String [] args){
        Dignidad dignidad = this.dignidadServicio.buscarPorCodigo(Integer.valueOf(args[5]));
        Candidato candidato = new Candidato(Integer.valueOf(args[0]),args[1],args[2],args[3],args[4],dignidad);
        this.candidatoServicio.crear(candidato);
        return candidato;
    }
    
    public Candidato buscarCandidato(String arg){
        return this.candidatoServicio.buscarPorCodigo(Integer.valueOf(arg));
    }
    
    public Candidato eliminar(String arg)
    {
        return this.candidatoServicio.eliminar(Integer.valueOf(arg));
    }
    
    public Candidato modificar(String [] args){
        Dignidad dignidad = this.dignidadServicio.buscarPorCodigo(Integer.valueOf(args[5]));
        Candidato candidatoNuevo = new Candidato(Integer.valueOf(args[0]),args[1],args[2],args[3],args[4],dignidad);
        this.candidatoServicio.modificar(Integer.valueOf(args[0]),candidatoNuevo);
        return candidatoNuevo;
    }
    
    public List<Candidato> listar(){
        return this.candidatoServicio.listar();
    }
    
}
