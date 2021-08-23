# NUVU - TEST
## _Introducción_

El proyecto presente en el siguiente repositorio, tiene como proposito cumplir con el reto tecnico planteado por la empresa para continuar el proceso de seleccion en la compañia.

## Tecnologías

- Spring Boot - Java 11
- H2 (Base de datos en memoria)
- Swagger para documentación de proyecto.
- JWT (Json Web Token) sistema de autenticación con token.
- JPA (Java Persistence API) información relacional en base de datos.
- Spring Security - Para los filtro de seguridad.
- Lombok - Para generación de métodos Get, Set, ToString, Constructores, entre otros en base a variables.
- Javax Validations - Para uso de Constraint y validar algunos campos de los DTO (Data Transfer Object) en base a anotaciones.
- Model Mapper - Libreria para transformar DTO -> Entity y Entity -> DTO.
- Google Cloud - App Engine


## Instalación

Clonación de Repositorio.

```sh
git clone https://gitlab.com/ana.delgado.gomez0127/nuvu.git
```

Ejecución de Proyecto
```sh
gradle run
```
Generación de Artefacto
```sh
gradle build
```

## Documentación y Pruebas - SWAGGER
### _Vista General de Documentación_
![alt text here](https://i.ibb.co/VL6PvqS/Captura-de-Pantalla-2021-06-01-a-la-s-11-42-38-a-m.png)

### _Vista Especifica de Pruebas Controller_
![alt text here](https://i.ibb.co/xKZnxQz/Captura-de-Pantalla-2021-06-01-a-la-s-11-49-16-a-m.png)

### _Vista Especificaciones y Reglas de los DTO_
![alt text here](https://i.ibb.co/Xtfd4H0/Captura-de-Pantalla-2021-06-01-a-la-s-11-51-03-a-m.png)

Visualización de Documentación y Pruebas del Servicio.
```sh
http://localhost:8080/nuvu/swagger.html
```

## Archivos Postman De Pruebas
Se adjunta imagen de muestra de las pruebas realizadas con postman, adicionalmente se incluye url de descarga

![alt text here](https://i.ibb.co/pXYh5kQ/Captura-de-Pantalla-2021-06-01-a-la-s-11-52-56-a-m.png)

Descarga de Colección Postman
```sh
https://drive.google.com/file/d/19QzAL0sXen2BWDmUHu2bLp5kZjE2S3EK/view?usp=sharing
```

## URL Publica - Google Cloud

Se sube el microservicio como recurso App Engine de Google Cloud

![alt text here](https://i.ibb.co/LYGkDcB/Captura-de-Pantalla-2021-06-01-a-la-s-11-59-54-a-m.png)

Url pública deñ microservicio
```sh
https://pivotal-spark-304216.df.r.appspot.com
```

