package mx.tc.projectFinal.project.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ModelsCars {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_car;
    private String color;
    private String marca;
    private Integer modelo;
    private Integer num_pasajeros;
    private Integer num_puertas;
    private Float consumo_gasolina;
    private Float velocidad_max;
    private Float peso_max;
    private Float carga_techo;
    private Float precio_dia;
    private Float precio_semana;
    private Boolean disponibilidad;

    //Getters and Setters
    public void setId_car(Integer id_car){
        this.id_car=id_car;
    }
    public Integer getId_car(){
        return id_car;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getMarca() {
        return marca;
    }
    public void setModelo(Integer modelo){
        this.modelo=modelo;
    }
    public Integer getModelo(){
        return modelo;
    }
    public void setNum_pasajeros(Integer num_pasajeros){
        this.num_pasajeros=num_pasajeros;
    }
    public Integer getNum_pasajeros(){
        return num_pasajeros;
    }
    public void setNum_puertas(Integer num_puertas){
        this.num_puertas=num_puertas;
    }
    public Integer getNum_puertas(){
        return num_puertas;
    }

    public void setConsumo_gasolina(Float consumo_gasolina){
        this.consumo_gasolina=consumo_gasolina;
    }
    public Float getConsumo_gasolina(){
        return consumo_gasolina;
    }
    public void setVelocidad_max(Float velocidad_max){
        this.velocidad_max=velocidad_max;
    }
    public Float getVelocidad_max(){
        return velocidad_max;
    }
    public void setPeso_max(Float peso_max){
        this.peso_max=peso_max;
    }
    public Float getPeso_max(){
        return peso_max;
    }
    public void setCarga_techo(Float carga_techo){
        this.carga_techo=carga_techo;
    }
    public Float getCarga_techox(){
        return carga_techo;
    }
    public void setPrecio_dia(Float precio_dia){
        this.precio_dia=precio_dia;
    }
    public Float getPrecio_dia(){
        return precio_dia;
    }
    public void setPrecio_semana(Float precio_semana){
        this.precio_semana=precio_semana;
    }
    public Float getPrecio_semana(){
        return precio_semana;
    }
    public void setDisponibilidad(Boolean disponibilidad){
        this.disponibilidad=disponibilidad;
    }
    public Boolean getDisponibilidad(){
        return disponibilidad;
    }
}
