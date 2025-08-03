# 🧠 Foro Hub - API REST con Spring Boot
Foro Hub es una API REST creada con Spring Boot 3.3.9 como parte del desafío final del curso de Java y Spring de Alura Latam. Permite la gestión de temas y usuarios autenticados mediante JWT.

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

http://localhost:8080/v3/api-docs
<img width="1918" height="913" alt="image" src="https://github.com/user-attachments/assets/0c769e6b-e4b4-442b-9c85-a5d1983c64f4" />

o
http://localhost:8080/swagger-ui/index.html
<img width="1918" height="921" alt="image" src="https://github.com/user-attachments/assets/5e615260-a4d8-4286-98df-f996d0087df1" />


## 📸 Ejemplos de uso con Insomnia
Uso de la API: login, creación de tópicos, listar topicos, actualizar,borrar.

### Login:
ingresas al insomia con la url y colocaras en formato json tu usuario y contraseña para que esta te de un token la cual sera necesaria para realizar las request 
<img width="1352" height="968" alt="image" src="https://github.com/user-attachments/assets/b8c1b64b-7c35-4beb-b38d-c0037579ace9" />


### Registrar un topico:
Se colocaran los datos del topico como el titulo,mensaje,autor y el curso y cuando se enviara te dara los datos completos de ese topico 
<img width="1347" height="909" alt="image" src="https://github.com/user-attachments/assets/e6fa8aa4-6b9b-4aaf-978e-6b07de8ef8d1" />


### Listar topicos:
Como es un get se obtendran los datos de todos los topicos que esten registrados en la base de datos mediante la paginacion 
<img width="1346" height="840" alt="image" src="https://github.com/user-attachments/assets/4b6434c1-3480-4e8a-a207-a214ccc23c36" />


### Listar topico por id:
Se colocara en la URL el id del topico que se buscara y traera los datos de ese topico 
<img width="1344" height="909" alt="image" src="https://github.com/user-attachments/assets/335c9d4f-50e8-483d-9285-7f9822eddb7f" />


### Actualizar topicos:
Se colocara en URL el id del topico que se quiere actualizar y en el json se enviaran los datos que se actualizaran,solo se podran cambiar los datos como autor,mensaje,curso y titulo
<img width="1349" height="908" alt="image" src="https://github.com/user-attachments/assets/17b49a64-6919-4aab-b351-42bc40026b67" />


### Borrar topicos:
En este apartado solo se colocara en la URL el topico que se desea eliminar aunque no se borrara de la base de datos si no se desactivara 
<img width="1352" height="906" alt="image" src="https://github.com/user-attachments/assets/ac098a98-a748-495a-9b2d-dac5630407e7" />


### Crear Usuarios:
Crear usuario mediante un nombre de usurario y contraseña,el usuario coloca su contraseña 
<img width="1350" height="905" alt="image" src="https://github.com/user-attachments/assets/827bb368-e46d-4125-8d32-35c0f52fec32" />

y el sistema la transforma en hash para asi guardarla en la base de datos
<img width="734" height="187" alt="image" src="https://github.com/user-attachments/assets/c9e778b0-b6c1-4c67-9f9b-068d3fdc361c" />


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


## 🦝 Autora
Ninel Quezada Hernández 🦝

Este proyecto es parte del desafío final del curso Java con Spring Boot 3 en Alura Latam.
