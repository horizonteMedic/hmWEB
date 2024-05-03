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
          "sexo": "Masculino"
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
          "sexo": "empleado"
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
 
9- SISTEMA DE ARCHIVOS

  - 9.1 Listado de sedes por usuario
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/sistemaArchivos/sedePorUsuario/developer
    - Captura:

    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/76ae9dd0-52d3-4e5d-8fcd-f1c200e77e18)


  - 9.2 Listado de usuarios
    - Metodo: post
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/sistemaArchivos/listadoHistorialPacientesConFiltros
    - Json de ejemplo:

          {

            "userName":"developer",
            "fechaInicio": "2024-01-01",
            "fechaFin": "2024-04-29",
            "sedeUser": "T-NP",
            "tipoUsuario": null,
            "rucUser": null

          }

    - Captura de ejemplo:
   
      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/05466ff7-1b29-48f4-a190-80a0f555dc70)

  - 9.3 Tipo de archivos a subir   (Registrar un tipo de archivo)
    - Metodo: post
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/tipoArchivo
    - Json de ejemplo:

          {

            "nombre":"examen covid",
            "extension":"pdf",
            "color":"morado",
            "codigo":"#572364",
            "estado": false,
            "fechaRegistro": "2024-04-30",
            "userRegistro": "joshue",
            "fechaActualizacion": null,
            "userActualizacion": null

          }

    - captura de ejemplo:
    
      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/674b2f28-d89f-45ee-b4ed-439efdcec145)

  - 9.4 Listar todo los tipos de archivos   (mostrar)
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/tipoArchivo

    - captura de ejemplo:

    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/195d2a5f-fe22-49db-9ee1-caaaba87016e)


  - 9.5 Listar los tipo de archivo por id archivo   (mostrar)
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/tipoArchivo/1
    - Captura de ejemplo

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/75a52ae1-23d0-44f7-b68d-ee9a69f90b64)


  - 9.6 Listar los tipo de archivo habilitados   (mostrar)
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/tipoArchivo/listadoArchivosHabilitados
    - Captura de ejemplo
   
    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/b3593309-4025-4533-9510-7ce52cd5b2a9)

  - 9.7 Actualizar tipo de archivo   (mostrar)
    - Metodo: put
    - Autorizacion: Si tiene (token)
    - Link: http://localhost:8080/api/v01/ct/tipoArchivo/3
    - Json de ejemplo

          {

            "nombre":"Eliminar",
            "extension":"pdf",
            "color":"morado",
            "codigo":"#572364",
            "estado": true,
            "fechaRegistro": "2024-04-30",
            "userRegistro": "joshue",
            "fechaActualizacion": null,
            "userActualizacion": null

          }

  - 9.8 Historia clinica de los usuarios - detalle   (mostrar)
    - Metodo: post
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/sistemaArchivos/detalleListadoHistorialPacientesConFiltros
    - Json de ejemplo

          {

            "userName":"developer",
            "fechaInicio": "2023-01-01",
            "fechaFin": "2024-04-29",
            "sedeUser": "T-NP",
            "dniUser":"41003364",
            "tipoUsuario": null,
            "rucUser": null

          }
      
    - Captura de ejemplo


      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/ac8472df-92cb-4c41-bd77-577d3830d8a8)


  - 9.9 Registrar y actualizar archivos   (registrar)
    - Metodo: post
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/archivos/registrarArchivo
    - Json de ejemplo

          {

             "rutaArchivo": null,
             "nombreArchivo":"legajo medic hm.pdf",
             "dni":76574022,
             "historiaClinica":"T-NP-86981",
             "orden": 86981,
             "servidor":"azure",
             "estado": false,
             "fechaRegistro": "2024-04-30",
             "userRegistro": "joshue",
            "fechaActualizacion": null,
            "userActualizacion": null,
            "id_tipo_archivo": 1,
            "fileBase64": ""

          }
      
    - Captura de ejemplo

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/d7fce1a6-e8ac-4d10-bbb0-0f68d13a671d)


- 9.10 Busqueda de archivos por historia clinica   (listar)
  
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/archivos/busquedaPorHC/T-NP-86982
    - Captura de ejemplo

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/031092dd-d9f2-4c8c-876f-f14d5f84c6cd)

            - 9.10 Busqueda de archivos por historia clinica y tipo de archivo  (listar)
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/archivos/detalleArchivo/T-NP-86982/1
    - Captura de ejemplo
      
    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/6e358b79-ce92-4865-a79b-cf7564fce882)

  - 9.11 Listar empleado por nro de documento(dni)  (listar)
    - Metodo: get
    - Autorizacion: no tiene (sin token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/st/empleado/busquedaPorNroDoc/76574022
    - captura de ejemplo:


      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/3cecf65b-c85a-4eee-b362-135e0b8916e7)


  - 9.12 Listar de usuarios por id empleado  (listar)
    - Metodo: get
    - Autorizacion: sitiene ( token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/usuario/busquedaIdEmpleado/152
    - captura de ejemplo:

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/50e777d7-78ab-496a-b589-0a407bc2fa88)


 - 9.13 Registrar las vistas del sistema  (registrar)
    - Metodo: post
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/opcionesInterfaz
    - Json de ejemplo

          {

            "nombre":"Menu de configuraciones",
            "descripcion":"listado de configuraciones del sistemas que solo tiene acceso el administradpr",
            "estado": true,
            "nivel":1,
            "idPadre":null,
            "fechaRegistro": "2024-05-02",
            "userRegistro": "developer",
            "fechaActualizacion": null,
            "userActualizacion": null

          }
      
    - Captura de ejemplo
  
      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/98aff288-3b63-470c-a63b-d1535fbc8587)


 - 9.14 Listar las vistas del sistema  (listar)
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/opcionesInterfaz
    - Captura de ejemplo

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/118d0389-cb86-4e23-95a4-8d17de9ad4ea)


 - 9.15 Listar las vistas del sistema por id de la vista  (listar por id vista)
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/opcionesInterfaz/1
    - Captura de ejemplo

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/90e9f110-bcb1-469c-87ae-32dbc10322f9)

   
 - 9.16 Actualizar vista (actualizar vista con id de la vista)
    - Metodo: put
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/opcionesInterfaz/1
    - Json de ejemplo

          {

            "nombre":"Menu de configuraciones",
            "descripcion":"listado de configuraciones del sistemas que solo tiene acceso el administrador, actualizado",
            "estado": true,
            "nivel":1,
            "idPadre":null,
            "fechaRegistro": "2024-05-02",
            "userRegistro": "developer",
            "fechaActualizacion": "2024-05-02",
            "userActualizacion":  "developer"

          }

    - Captura de ejemplo:

       ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/a21b0c14-341c-4091-92ea-7f7a5d74067b)

 - 9.17 Eliminar Vista del sistema  (eliminar por id vista)
    - Metodo: delete
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/opcionesInterfaz/1
    - Captura de ejemplo   

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/b153a535-14a7-493d-a4a7-ddb5093dca49)


 - 9.18 Asignar vista a roles (Asignar vistas)
    - Metodo: post
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/privilegioRol
    - Json de ejemplo

          {

            "descripcion":"Acceso de privilegio rol",
            "estado": true,
            "fechaRegistro": "2024-05-02",
            "userRegistro": "joshue",
            "fechaActualizacion": null,
            "userActualizacion": null,
            "id_rol":53,
            "id_opcion_interfaz":1

          }


   - Captura de ejemplo

     ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/92c146c3-2816-43e1-8e39-da1ae5947093)


 - 9.19 Listar todas las asignaciones por rol (listar)
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/privilegioRol
    - Captura de ejemplo

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/b7118ecd-22e9-4889-ad5b-e651aebabf59)

 - 9.20 Listar  las asignaciones por id de asignacion rol (listar)
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/privilegioRol/3
    - Captura de ejemplo

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/c696f150-e0e0-4213-857e-43be393881cd)


 - 9.21 actualizar asignacion del rol por id(listar)
    - Metodo: put
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/privilegioRol/3
    - Captura de ejemplo

    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/d2df7bf9-667c-4b1e-9fb5-f76fea7462d3)

   - 9.22 Elimiar asignacion del rol por id(listar)
    - Metodo: delete
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/privilegioRol/3
    - Captura de ejemplo 

    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/16e14457-b95b-4728-9513-cad776649fbc)


 - 9.22 Registrar Empresa (registrar)
    - Metodo: post
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/empresa
    - Json de ejemplo

          {

            "rucEmpresa": "12345678987",
            "razonEmpresa": "razon de prueba a eliminar",
            "direccionEmpresa": "direccion de prueba",
            "telefonoEmpresa": "telefono de prueba",
            "responsableEmpresa": "responsable de prueba",
            "emailEmpresa": "diremail  de prueba",
            "apiToken": null

          }

 - 9.23 Listar Empresa (listar)
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/empresa

 - 9.24 Listar Empresa por ruc (listar)
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/empresa/12345678987
  
 - 9.25 Actualizar Empresa (registrar)
    - Metodo: put
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/empresa/12345678987
    - Json de ejemplo

          {

            "razonEmpresa": "razon de prueba a eliminar",
            "direccionEmpresa": "direccion de prueba",
            "telefonoEmpresa": "telefono de prueba",
            "responsableEmpresa": "responsable de prueba",
            "emailEmpresa": "diremail  de prueba",
            "apiToken": null

          }

 - 9.26 Eliminar Empresa por ruc (delete)
    - Metodo: delete
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/empresa/12345678987
  
 - 9.27 Registrar Contrata (registrar)
    - Metodo: post
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/contrata
    - Json de ejemplo

          {

            "rucContrata": "12345678987",
            "razonContrata": "razon de prueba a eliminar",
            "direccionContrata": "direccion de prueba",
            "telefonoContrata": "telefono de prueba",
            "responsableContrata": "responsable de prueba",
            "emailContrata": "email  de prueba"

          }


 - 9.28 Listar contrata (listar)
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/contrata

 - 9.29 Listar contrata por ruc (listar)
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/contrata/12345678987
  
 - 9.30 Actualizar contrata (registrar)
    - Metodo: put
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/contrata/12345678987
    - Json de ejemplo
  
          {

            "razonContrata": "razon de prueba a eliminar",
            "direccionContrata": "direccion de prueba",
            "telefonoContrata": "telefono de prueba",
            "responsableContrata": "responsable de prueba",
            "emailContrata": "email  de prueba"

          }

  
 - 9.31 Eliminar contrata por ruc (delete)
    - Metodo: delete
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/contrata/12345678987


 - 9.32 Asignar empresas y contratas a usuario (registrar)
    - Metodo: post
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/sistemaArchivos/UsuarioAsingacionEmpCont
    - Json de ejemplo

          {

            "ruc": "20604261580",
            "idUser": 152,
            "tipo": "EMPRESA",
            "estado": true,
            "fechaRegistro": "2024-05-03",
            "userRegistro": "developer",
            "fechaActualizacion": null,
            "userActualizacion": null

          }

 - 9.33 Listar asignacion (listar)
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/sistemaArchivos/listadoUsuarioAsingacionEmpCont

 - 9.34 Listar asignacion por id (listar)
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/sistemaArchivos/listadoUsuarioAsingacionEmpCont/1

 - 9.35 actualizar asignacion a  usuario (registrar)
    - Metodo: post
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/sistemaArchivos/UsuarioAsingacionEmpCont/1
    - Json de ejemplo

          {

            "ruc": "20604261580",
            "idUser": 152,
            "tipo": "EMPRESA",
            "estado": true,
            "fechaRegistro": "2024-05-03",
            "userRegistro": "developer",
            "fechaActualizacion": null,
            "userActualizacion": null

          }


 - 9.36 ELIMINAR asignacion por id (delete)
    - Metodo: delete
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/sistemaArchivos/listadoUsuarioAsingacionEmpCont/1
  

 - 9.37 Listar de empresas o contratas (listar)
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/sistemaArchivos/listadoEmpresasOcontratas/CONTRATA
