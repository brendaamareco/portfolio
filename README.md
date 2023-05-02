### Documentación de la API
* HTML: /swagger-ui/index.html
* JSON: /v3/api-docs

### Environments
#### Ejecutar en modo desarrollador
http://localhost:8080/

1. Ir a application.properties
2. Cambiar #spring.profiles.active=dev por spring.profiles.active=dev

La aplicación se ejecutará en localhost y la base de datos con el nombre de usuario root y contraseña 123456

#### Ejecutar en modo producción
https://portfolio-production-ea29.up.railway.app/

Los mismos pasos del modo desarrollador pero se utiliza #spring.profiles.active=dev en application.properties.

La aplicación se ejecutará en un servidor externo. Yo utilicé Railway.
Si se utiliza otro configurar las siguientes variables de entorno:

* MYSQLHOST
* MYSQLPORT
* MYSQLDATABASE
* MYSQLUSER
* MYSQLPASSWORD