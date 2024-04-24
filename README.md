Apis Medsoft Web

1- Empleado
  - 1.1. Registro de Empleados
    - Metodo: post
    - Autorizacion: No lo tiene (sin token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/st/empleado
    - Json de ejemplo:
      
          {
      
          "tipoDoc": "DNI",
          "numDocumento": 12345678,
          "nombres":"daniel",
          "apellidos": "placenzia",
          "cargo": "developer",
          "ubigeo": "030707", 
          "cip":null, 
          "correoElect": "daniel.plasencia.dlc@gmail.com",
          "celular": "943343543",
          "telFijo": null,
          "direccion": "av. los rosales",
          "estado": true,
          "fechaNacimiento": "2000-08-19",
          "fechaRegistro": "2024-03-04",
          "userRegistro": "joshue",
          "fechaActualizacion": null,
          "userActualizacion": null
      
          }
      
    - Captura del resultado:
      
      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/49f8c3cf-b84c-4afd-ae8e-caecb7cfe41c)


  - 1.2. Listado de todos los empleados
    - Metodo: get
    - Autorizacion: No lo tiene (sin token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/st/empleado
    - Captura del resultado:
   
      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/32b6b561-7392-4b8d-a0d6-8424a9624dce)

      
  - 1.3. Listado de empleado por busqueda de ID
    - Metodo: get
    - Autorizacion: No lo tiene (sin token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/st/empleado/152
    - Captura del resultado:
   
      
      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/bb57a19c-ca7c-4f70-8717-177a65d7aefd)


  - 1.4. Actualizar empleado
    - Metodo: put
    - Autorizacion: No lo tiene (sin token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/st/empleado/152
    - Json de ejemplo:

          {
      
          "tipoDoc": "DNI",
          "numDocumento": 12345678,
          "nombres":"daniel",
          "apellidos": "placenzia",
          "cargo": "developer",
          "ubigeo": "030707", 
          "cip":null, 
          "correoElect": "daniel.plasencia.dlc@gmail.com",
          "celular": "943343543",
          "telFijo": null,
          "direccion": "av. los rosales",
          "estado": true,
          "fechaNacimiento": "2000-08-19",
          "fechaRegistro": "2024-03-04",
          "userRegistro": "joshue",
          "fechaActualizacion": null,
          "userActualizacion": null
      
          }

    - Captura del resultado:
      
      
2- Usuario

  - 2.1. Registro de Usuarios
    - Metodo: post
    - Autorizacion: No lo tiene (sin token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/st/auth/register
    - Json de ejemplo:
      
          {
   
          "username":"daniel123",
          "password": "hm123",
          "estado": true,
          "ruc":"12345678912",
          "idEmpleado": 202
   
          }
      
    - Captura del resultado:
   
      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/595dd41d-b563-4768-a561-810915fa0899)


- 2.2. Login
  - Metodo: post
  - Autorizacion: No lo tiene (sin token)
  - Link: https://servicios-web-hm.azurewebsites.net/api/v01/st/auth/login
    - Json de ejemplo:
      
          {
      
            "nombre":"developer",
            "password": "hm123"
      
          }
      
    - Captura del resultado:
    
      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/64648330-3a3a-4d28-ab34-cc4b31db7d29)

  - Nota: Apartir de aca se copiara el token para acceder a todos los servicios.
    
- 2.3. Listado de todos los usuarios
  - Metodo: get
  - Autorizacion: Si lo tiene (Con token)
  - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/usuario
  - Captura de ejemplo:
 
    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/cfc53e73-27f5-46d3-be99-44216af3e1b8)

    
- 2.4. Listado de los usuarios por id
  - Metodo: get
  - Autorizacion: Si lo tiene (Con token)
  - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/usuario/152
  - Captura de ejemplo:
 
    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/88d195d9-e4f3-4194-b93d-88e843c32e2d)


- 2.5. Enviar correo para recuperacion de contraseña
  - Metodo: post
  - Autorizacion: no lo tiene (sin token)
  - Link: https://servicios-web-hm.azurewebsites.net/api/v01/st/email/enviar-correo
  - json de ejemplo:

      
          {
   
            "destinatario":"josuespencerrojas@gmail.com",
            "asunto": "Codigo de recuperación de contraseña",
            "mensaje": "mensaje de prueba"
   
          }
      
  - Captura de ejemplo:

    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/95db0f83-10c1-4dc5-95c8-b076522fd070)


- 2.6. Usar codigo
  - Metodo: get
  - Autorizacion: no lo tiene (sin token)
  - Link:  https://servicios-web-hm.azurewebsites.net/api/v01/st/email/usarCodigo/josuespencerrojas@gmail.com/223898
  - Captura del resultado:
  
    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/48d0f945-a483-47c3-be94-3ed85ca7b8c8)


- 2.7. actualizar paswoord
  - Metodo: get
  - Autorizacion: no lo tiene (sin token)
  - Link:  https://servicios-web-hm.azurewebsites.net/api/v01/st/email/actualizarPassword/josuespencerrojas@gmail.com/87654321
  - Captura del resultado:

    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/a358b263-d356-4f74-a01d-391c571783a6)

    
3- Combobox

  - 3.1 Listado de Departamentos
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/departamento
    - Captura del resultado:
   
    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/6cdda3ab-3edb-4d3c-801e-a13258b4af71)

  - 3.2 Listado de Departamentos por el ubigeo de departamento
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/departamento/23
    - Captura del resultado:

    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/458247f2-e9ed-4853-a204-c64fafb6baab)


  - 3.3 Listado de Provincias
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/provincia
    - Captura del resultado:

    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/ca557bed-d7c5-4729-ae7d-ec328dbe6dec)

  - 3.4 Listado de Provincias por el ubigeo provincia
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/provincia/0101
    - Captura del resultado:
   
    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/29adc6de-b17d-4773-8bc9-eb6e9fc87fa0)

  - 3.5 Listado de Provincias por ubigeo departamento
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/provincia/busqueda-departamento/01
    - Captura del resultado:
   
    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/94a734a2-0f0e-4796-b173-e04a1341d1de)

  - 3.6 Listado de Distritos
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/distrito
    - Captura del resultado:
   
    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/a8a7c600-523b-40a0-88fd-78c5a9129244)

  - 3.7 Listado de Distritos por Ubigeo de distrito
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/distrito/010101
    - Captura del resultado:
   
    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/1ea25344-a9f8-4ea2-8eba-d1264e240b76)

  - 3.8 Listado de Distritos por Ubigeo de provincia
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/distrito/busqueda-distrito-porProvincia/0101
    - Captura del resultado:
   
    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/65cc74e1-e865-415d-b506-66784cf006e7)


  - 3.9 Listado de Parametros
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/listadoParametros
    - Captura del resultado:
   
    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/cde2840b-87e6-4d40-9069-eb4b328971bf)

    
  - 3.10 Detalle de parametros por descripcion de lista
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/detalleParametros/detalleParametrizable/Estado Civil
    - Captura del resultado:

    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/84b28146-2e9d-4d63-beef-f00358b21478)


4- Rol

  - 4.1 Registrar Rol
    - Metodo: post
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/rol
    - Json de ejemplo:

          {
   
            "nombre":"Medico contrata",
            "descripcion":"solo reportes",
            "estado": true,
            "fechaRegistro": "2024-04-24",
            "userRegistro": "developer",
            "fechaActualizacion": null,
            "userActualizacion": null 
   
          }

    - Captura del resultado:

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/3cf795fc-010a-4c0b-b408-507f1d8ab781)


  - 4.2 Mostrar todos los roles
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/rol
    - Captura de ejemplo:
   
      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/0691ea85-b2ca-4001-ae4c-f002e4b4a156)


  - 4.3 Mostrar un rol por su ID
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/rol/102
    - Captura de ejemplo:


      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/28d338d3-aa79-4e0e-92b3-78665825cb1a)


  - 4.3 Actualizar Rol
    - Metodo: Put
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/rol/1
    - Json de ejemplo

          {
   
            "nombre":"Developer",
            "descripcion":"Acceso Total al Sistema",
            "estado": true,
            "fechaRegistro": "2024-04-17",
            "userRegistro": "developer",
            "fechaActualizacion": "2024-04-17",
            "userActualizacion": "developer"
   
          }

      
    - Captura de ejemplo:


- 4.4 Eliminar Rol
    - Metodo: Delete
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/rol/102
    - Json de ejemplo
    - Captura de ejemplo:

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/2620db42-99a3-4227-8c2d-7fca3dfeea41)


5- Asignar rol a un usuario

  - 5.1 Registrar rol asignado a usuario
    - Metodo: post
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/usuarioRol
    - Json de ejemplo:

          {

          "estado": true,
          "fechaRegistro": "2024-04-24",
          "userRegistro": "developer",
          "fechaUpt": null,
          "userUpt": null,
          "id_user": 152,
          "id_rol": 53
   
          }

  - 5.2 Listado de todos los usuario rol
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/usuarioRol

       
  - 5.3 LISTADO DE TODOS LOS USUARIOS ROL POR ID UsUARIO ROL
  
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/usuarioRol/1
 
  - 5.4. Actualizar rol asignado a usuario
  
    - Metodo: put
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/usuarioRol/1
    - Json de ejemplo:
 
      
      {
        "estado": false,
        "fechaRegistro": "2024-03-13",
        "userRegistro": "joshue",
        "fechaUpt": null,
        "userUpt": null,
        "id_user": 2,
        "id_rol": 2

    }

-5.5. Eliminar asignacion de rol a usuario

    - Metodo: Delete
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/usuarioRol/1


6- Sede

  - 6.1 Registrar una nueva sede
    - Metodo: post
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api//v01/ct/sede
    - Json de ejemplo:

          {

          "nombreSede":"Trujillo - Santo dominguito",
          "codigoSede": "T-SD",
          "estado": true,
          "fechaRegistro": "2024-04-19",
          "userRegistro": "developer",
          "fechaActualizacion": null,
          "userActualizacion": null
   
          }


  - 6.2 Registrar una nueva sede
    - Metodo: post
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api//v01/ct/sede
    - Json de ejemplo:

          {

          "nombreSede":"Trujillo - Santo dominguito",
          "codigoSede": "T-SD",
          "estado": true,
          "fechaRegistro": "2024-04-19",
          "userRegistro": "developer",
          "fechaActualizacion": null,
          "userActualizacion": null
   
          }


  - 6.2 Listar todas las sedes
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/sede

  - 6.3 Listar la sede por su id
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link:  https://servicios-web-hm.azurewebsites.net/api/v01/ct/sede/1

  - 6.4 Actualizar sede
    - Metodo: put
    - Autorizacion: Si tiene (token)
    - Link:  https://servicios-web-hm.azurewebsites.net/api/v01/ct/sede/1
    - json de ejemplo

          {

          "nombreSede":"Trujillo - Santo dominguito",
          "codigoSede": "T-SD",
          "estado": true,
          "fechaRegistro": "2024-04-19",
          "userRegistro": "developer",
          "fechaActualizacion": null,
          "userActualizacion": null
   
          }

  - 6.5 Eliminar sede
    - Metodo: delete
    - Autorizacion: Si tiene (token)
    - Link:  https://servicios-web-hm.azurewebsites.net/api/v01/ct/sede/1


7- Sede

  - 7.1 Registrar usuario sede
    - Metodo: post
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/usuarioSede
    - Json de ejemplo:

          {

          "id_user":152,
          "id_sede": 1,
          "userRegistro": "developer",
          "fechaRegistro": "2024-04-24"


          }

  - 7.2 Listado de todos los usuarios sedes
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/usuarioSede
 
      
  - 7.3 Listado de todos los usuarios sedes por id de usuario sede
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/usuarioSede/1
   
  - 7.4 Listado de todos los usuarios sedes por id_user
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/usuarioSede/listadoPorBusquedaIDUSER/152
   
8- Listados

  - 8.1listado de empresas y contratas
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/empresasContratas/listadoEmpresasContratas
   
  - 8.2 listado de historial de usuario
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/empresasContratas/listadoHistorialUsuarios
 
