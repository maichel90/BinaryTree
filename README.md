# MO Technologies

## Arbol Binario Challenge

Arbol Binario Challenge es una aplicacion codificada en JAVA utilizando el framework SPRING BOOT, este se compone de un set de servicios rest los cuales proveen la funcionalidad para generar un arbol binario a partir de un arreglo de numeros en orden o desorden y luego realizar la busqueda del nodo comun mas sercano entre dos elementos

### Características

* Recibir un arreglo de nuemros en orden o desorden
* Crear un arbol binario teniendo encuenta las reglas para crear un arbol binario
* Realizar la busque de un nodo en el arbol binario
* Realizar la busqueda del nodo comun mas cercano a dos numeros
* Retornar la informacion en formato JSON


## Primeros pasos

### Requisitos ###

Para el correcto funcionamiento se requiere

* Java 11
* Maven


### Instalación

El componente puede ser utilizado de dos formas diferentes, las cuales requieren realizar un cambio en la configuracion del archivo de propiedades de spring

***Spring boot***


Realizar la compilacion desde el directorio raiz del proyecto ejecutando el comando

```
mvn clean package
```

Una vez finalizado el proceso de compilacion con exito, ejecutamos el siguiente comando para iniciar el componente

```
java -jar target/BinaryTree-0.0.1-SNAPSHOT.jar
```



***Docker Container***

Realizar la compilacion desde el directorio raiz del proyecto ejecutando el comando

```
mvn clean package
```

Una vez finalizado el proceso de compilacion con exito, crearemos la imagen docker utilizando el siguiente comando

```
docker build -t larodriguezm/moTechnologiesChallenge .
```

Para concluir ejecutaremos el siguiente comando que nos permite iniciar el docker utilizando las variables de entorno

```
docker run --name motechnologies_challenge -p 9090:9090 -d larodriguezm/moTechnologiesChallenge
```



### Validacion y documentacion

Podemos validar el funcionamiento del componente accediendo a la url 

```
OpenApi Definition: http://localhost:9090/v3/api-docs/
OpenApi UI: http://localhost:9090/swagger-ui.html
```

Tambien dentro del repositorio de codigo se puede encontrar una carpeta que se llama docs donde se pueden encontrar la siguiente informacion

* Docker: Comandos necesarios para la ejecucion manual de compilacion y ejecicion en docker
* Postman_collection: Proyecto ejemplo para el consumo de servicios



## Control de versiones

| Fecha         | Version | Descripcion | Autor |
| ----- | ------- | ----------- | ----- |
| 20 Marzo 2022 | 1.0     | Generacion del componente y documentacion | Alejandro Rodriguez Maichel |
|               |         |             |       |
|               |         |             |       |


