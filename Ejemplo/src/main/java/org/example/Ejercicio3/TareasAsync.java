package org.example.Ejercicio3;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadLocalRandom;

public class TareasAsync {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
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

        CompletableFuture<Void> tareas = CompletableFuture.allOf(tarea1, tarea2, tarea3, tarea4);

        tareas.thenRun(() -> {
            int sum = tarea1.join() + tarea2.join() + tarea3.join() + tarea4.join();
            System.out.println("La suma de las tareas es: " + sum);
        });
    }
    public static int generarNumeroAleatorio() throws InterruptedException {
        int num = ThreadLocalRandom.current().nextInt(100, 501);
        Thread.sleep(num);
        return num;
    }
}
