# 🧠 Foro Hub - API REST con Spring Boot
Foro Hub es una API REST creada con Spring Boot 3.5.4 como parte del desafío final del curso de Java y Spring de Alura Latam. Permite la gestión de temas y usuarios autenticados mediante JWT.

## 🚀 Tecnologías Utilizadas
-Java 17

-Spring Boot 3.5.4

-Spring Security

-Spring Data JPA

-JWT (Java Web Tokens)

-MySQL

-Flyway

-Maven

-Lombok

-Swagger / OpenAPI (springdoc-openapi)

-Insomnia (para pruebas de endpoints)

## 📁 Estructura del Proyecto
src/
├── main/
│ ├── java/
│ │ └── com.aluradesafio.forohub/
│ │ ├── domain/
│ │ ├── controller/
│ │ ├── service/
│ │ ├── repository/
│ │ └── security/
│ └── resources/
│ ├── application.properties
│ └── db/migration/
└── test/

## 🔐 Autenticación JWT
El endpoint /login genera un token válido al recibir las credenciales correctas. Este token debe ser incluido en el header de las siguientes peticiones protegidas:

Authorization: Bearer <token>

## 🌐 Documentación Swagger
Disponible automáticamente tras ejecutar la aplicación:

http://localhost:8080/swagger-ui.html
o
http://localhost:8080/swagger-ui/index.html

## 📸 Ejemplos de uso con Insomnia
Añade aquí capturas o GIFs del uso de la API: login, creación de tópicos, listar topicos, actualizar,borrar.

### Login:
ingresas al insomia con la url y colocaras en formato json tu usuario y contraseña para que esta te de un token la cual sera necesaria para realizar las request 

### Registrar un topico:
Se colocaran los datos del topico como el titulo,mensaje,autor y el curso y cuando se enviara te dara los datos completos de ese topico 

### Listar topicos:
Como es un get se obtendran los datos de todos los topicos que esten registrados en la base de datos mediante la paginacion 

### Listar topico por id:
Se colocara en la URL el id del topico que se buscara y traera los datos de ese topico 

### Actualizar topicos:
Se colocara en URL el id del topico que se quiere actualizar y en el json se enviaran los datos que se actualizaran,solo se podran cambiar los datos como autor,mensaje,curso y titulo

### Borrar topicos:
En este apartado solo se colocara en la URL el topico que se desea eliminar aunque no se borrara de la base de datos si no se desactivara 


## 🧪 Cómo probar
Clona el repositorio:
git clone https://github.com/tuusuario/forohub.git
cd forohub

Configura la conexión a la base de datos en application.properties.


Accede a la documentación Swagger o prueba en Insomnia.

## 📌 Consideraciones
-Las migraciones de base de datos están gestionadas por Flyway.

-Usa buenas prácticas de arquitectura limpia.

-El código está documentado y preparado para futuras extensiones.


##  Autora
Ninel Quezada Hernández 🦝
Este proyecto es parte del desafío final del curso Java con Spring Boot 3 en Alura Latam.
