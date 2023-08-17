package relojfit;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Reloj {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String dia;
    private String hora;
    private String modelo;
    private long numSerie;

    public Reloj(String dia, String hora) {
        this.dia = dia;
        this.hora = hora;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public long getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(long numSerie) {
        this.numSerie = numSerie;
    }

    public void incremenetarDia() {
        LocalDate fecha = LocalDate.parse(dia);
        System.out.println("Hoy es el dia: " + fecha);
        System.out.println("Cuantos dias quiere agregar?");
        int diasp = leer.nextInt();
        fecha = fecha.plusDays(diasp);
        System.out.println("El nuevo dia es: " + fecha);
    }

    public void incrementarHora() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime horario = LocalTime.parse(hora, formatter);
        System.out.println("La hora es: " + horario);
        System.out.println("Cuantas horas quiere incrementar?");
        int inc = leer.nextInt();
        LocalTime horap = horario.plusHours(inc);
        System.out.println("Su nuevo horario es: "+horap);
    }

}
