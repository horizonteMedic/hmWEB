![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/f7f7ee62-a18e-4b77-941f-7696613a1318)Apis Medsoft Web

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
          "capacidadPaciente":40,
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
          "capacidadPaciente":40,
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
          "capacidadPaciente":40,
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
    - ojo: en este caso se esta enviado el ruc de empresa porque se marco el combbox de los filtros de empresa y se seleciono uno, si se seleccionara contrata se enviara en rucContrata y el de empresa se enviaria vacio
    - Json de ejemplo:

          {

              "userName":"developer",
              "fechaInicio": "2024-04-01",
              "fechaFin": "2024-04-29",
              "sedeUser": "T-NP",
              "rucEmpresa": "20477167561",
              "rucContrata": ""

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
            "nomenclatura": "EXA-COV",
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
            "nomenclatura":"ELIM",
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
              "fechaInicio": "2024-04-01",
              "fechaFin": "2024-04-29",
              "sedeUser": "T-NP",
              "dniUser":"42394174",
              "rucEmpresa": "20477167561",
              "rucContrata": ""

          }
      
    - Captura de ejemplo


    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/c37730e4-0dbc-4bb3-a855-e7df6ebc27d1)



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
            "rutaVista":"la ruta del frontend para la vista",
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
            "rutaVista":"la ruta del frontend para la vista",
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
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/sistemaArchivos/UsuarioAsingacionEmpCont/1
  

 - 9.37 Listar de empresas o contratas (listar)
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/sistemaArchivos/listadoEmpresasOcontratas/CONTRATA
  
 - 9.38 Listar de empresas o contratas por el username (listar)
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/sistemaArchivos/busquedaEmpresaContrata/{username}/{EMPRESA O CONTRATA}
    - LINK: https://servicios-web-hm.azurewebsites.net/api/v01/ct/sistemaArchivos/busquedaEmpresaContrata/developer/EMPRESA
    - Captura de ejemplo

   ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/31ad7621-8079-49b1-8705-f974973db491)

 - 9.39 Listar de empresas o contratas por el id_user(listar)
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/sistemaArchivos/listadoEmpContIdUser/402
    - Captura de ejemplo

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/7beb87f5-d51b-4ffa-83e8-60b69eddd594)


 - 9.40 Actualizar usuario menos su contraseña (update) -> recibe como parametro el ID USER
    - Metodo put:
    - Autorizacion: si tiene (token) 
    - https://servicios-web-hm.azurewebsites.net/api/v01/ct/usuario/actualizacionParcial/402
    - Json de ejemplo

          {
              "username": "developer",
              "estado": false,
              "id_empleado": 152

          }

     - Captura de ejemplo
  
       ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/3d3139e8-f458-4e53-818b-cdcac0218901)

 - 9.41 Listar de sedes habilitadas(listar)
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/sede/listadoSedesHabilitados
    - Captura de ejemplo

 - 9.42 Listado de roles habilitados(listar)
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/rol/listadoRolesHabilitados
    - Captura de ejemplo

 - 9.43 Listado de roles por id usuario(listar)
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/rol/busquedaRolesPorIdUser/402
    - Captura de ejemplo

 - 9.44 Listado de vistas por id rol(listar)
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/opcionesInterfaz/vistasPorIdRol/1
    - Captura de ejemplo

 - 9.45 Listado de privilegios asignados para vistas por id rol(listar)
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/privilegioRol/busquedaPorIdRol/1
    - Captura de ejemplo

 - 9.46 Listado de usuario rol por id user
    - Metodo: get
    - Autorizacion: Si tiene (token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/usuarioRol/BusquedaUsuarioRolPorIdUser/402
    - Captura de ejemplo
      
  - 9.47 Listado de usuario  por username
    - Metodo: get
    - Autorizacion: No tiene (sin token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/st/empleado/listadoBusquedaUsername/developer
    - Captura de ejemplo:
      
  - 9.48 Listado de roles por username
    - Metodo: get
    - Autorizacion: si tiene ( token)
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/rol/busquedaRolesPorUserName/developer
    - Captura de ejemplo:

  - 9.49 Eliminar archivo subido a azure por ID archivos
    - Metodo: delete
    - Autorizacion: si tiene ( token)
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/archivos/903
    - Captura de ejemplo:

      
   - 9.50 Registrar Asignacion de rol a rol
    - Metodo post:
    - Autorizacion: si tiene (token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/rolAsignado
    - Json de ejemplo

          {
            "idRol":1,
            "idRolAsignar":502,
            "estado": true,
            "fechaRegistro": "2024-05-14",
            "userRegistro": "developer",
            "fechaActualizacion": null,
            "userActualizacion": null

          }
     
     - Leyenda:
       idRol: Es el rol al cual se le va asignar multiples rol
       idRolAsignar: es el id de los roles asignados al rol padre
     - Captura de ejemplo

    - 9.51 listado de roles asignados
    - Metodo: get
    - Autorizacion: si tiene (token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/rolAsignado

    - 9.52 listado de roles asignados por id rol asignado
    - Metodo: get
    - Autorizacion: si tiene (token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/rolAsignado/52

    - 9.53 listado de roles asignados por id rol
    - Metodo: get
    - Autorizacion: si tiene (token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/rolAsignado/busquedaRolesPorIdRol/1
    
   - 9.54 Actualizar asignacion de roles a rol
    - Metodo: put
    - Autorizacion: si tiene (token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/rolAsignado/52
    - Json de ejemplo

          {
            "idRol":1,
            "idRolAsignar":502,
            "estado": false,
            "fechaRegistro": "2024-05-14",
            "userRegistro": "developer",
            "fechaActualizacion": null,
            "userActualizacion": null

          }



    - 9.55 eliminar rol asignado
    - Metodo: delete
    - Autorizacion: si tiene (token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/rolAsignado/52



 - 9.56 Listado de tipo de archivos habilitados por id user(reemplazo de la 9.6) 
    - Metodo: get
    - Autorizacion: si tiene (token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/tipoArchivo/listadoTiposArchivosPorIdUser/402
    - Captura de ejemplo:

        ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/31080ced-0c37-40d1-9b77-3301b44c2ca5)



    - 9.57 Listado de tipo de archivos por historia clinica y id user(reemplazo de la 9.10 -> la primera) 
    - Metodo: get
    - Autorizacion: si tiene (token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/archivos/busquedaPorHC/T-NP-87241/402
    - Captura de ejemplo:


        ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/6170fac7-7bee-4c43-854b-4128ca66b33f)


    - 9.58 Listar todos los tipo de archivo asignado
    - Metodo: get
    - Autorizacion: si tiene (token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/tipoArchivoAsignado
    - Captura de ejemplo:


        ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/8a51ea77-7dd3-49f2-b720-6d3c3393fbea)


    
    - 9.59 Listar los tipo de archivo asignado por id tipo archivo asignado
    - Metodo: get
    - Autorizacion: si tiene (token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/tipoArchivoAsignado/54
    - Captura de ejemplo:


        ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/64e36f6e-6064-4a72-b30d-abad201af363)


    
    - 9.60 Listar los tipo de archivo asignado por id rol
    - Metodo: get
    - Autorizacion: si tiene (token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/tipoArchivoAsignado/busquedaTipoArchivoAsignadoPorIdRol/1
    - Captura de ejemplo:


        ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/63cbadc6-6676-4fa1-b08c-e56a07cd81b2)

        
   - 9.61 Registrar Tipo archivo asignado a un rol
    - Metodo: post
    - Autorizacion: si tiene (token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/tipoArchivoAsignado
    - Json de ejemplo

          {
            "idRol":1,
            "idTipoArchivoAsignar":1,
            "estado": true,
            "fechaRegistro": "2024-05-16",
            "userRegistro": "developer",
            "fechaActualizacion": null,
            "userActualizacion": null

          }

     - Captura de ejemplo:


       ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/f6138d52-8671-4c0a-955f-d38b86973325)



   - 9.62 Actualizar Tipo archivo asignado a un rol
    - Metodo: put
    - Autorizacion: si tiene (token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/tipoArchivoAsignado/52
    - Json de ejemplo


          {
            "idRol":1,
            "idTipoArchivoAsignar":1,
            "estado": false,
            "fechaRegistro": "2024-05-16",
            "userRegistro": "developer",
            "fechaActualizacion": null,
            "userActualizacion": null

          }


     - Captura de ejemplo:

    
       ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/2582dff3-ca15-4ed7-921f-fbad79023782)


    - 9.63 Eliminar tipo de archivo asignado por id tipo archivo asignado
    - Metodo: delete
    - Autorizacion: si tiene (token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/tipoArchivoAsignado/57
    - Captura de ejemplo:


        ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/21f06186-b337-4472-b6f3-0160dbe24e8b)


   - 10.1 Registrar datosm de paciente en la bd de pierola
    - Metodo: Post
    - Autorizacion: no tiene (sin token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/st/registros/datosPacienteNP
    - Json de ejemplo


          {
            "codPa":76574011,
            "nombresPa":"JOSUE SPENCER",
            "fechaNaciminetoPa": "1995-07-19",
            "sexoPa": "M",
            "emailPa": "josuespencerrojas@gmail.com",
            "lugarNacPa": "TRUJILLO",
            "nivelEstPa": "TITULADO",
            "ocupacionPa": "ENFERMERA",
            "estadoCivilPa": "SOLTERO",
            "direccionPa": "MANCO CAPAC #641 V.A.",
            "departamentoPa": "LA LIBERTAD",
            "provinciaPa": "TRUJILLO",
            "distritoPa": "VICTOR LARCO HERRERA",
            "caserioPA": "-",
            "fotoPa": null,
            "codAleatorioPa": null,
            "telCasaPa": null,
            "telTrabajoPa": null,
            "celPa": "942251815",
            "fechaRegistroPa": "2024-05-21",
            "apellidosPa": "ROJAS SIGÜENZA",
            "horaRegistroPa": "20:29:02",
            "tipoDoc": 1

          }


     - Captura de ejemplo:


   - 10.2 Registrar historia clinica
    - Metodo: Post
    - Autorizacion: no tiene (sin token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/st/registros/historiaClinica
    - Json de ejemplo


          {
             "n_orden":4353,
              "codPa":76574022,
              "razonEmpresa":"INVERDE PERU E.I.R.L.",
              "razonContrata": "N/A",
              "nomEx": "SUPERFICIE",
              "alturaPo": "DEBAJO 2500",
              "mineralPo": "NO APLICA",
              "fechaAperturaPo": "2024-05-21",
              "precioPo": "S/.130.00",
              "estadoEx": "EN PROCESO",
              "nomExamen":"PRE-OCUPACIONAL",
              "cargoDe": "SOLDADOR",
              "areaO": "OPERACIONES",
              "n_medico": "ARTEMIO ALEJANDRO GARCIA CABRERA",
              "n_hora": "10:35:37",
              "tipoPago": "TRANSFERENCIA O DEPOSITO",
              "n_fisttest": false,
              "n_psicosen": false,
              "n_testaltura": false,
              "color": 30,
              "grupoSan": null,
              "grupoFactorSan": null,
              "codClinica": "4353-H",
              "visualCompl": false,
              "trabCalientes": false,
              "chk_covid1": false,
              "chk_covid2": false,
              "manipAlimentos": false,
              "textObserv1": "ROTOCOLO COPEINCA- LORE",
              "textObserv2": "COORDINADO CON LEONARDO",
              "codSede": 2,
              "tipoPruebaCovid": "RA",
              "tipoPrueba": "N/A",
              "nombreHotel": "N/A",
              "protocolo": "Protocolo",
              "precioAdic": "S/.1.00",
              "autoriza": "CORREO DE EMPRESA",
              "n_operacion": null,
              "herraManuales": false,
              "rxcDorsoLumbar": false,
              "rxcKLumbar": false,
              "rxcLumbosacra": false,
              "rxcPlomos": false,
              "mercurioo": false,
              "referencia": "4353"

          }


     - Captura de ejemplo:


 - 10.3 Servicio de carga masiva
    - Metodo: Post
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/archivos/cargaMasivaHM
    - Json de ejemplo


          {
              "rutaArchivo": null,
              "nombreArchivo":"82985-EMA-VILLANUEVA CUBAS JOSE ELADIO.pdf",
              "codigoSede":"T-NP",
              "dni":null,
              "historiaClinica":null,
              "orden": null,
              "servidor":"azure",
              "estado": true,
             "fechaRegistro": "2024-05-29",
             "userRegistro": "developer",
             "fechaActualizacion": null,
             "userActualizacion": null,
             "id_tipo_archivo": null,
             "fileBase64": ""
          }


     - Captura de ejemplo:

    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/b2bb2609-cdcf-481d-b5a6-e137c5bd436b)



 - 11 Registrar servicio
    - Metodo: Post
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/servicios
    - Json de ejemplo


          {
            "nombreServicio":"Triaje",
            "tablaServicio":"triaje_ocupacional",
            "precio": 12.5,
            "estado": true,
            "fechaRegistro": "2024-06-10",
            "userRegistro": "developer",
            "fechaActualizacion": null,
            "userActualizacion": null
          }


     - Captura de ejemplo:

   ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/7eee058a-01af-4d29-9248-791d75878c1d)


 - 11.1 Listar todos los servicio
    - Metodo: GET
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/servicios

 - 11.2 Listar los servicios por id
    - Metodo: GET
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/servicios/3

 - 11.3 Eliminar los servicios por id
    - Metodo: DELETE
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/servicios/3


 - 11.4 Actualizar servicio
    - Metodo: Put
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/servicios/3
    - Json de ejemplo


          {
            "nombreServicio":"Triaje",
            "tablaServicio":"triaje_ocupacional",
            "precio": 12.5,
            "estado": true,
            "fechaRegistro": "2024-06-10",
            "userRegistro": "developer",
            "fechaActualizacion": null,
            "userActualizacion": null
          }


     - Captura de ejemplo:

   ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/7488e35c-8ffd-45fb-947a-b2f8d1a0c6d7)


 - 11.5 Matriz Administrativa
    - Metodo: Post
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/st/registros/matrizAdministrativa
    - Json de ejemplo


          {
            "rucContrata":"20602703119",
            "rucEmpresa": "",
             "fechaInicio": "2024-04-01",
            "fechaFinal": "2024-05-31",
            "sede": "T-NP"
          }


     - Captura de ejemplo:

   ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/0c1b71a1-9d3b-492d-9e32-4e33f728a5d7)


 - 11.6 Matriz Administrativa
    - Metodo: Post
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/st/registros/matrizSalud
    - Json de ejemplo


          {
            "rucContrata":"20602703119",
            "rucEmpresa": "",
             "fechaInicio": "2024-04-01",
            "fechaFinal": "2024-05-31",
            "sede": "T-NP"
          }

    - Captura de ejemplo:

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/f9146ca8-8361-4ada-9fb6-d43d6046fed5)

 - 12.1  Registrar Protocolos 
    - Metodo: Post
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/protocolos
    - Json de ejemplo


          {
            "nombreProtocolo":"Protocolo boro",
            "rucEmpresa":23456789876,
            "precio": 20.5,
            "observacion": "sin observaciones",
            "estado": true,
            "fechaRegistro": "2024-06-10",
            "userRegistro": "developer",
            "fechaActualizacion": null,
            "userActualizacion": null
          }

    - Captura de ejemplo:

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/2fa38e8c-c5d5-4c23-bf8d-3bb12dfe1562)


 - 12.2   Listar Protocolos 
    - Metodo: Get
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/protocolos
    - Captura de ejemplo:      

    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/10e6b725-7528-4f19-94d1-a60624d55dd6)

 - 12.3   Listar Protocolos por id protocolo
    - Metodo: Get
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/protocolos/52
    - Captura de ejemplo:

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/062eeb37-57e8-40f3-abcc-380e8b49642c)

 - 12.4   Eliminar Protocolos por id protocolo
    - Metodo: Delete
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/protocolos/52
    - Captura de ejemplo:
      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/201afd24-b634-4326-8ec8-9c648d92dce0)


 - 12.5  Actualizar Protocolos 
    - Metodo: put
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/protocolos/52
    - Json de ejemplo


          {
            "nombreProtocolo":"Protocolo boro",
            "rucEmpresa":23456789876,
            "precio": 20.5,
            "observacion": "sin observaciones",
            "estado": true,
            "fechaRegistro": "2024-06-10",
            "userRegistro": "developer",
            "fechaActualizacion": null,
            "userActualizacion": null
          }

    - Captura de ejemplo:

 - 12.6  Registrar Contrata Protocolo 
    - Metodo: post
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/contrataProtocolos
    - Json de ejemplo


          {
            "id_protocolo": 2,
            "rucContrata": 26545676431,
            "precio": 20.5,
            "fechaRegistro": "2024-06-10",
            "userRegistro": "developer",
            "fechaActualizacion": null,
            "userActualizacion": null
          }

    - Captura de ejemplo:

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/caa4be8d-c2d2-4286-80e3-c773331a0ede)

 - 12.7  Listar Contrata Protocolo 
    - Metodo: get
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/contrataProtocolos
    - Captura de ejemplo:

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/f931727d-78b6-4a9e-aaff-90439afddcdd)

 - 12.8  Listar Contrata Protocolo 
    - Metodo: get
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/contrataProtocolos/2
    - Captura de ejemplo:
  
      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/87006469-04c8-4e89-b881-eff3c01eea7e)


 - 12.9  Actualizar Contrata Protocolo 
    - Metodo: put
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/contrataProtocolos/2
    - Json de ejemplo


          {
            "id_protocolo": 2,
            "rucContrata": 26545676431,
            "precio": 20.5,
            "fechaRegistro": "2024-06-10",
            "userRegistro": "developer",
            "fechaActualizacion": null,
            "userActualizacion": null
          }

    - Captura de ejemplo:
  
      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/22dd0830-48fc-4c1b-8b25-42a842cf61d2)

 - 12.10  Eliminar Contrata Protocolo 
    - Metodo: delete
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/contrataProtocolos/2
    - Captura de ejemplo:
      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/593562d7-d478-47b9-8def-23da1ccf060f)

 - 12.11  Registrar servicio Protocolo 
    - Metodo: post
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/servicioProtocolos
    - Json de ejemplo


          {
            "id_protocolo": 2,
            "id_servicio": 152,
            "precio": 20.5,
            "fechaRegistro": "2024-06-10",
            "userRegistro": "developer",
            "fechaActualizacion": null,
            "userActualizacion": null
          }

    - Captura de ejemplo:

        ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/6c89b4d9-6254-4387-8229-0f2e9719ef53)


 - 12.12  listar servicio Protocolo 
    - Metodo: get
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/servicioProtocolos
    - Captura de ejemplo:
      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/c407bb30-d29f-4782-82e4-d184b82ade21)

 - 12.13  listar servicio Protocolo por id protocolo
    - Metodo: get
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/servicioProtocolos/2
    - Captura de ejemplo:

   ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/85212aeb-0906-44e1-b6cb-eef6b34202a5)

 - 12.14  actualizar servicio Protocolo 
    - Metodo: put
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/servicioProtocolos/2
    - Json de ejemplo


          {
            "id_protocolo": 2,
            "id_servicio": 152,
            "precio": 20.5,
            "fechaRegistro": "2024-06-10",
            "userRegistro": "developer",
            "fechaActualizacion": null,
            "userActualizacion": null
          }

    - Captura de ejemplo:
  ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/caeb75f4-e10b-4000-8f58-f04b08ad20e9)

 - 12.15  Eliminar servicio Protocolo por id protocolo
    - Metodo: deete
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/servicioProtocolos/2
    - Captura de ejemplo:

 - 12.16  Registro de datos pacientes multiSucursales 
    - Metodo: post
    - Autorizacion: si tiene (si token) -> parametros -> {T-SD,T-NP,HNCY,HMCH}
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/registroPacientes/datosPaciente/T-SD
    - Json de ejemplo


          {
              "codPa": 76574023,
              "nombresPa": "JOSUE SPENCER",
              "fechaNaciminetoPa": "1995-07-19",
              "sexoPa": "F",
              "emailPa": "josuespencerrojas@gmail.com",
              "lugarNacPa": "TRUJILLO",
              "nivelEstPa": "TITULADO",
              "ocupacionPa": "ENFERMERA",
              "estadoCivilPa": "SOLTERO",
              "direccionPa": "MANCO CAPAC #641 V.A.",
              "departamentoPa": "LA LIBERTAD",
              "provinciaPa": "TRUJILLO",
              "distritoPa": "VICTOR LARCO HERRERA",
              "caserioPA": "-",
              "fotoPa": null,
              "codAleatorioPa": null,
              "telCasaPa": null,
              "telTrabajoPa": null,
              "celPa": "942251815",
              "fechaRegistroPa": "2024-05-21",
              "apellidosPa": "ROJAS SIGÜENZA",
              "horaRegistroPa": "20:29:02",
              "tipoDoc": 1,
              "cargo": "operador",
              "area": "operaciones",
              "tipoExamen": "pre-ocupacional"
          }

    - Captura de ejemplo:

![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/c7a5cfab-d247-402b-b356-a2484f6567ea)

 - 12.17  Listar datos del paciente con filtro por sede y dni
    - Metodo: get
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/registroPacientes/datosPaciente/T-NP/76574023
    - Captura de ejemplo:

    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/a2cb9567-79eb-4400-bc62-e0eb96b69d10)

 - 12.18  buscar protocolo por nombre del protocolo
    - Metodo: deete
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/protocolos/busquedaPorName/PROTOCOLO PRUEBA 01
    - Captura de ejemplo:

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/52fea148-26c0-4d04-935a-a8f270f12837)

 - 12.19  listar contratas asignadas a un protocolo por id protocolo
    - Metodo: deete
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/contrataProtocolos/busquedaIdProtocolo/152
    - Captura de ejemplo:

     ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/9136bdbe-6575-417e-806d-43a836bbdda6)

 - 12.20  listar servicios asignadas a un protocolo por id protocolo
    - Metodo: deete
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/servicioProtocolos/busquedaPorIdProtocolo/152
    - Captura de ejemplo:
  
      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/f8b82970-9cab-4b57-a50a-de87c6c22e6c)


 - 12.21  Registrar citas ocupacionales
    - Metodo: post
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/citaOcupacional
    - Json de ejemplo


          {
            "dni": 76574022,
            "celular": 942251815,
            "fechaReserva": "2024-06-30",
            "nomenSede": "T-NP",
            "rucEmpresa": 20477167561,
            "rucContrata": 20602352111,
            "fechaRegistro": "2024-06-11",
            "userRegistro": "developer",
            "fechaActualizacion": null,
            "userActualizacion": null,
            "cargo": "operador",
            "area": "operaciones",
            "tipoExamen": "pre-ocupacional"
          }

    - Captura de ejemplo:


 - 12.22  litar citas ocupacionales
    - Metodo: get
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/citaOcupacional
    - Json de ejemplo

 - 12.23  litar citas ocupacionales por id
    - Metodo: get
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/citaOcupacional/1
    - Json de ejemplo

 - 12.24  eliminar citas ocupacionales por id
    - Metodo: delete
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/citaOcupacional/1
    - Json de ejemplo

 - 12.25  Actualizar citas ocupacionales por id
    - Metodo: put
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/citaOcupacional/1
    - Json de ejemplo


          {
            "dni": 76574022,
            "celular": 942251815,
            "fechaReserva": "2024-06-30",
            "nomenSede": "T-NP",
            "rucEmpresa": 20477167561,
            "rucContrata": 20602352111,
            "fechaRegistro": "2024-06-11",
            "userRegistro": "developer",
            "fechaActualizacion": null,
            "userActualizacion": null
          }

    - Captura de ejemplo:


 - 12.26  litado de formas de pagos
    - Metodo: get
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/detalleParametros/detalleParametrizable/Formas de pago
    - Captura de ejemplo

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/b6d6291e-3ec6-4557-9763-ad44a2cbc532)



 - 12.27  litado de Autorizacion
    - Metodo: get
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/detalleParametros/detalleParametrizable/Autorizacion
    - Captura de ejemplo

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/223f0f2f-f15a-4469-8934-8b314bd2df15)


 - 12.28  litado de EMPRESAS MULTISUCURSAL
    - Metodo: get
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/listadoEmpresasMutisucursal/T-SD
    - Captura de ejemplo

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/35c6f705-acc6-4789-8c2d-ad619f62d1f5)


 - 12.29  litado de CONTRATAS MULTISUCURSAL
    - Metodo: get
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/listadoContratasMutisucursal/T-SD
    - Captura de ejemplo

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/98271af2-0e9c-4fd3-98fa-ad830747d1c8)


 - 12.30  litado de NOMBRE DE LOS  MEDICOS OCUPACIONAL  MULTISUCURSAL
    - Metodo: get
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/listadoNombreMedicosMutisucursal/T-SD
    - Captura de ejemplo

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/c663957a-ad87-40b1-893c-919f4f1fffd0)


 - 12.31  litado de TIPO DE PRUEBA MULTISUCURSAL
    - Metodo: get
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/listadoTipoPruebaMutisucursal/T-SD
    - Captura de ejemplo

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/e06ee499-33d4-4887-92fc-e2d2147789fc)


 - 12.32  litado de CARGO MULTISUCURSAL
    - Metodo: get
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/listadoCargoMutisucursal/T-SD
    - Captura de ejemplo

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/5093be25-54b6-4dca-98f9-34addb89aa16)


 - 12.33  litado de AREA MULTISUCURSAL
    - Metodo: get
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/listadoAreaMutisucursal/T-SD
    - Captura de ejemplo

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/37ca12a3-80d5-476f-8a44-c37f9b1697bc)


 - 12.34  litado de TIPO DE EXAMEN MEDICO MULTISUCURSAL
    - Metodo: get
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/listadoTipoExamenMutisucursal/T-SD
    - Captura de ejemplo

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/ffae1e49-d7d7-42a3-bb1e-87de3812088f)

 - 12.35  litado de EXPLOTACION MULTISUCURSAL
    - Metodo: get
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/listadoExplotacionMutisucursal/T-SD
    - Captura de ejemplo

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/be241e5c-8a73-4284-a4da-daf99c8ee21d)


 - 12.36  litado de mineral MULTISUCURSAL
    - Metodo: get
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/listadoMineralMutisucursal/T-SD
    - Captura de ejemplo

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/ac3976e6-4920-405d-bbdc-d25ceee9861e)


 - 12.37  litado de altura MULTISUCURSAL
    - Metodo: get
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/listadoAlturaMutisucursal/T-SD
    - Captura de ejemplo

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/db980a7c-97b0-4a47-a4df-c43e1a18ba29)


 - 12.38  PRECIO EXAMEN MEDICO MULTISUCURSAL
    - Metodo: get
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/PrecioExamenMutisucursal/T-SD/ANUAL
    - Captura de ejemplo
      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/94b6c84f-f630-4031-8240-97d1bb5d5ade)



 - 12.39  Registrar o actualizar historia clinica ocupacional
    - Metodo: put
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/registroPacientes/historiaClinicaOcupacional
    - Json de ejemplo


          {
              "tipoOperacion":1,
              "n_orden":null,
              "codPa":76574012,
              "razonEmpresa":"INVERDE PERU E.I.R.L.",
              "razonContrata": "N/A",
              "nomEx": "SUPERFICIE",
              "alturaPo": "DEBAJO 2500",
              "mineralPo": "NO APLICA",
              "fechaAperturaPo": "2024-05-23",
              "precioPo": "S/.130.00",
              "estadoEx": "EN PROCESO",
              "nomExamen":"PRE-OCUPACIONAL",
              "cargoDe": "SOLDADOR",
              "areaO": "OPERACIONES",
              "n_medico": "ARTEMIO ALEJANDRO GARCIA CABRERA",
              "n_hora": "10:35:37",
              "tipoPago": "TRANSFERENCIA O DEPOSITO",
              "n_fisttest": false,
              "n_psicosen": false,
              "n_testaltura": false,
              "color": 30,
              "grupoSan": null,
              "grupoFactorSan": null,
              "codClinica": "4353-H",
              "visualCompl": false,
              "trabCalientes": false,
              "chk_covid1": false,
              "chk_covid2": false,
              "manipAlimentos": false,
              "textObserv1": "ROTOCOLO COPEINCA- LORE",
              "textObserv2": "PRUEBAS, REGISTRO A ELIMINAR POR EL AREA DE DEVELOPERS",
              "codSede": "T-NP",
              "tipoPruebaCovid": "RA",
              "tipoPrueba": "N/A",
              "nombreHotel": "N/A",
              "protocolo": "Protocolo",
              "precioAdic": "S/.1.00",
              "autoriza": "CORREO DE EMPRESA",
              "n_operacion": null,
              "herraManuales": false,
              "rxcDorsoLumbar": false,
              "rxcKLumbar": false,
              "rxcLumbosacra": false,
              "rxcPlomos": false,
              "mercurioo": false
      
          }

    - Captura de ejemplo:
          ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/b01ef662-acde-40ee-92f8-35bb029c7400)

      
 - 12.40 Matriz de archivos 
    - Metodo: get
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/archivos
    - Captura de ejemplo

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/28608799-7d8a-4db1-aba1-e5fb0892b554)

 - 12.41 listado de historias ocupacionales por sede
    - Metodo: get
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/st/registros/listadoHistorialOcupacional/T-NP
    - Captura de ejemplo
  
   ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/09f8ad92-d22f-492d-a894-78b2b9747d5f)


 - 12.42 listado de reserva por username
    - Metodo: get
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/listadoReserva/developer
    - Captura de ejemplo
  
  ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/c84ca918-e0db-4094-8d6b-c86fc9c5c193)


  
 - 12.43  Listar detalle de reserva por filtros
    - Metodo: post
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/ocupacional/citaOcupacional/detalleReserva
    - Json de ejemplo


          {
            "nombreSede": "T-NP",
            "fechaReserva": "2024-06-30",
            "nombreUser": "developer"
          }

    - Captura de ejemplo:
![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/b83ee24c-67ef-4868-b170-3799626a0926)


  
 - 13.1  Registrar o actualizar documentos digitales de empleados
    - Metodo: post
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/archivos/registrarEmpleado
    - Json de ejemplo


          {
             "ruta": null,
             "nombreArchivo":"firma.jpg",
             "dni":76574022,
             "extension": ".jpg",
             "tipoArchivo":"FIRMA",
             "base64": ""
          }

    - Captura de ejemplo:

      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/ff8cf83f-6659-465b-b715-cbf7bb11e7d2)


 - 13.2 listado documentos digitales de los empleados
    - Metodo: get
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/ct/archivos/detalleArchivoEmpleado/76574022/FIRMA
    - Captura de ejemplo
  
      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/0e142125-d9d3-456c-816c-b7873e87ef66)

 - 13.3 consulta de reserva por dni
    - Metodo: get
    - Autorizacion: si tiene (si token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/st/registros/consultaReserva/76574030
    - Captura de ejemplo

 - 13.4 consumo de servicio reniec sin token
    - Metodo: get
    - Autorizacion: no tiene (no tiene token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/st/registros/consumoApis/76574022
    - Captura de ejemplo

-  13.5 Carga masiva cie10
    - Metodo: post
    - Autorizacion: no tiene (sin token) 
    - Link: https://hmintegracion.azurewebsites.net/api/v01/st/registros/cie10
    - Json de ejemplo


          {
             "codigo": "A0000",
             "descripcion":"descripcion de prueba"

          }
