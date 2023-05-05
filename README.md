# Portfolio

Este proyecto fue generado con `SpringBoot 3.0.5`. Se utilizó `MySQL 8`

## Documentación de la API
* HTML: `/swagger-ui/index.html`
* JSON: `/v3/api-docs`

## Environments

### Ejecutar en modo desarrollador
1. Descargar la base de datos [Descargar](https://drive.google.com/file/d/1mHCpqMU3x8VBDdV-BD4e7kXWDk2ddkBZ/view?usp=share_link)
2. Ir a `application.properties`
3. Cambiar `#spring.profiles.active=dev` por `spring.profiles.active=dev`

La aplicación se ejecutará en `http://localhost:8080/` y la base de datos con el nombre de usuario `root` y contraseña `123456`.

### Ejecutar en modo producción
1. Ir a `application.properties`
2. Cambiar `spring.profiles.active=dev` por `#spring.profiles.active=dev`

La aplicación se ejecutará en `https://portfolio-production-ea29.up.railway.app/`.
Se subió la base de datos a un hosting.
Para el alojamiento del backend utilicé Railway. Si se utiliza otro configurar las siguientes variables de entorno:

* `MYSQLHOST`
* `MYSQLPORT`
* `MYSQLDATABASE`
* `MYSQLUSER`
* `MYSQLPASSWORD`
