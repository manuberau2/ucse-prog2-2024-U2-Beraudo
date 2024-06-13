## Reporte de cobertura de Tests:
![Reporte](CoberturaTests.png)
Mediante el uso de la herramienta Jacoco se obtuvo el reporte sobre la cobertura de Test, en este reporte se puede observar que todas las clases salvo "Main", la cual no contiene métodos para testear, están cubiertas en un 100% por los tests realizados. 
## Prueba de Benchmark:
![Benchmark](PruebaBenchmark.png)
Las pruebas de Benchmark fueron ejecutadas en modo “throughput” el cual representa la cantidad de operaciones por segundo (ops/s) que puede realizar un programa, siendo la ejecución con "Stream" quien obtuvo un mayor "Score", lo que indica que utilizar este método para esta tarea sería una opción más eficiente que "StreamParallel". Ambos presentaron una tasa de error mínima, por lo que se podría considerar que los resultados son confiables. 

# Correcciones - Estado: 
## Necesarias para aprobar:
- Ejercicio 1: en los tests no utliza @BeforeEach, codigo repetido que se pisa ya que no se renueva en cada @Test.
- Ejercicio 2: Deben duplicar el codigo anterior, no modificarlo en el mismo archivo. El test debería de ir en la carpeta de tests. Deberían de utilizar el modo de Benchmarking AverageTime, utilizar milisegundos, y NO utilizar optimizaciones del compilador JIT (Just In Time). Para ésto deberían de utilizar el objeto BlackHole, el cual les permite tener resultados sin sesgos en cuanto a la optimización del compilador, pueden ver un ejemplo acá https://www.baeldung.com/java-microbenchmark-harness#dead-code-elimination 

## Adicionales:
- Ejercicio 4: Es innecesario hacer el resultado.join();
- Deberían de actualizar el .gitignore para no incluir los archivos generados al compilar, ni los archivos propios del framework que utilicen (.idea, .vscode, etc). De lo contrario se pueden pushear archivos indeseados, como la carpeta build, "hs_err_pid5148.log" y otros.
- Los tests siempre deberían de ir en el mismo package y tener la misma estructura de carpetas que en main, por lo tanto en vez de ir en test/java deberían de ir dentro de test/java/org/example