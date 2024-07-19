package org.example.Ejercicio4;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadLocalRandom;

public class TareasAsyncMasRapida {
    public static void main(String[] args) {
        CompletableFuture<Integer> tarea1 = CompletableFuture.supplyAsync(() -> {
            try {
                return generarNumeroAleatorio();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        CompletableFuture<Integer> tarea2 = CompletableFuture.supplyAsync(() -> {
            try {
                return generarNumeroAleatorio();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        CompletableFuture<Integer> tarea3 = CompletableFuture.supplyAsync(() -> {
            try {
                return generarNumeroAleatorio();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        CompletableFuture<Integer> tarea4 = CompletableFuture.supplyAsync(() -> {
            try {
                return generarNumeroAleatorio();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        CompletableFuture<Object> tareaPrimera = CompletableFuture.anyOf(tarea1, tarea2, tarea3, tarea4);

        CompletableFuture<Void> resultado = tareaPrimera.thenAccept(valor -> {
            System.out.println("El valor de la tarea más rápida es: " + valor);
        });
    }
    public static int generarNumeroAleatorio() throws InterruptedException {
        int num = ThreadLocalRandom.current().nextInt(100, 501);
        Thread.sleep(num);
        return num;
    }
}
