/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.DTO;

/**
 *
 * @author Matheus Barbosa
 */
public class UsuarioDTO {

    private int id;
    private String nome;
    private String email;
    private String senha;
    private boolean gestorquadras = false;
    private boolean gestorusuarios = false;
    private boolean analistarelatorios = false;
    private boolean zelador = false;

    public UsuarioDTO(String nome, String email, String senha, boolean gestorquadras, boolean gestorusuarios, boolean analistarelatorios, boolean zelador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.gestorquadras = gestorquadras;
        this.gestorusuarios = gestorusuarios;
        this.analistarelatorios = analistarelatorios;
        this.zelador = zelador;
    }   

    public UsuarioDTO(int id, String nome, String email, String senha, boolean gestorquadras, boolean gestorusuarios, boolean analistarelatorios, boolean zelador) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.gestorquadras = gestorquadras;
        this.gestorusuarios = gestorusuarios;
        this.analistarelatorios = analistarelatorios;
        this.zelador = zelador;
    }

    public UsuarioDTO(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }   

    public UsuarioDTO(int id) {
        this.id = id;
    }

    public UsuarioDTO(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public UsuarioDTO() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isGestorquadras() {
        return gestorquadras;
    }

    public void setGestorquadras(boolean gestorquadras) {
        this.gestorquadras = gestorquadras;
    }

    public boolean isGestorusuarios() {
        return gestorusuarios;
    }

    public void setGestorusuarios(boolean gestorusuarios) {
        this.gestorusuarios = gestorusuarios;
    }

    public boolean isAnalistarelatorios() {
        return analistarelatorios;
    }

    public void setAnalistarelatorios(boolean analistarelatorios) {
        this.analistarelatorios = analistarelatorios;
    }

    public boolean isZelador() {
        return zelador;
    }

    public void setZelador(boolean zelador) {
        this.zelador = zelador;
    }    
}
