# CarTwoSpringBootApi

Implementacion de una API  para el manejo de una base de datos MariaDb para una tienda de alquier de automoviles.

## Endpoints

 ### /reservas

+ Método HTTP: GET
+ Ruta: /all
+ Descripción: Devuelve una lista de todas las reservas almacenadas en la base de datos.

+ Método HTTP: GET
+ Ruta: /{id}
+ Descripción: Devuelve la reserva correspondiente al ID proporcionado en la ruta.

+ Método HTTP: POST
+ Ruta: /add
+ Descripción: Agrega una nueva reserva a la base de datos utilizando los datos proporcionados en el cuerpo de la solicitud.

+ Método HTTP: PUT
+ Ruta: /edit/{id}
+ Descripción: Actualiza la reserva correspondiente al ID proporcionado en la ruta con los datos proporcionados en el cuerpo de la solicitud.

+ Método HTTP: DELETE
+ Ruta: /delete/{id}
+ Descripción: Elimina la reserva correspondiente al ID proporcionado en la ruta de la base de datos.

### /usuario

+ Método HTTP: GET
+ Ruta: /all
+ Descripción: Devuelve una lista de todos los usuarios almacenados en la base de datos.

+ Método HTTP: GET
+ Ruta: /{id}
+ Descripción: Devuelve el usuario correspondiente al ID proporcionado en la ruta.

+ Método HTTP: POST
+ Ruta: /add
+ Descripción: Agrega un nuevo usuario a la base de datos utilizando los datos proporcionados en el cuerpo de la solicitud.

+ Método HTTP: PUT
+ Ruta: /edit/{id}
+ Descripción: Actualiza el usuario correspondiente al ID proporcionado en la ruta con los datos proporcionados en el cuerpo de la solicitud.

+ Método HTTP: DELETE
+ Ruta: /delete/{id}
+ Descripción: Elimina el usuario correspondiente al ID proporcionado en la ruta de la base de datos.

### /vehiculos

+ étodo HTTP: GET
+ Ruta: /all
+ Descripción: Devuelve una lista de todos los vehículos almacenados en la base de datos.

+ Método HTTP: GET
+ Ruta: /{id}
+ Descripción: Devuelve el vehículo correspondiente al ID proporcionado en la ruta.

+ Método HTTP: POST
+ Ruta: /add
+ Descripción: Agrega un nuevo vehículo a la base de datos utilizando los datos proporcionados en el cuerpo de la solicitud.

+ Método HTTP: PUT
+ Ruta: /edit/{id}
+ Descripción: Actualiza el vehículo correspondiente al ID proporcionado en la ruta con los datos proporcionados en el cuerpo de la solicitud.

+ Método HTTP: DELETE
+ Ruta: /delete/{id}
+ Descripción: Elimina el vehículo correspondiente al ID proporcionado en la ruta de la base de datos.

### POSTMAN
Agregada la coleccion en postman para utilizar estos endpoints.