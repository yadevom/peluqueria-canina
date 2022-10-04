# Creación Aplicación de Escritorio CRUD con JPA MySQL

- Se realiza aplicación de escritorio, frontend con Swing, Backend Java y conexion a BD MySQL. Para realizar las operaciones basicas CRUD.

- Realizada con neetbeans conexion a BD MySQL
- De acuerdo al enunciado, se realizara el programa en el modelo de capas:
* capa persistencia : base de datos
* capa vista : interfaz grafica IGU con Swing 
* capa logica : clase, metodos...

## Ejercicio Integrador: Peluquería Canina

Una peluqueria canica necesita un formulario para almacenar los datos de cada una de sus mascotas clientes.
Para ello, solicita el desarrollo de una aplicacion que sea capaz de registrar los siguientes datos de cada una de ellas y sus dueños.

- Mascotas: num_cliente, nombre_perro, raza, color, alergico, atencion_especial, observaciones.
- Dueño: id_duenio, nombre, celular, direccion

Para poder registrar de manera sencilla y que sea atractiva para el usuario, la dueña de la peluqueria caninca proporciona
el siguiente diseño APROXIMADO de la idea que tiene para la interfaz grafica de usuario: diseno.png

Como los datos deben permanecer en el tiempo y a futuro los empleados de la peluqeria van a poder acceder a ellos, se requiere que
cada uno de los registros sean almacenados en una base de datos.

A partir de este relevamiento de requerimientos:

- Realizar el desarrollo de una aplicación de escritorio que sea capaz de registrar, en una base de datos, los datos tanto de mascota
como dueños que se ingresen desde una interfaz gráfica de usuario.

- Para este desarrollo tener en cuenta los conceptos del MODELO DE CAPAS.

## Material teorico
En el archivo JPA.pptx esta una presentación teorica de los conceptos antes de empezar el proyecto

## Ejecucion de aplicacion

- En el paquete Logica se encuentra la principal de inicio "JpaPrueba"
- Antes de ejecuta debes tener creada y configurada la conexion a la BD
- La aplicación al ejecutarse, crea el usuario ademas de registrar los datos en BD tambien crear la tablas
## Configurar conexion a BD
- En la ruta del proyecto "src/main/resources" el paquete "META-INF" persistence.xml en la opción Source 
- Se encontrara toda la configuración para realizar los cambios como nombre BD, usuario y clave para conectar.

## Instalar libreria mysql
Ubicarse en el directorio de "Dependencies" clic derecho "Add Dependency..."

- En el campo Query: escribir... mysql connector
- Arrojara varios resultados elegir mysql: mysql-connector-java
- Se desplega todas las versiones disponibles en este caso utilizamos la 8.0.30[jar]-central
- Luego podemos validar que en el directorio "Dependencies" ya aparece el driver cargado

## Configuracion conexion BD en NetBeans

Dirigirse en el proyecto al apartado "Services"

- Seleccionar "Database" New Connection...
- Nos pregunta el drivers a utilizar
- En este caso seleccionamos Driver: MySQL (Connector/J driver)
- Si no se tiene se debe buscar o adjuntar desde local
- En nuestro caso solo damos "Next"
- Y colocar los datos de la BD para conexion
- Configuramos que tome la hora del servidor en el JDB URL: jdbc:mysql://localhost:3306/peluqueria_canina?serverTimeZone=UTC
- Realizamos el "Test Connection" y luego Next para Finish

## Script SQL
- Crea BD `CREATE SCHEMA peluqueria_canina DEFAULT CHARACTER SET utf8 ;`

- Consulta tabla
```
SELECT * FROM peluqueria_canina.DUENO;
SELECT * FROM peluqueria_canina.MASCOTA;
SELECT * FROM peluqueria_canina.SEQUENCE;
```

- Eliminar tabla `DROP TABLE peluqueria_canina.DUENO;`

## Instructivo App
Menu Inicio: Donde tendra la opción de cargar datos, ver datos registrados y salir de la aplicación:

![Image text](https://github.com/yadevom/peluqueria-canina/blob/main/img/app1.png)

Menu cargar datos: Podra registrar los datos de la mascota y dueño, al ingresar datos debes "Guardar" y posterior "Limpiar", tambien tienes la opción de boton de regresar al inicio de la aplicación:

![Image text](https://github.com/yadevom/peluqueria-canina/blob/main/img/app2.png)

Mensaje datos registrados:

![Image text](https://github.com/yadevom/peluqueria-canina/blob/main/img/app3.png)

Menu ver Datos: En caso de tener datos en BD se mostraran, tiene las opciones de borrar, editar y regresar al inicio:

![Image text](https://github.com/yadevom/peluqueria-canina/blob/main/img/app4.png)

Si selecionas borrar o eliminar sin selecionar un dato de la tabla saldra un mensaje indicando que es necesario:

![Image text](https://github.com/yadevom/peluqueria-canina/blob/main/img/app5.png)

Cuando "borras" notificara un mensaje del proceso realizado:

![Image text](https://github.com/yadevom/peluqueria-canina/blob/main/img/app6.png)

Cuando selecionas y das en "editar" cargara el formulario, con todos datos a modificar, debes darle guardar para que se registre en BD:

![Image text](https://github.com/yadevom/peluqueria-canina/blob/main/img/app7.png)