package org.videojuegos;

import logica.VideoJuego;

import java.util.ArrayList;
import java.util.List;

public class EjercicioVideojuego {
    public static void main(String[] args) {

        //Crear el arrayList listaVideojuegos
        List<VideoJuego> listaVideojuegos = new ArrayList<VideoJuego>();

        //Crear 5 videojuegos
        VideoJuego video1 = new VideoJuego(123, "Banjo Kazooie",
                                    "Nintendo 64", 4, "Plataforma");
        VideoJuego video2 = new VideoJuego(456, "Mario Party 3",
                                    "Nintendo 64", 4, "Plataforma");
        VideoJuego video3 = new VideoJuego(789, "Age of Empire II",
                                    "PC", 1, "Estrategia");
        VideoJuego video4 = new VideoJuego(101, "Counter Strike 1.6",
                                    "PC", 1, "Shooter");
        VideoJuego video5 = new VideoJuego(100, "Mario Kart 64",
                                    "Nintendo 64", 2, "Plataforma");

        //Guardar los videojuegos creados en el arrayList
        listaVideojuegos.add(video1);
        listaVideojuegos.add(video2);
        listaVideojuegos.add(video3);
        listaVideojuegos.add(video4);
        listaVideojuegos.add(video5);

        //Recorrer el arrayList y mostrar en pantalla titulo, consola y cantJugadores
        for (VideoJuego video: listaVideojuegos){
            System.out.println("Título: " + video.getTitulo() +
                                ", Consola: " + video.getConsola() +
                                ", Cant. Jugadores: " + video.getCantJugadores());
        }

        //Cambiar el nombre y cantJugadores de 2 videojuegos
        video1.setTitulo("Banjo Kazooie II");
        video1.setCantJugadores(1);
        video5.setTitulo("Super Mario Kart 64");
        video5.setCantJugadores(4);

        //Recorremos e imprimimos de nuevo el arrayList para observar los cambios
        System.out.println("------------------------------------------");
        for (VideoJuego video: listaVideojuegos){
            System.out.println("Título: " + video.getTitulo() +
                    ", Consola: " + video.getConsola() +
                    ", Cant. Jugadores: " + video.getCantJugadores());
        }

        //Recorrer el arrayList y mostrar solo los que sean de consola Nintendo 64
        System.out.println("------------------------------------------");
        for (VideoJuego video: listaVideojuegos){
            if (video.getConsola().equals("Nintendo 64")){
                System.out.println(video.toString());
            }
        }

    }
}