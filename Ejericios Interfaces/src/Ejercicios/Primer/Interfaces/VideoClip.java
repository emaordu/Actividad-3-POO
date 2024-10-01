package Ejercicios.Primer.Interfaces;

public interface VideoClip {
    /*comienza la reproduccion del video*/
    public void play();
    /*reproduce el clip en un bucle, un loop
    infinito*/ 
    public void bucle();
    /*detiene la reproducción del video*/
    public void stop();    
}