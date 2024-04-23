Apis Medsoft Web

1- Empleado
  - Registro de Empleados
    - Metodo: post
    - Autorizacion: No lo tiene (sin token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/st/empleado
    - Json de ejemplo:
      
          {
      
          "nombres":"karla sofia",
          "apellidos": "ramirez aguilar",
          "cargo": "administrativo",
          "correoElect": "karlasofia_aguilar@gmail.com",
          "numDocumento": 78675655,
          "celular": "942356764",
          "telFijo": null,
          "direccion": "Av. los paujiles #657",
          "estado": true,
          "fechaRegistro": "2024-03-26",
          "userRegistro": "joshue",
          "fechaActualizacion": null,
          "userActualizacion": null
      
          }
      
    - Captura del resultado:
      
      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/8cc1dc98-50ea-414f-a3d1-994ab1f9f7e8)

  - Listado de todos los empleados
    - Metodo: get
    - Autorizacion: No lo tiene (sin token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/st/empleado
    - Captura del resultado:
   
      
      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/20be6a82-d8ca-455c-8dc9-92ea17e0c1f9)
  - Listado de empleado por busqueda de ID
    - Metodo: get
    - Autorizacion: No lo tiene (sin token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/st/empleado/{id del empleado a buscar}
    - Captura del resultado:
   
      
      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/bb57a19c-ca7c-4f70-8717-177a65d7aefd)
      
2- Usuario

  - 2.1. Registro de Usuarios
    - Metodo: post
    - Autorizacion: No lo tiene (sin token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/st/auth/register
    - Json de ejemplo:
      
          {
   
            "username":"karlaSofia",
            "password": "123456",
            "estado": true,
            "idEmpleado": 2
   
          }
      
    - Captura del resultado:
   
      
      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/583fbbbc-cb3e-495c-9044-2420aefce778)
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
    
    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/28cccc89-69f9-48db-9e42-7359612e9982)
  - Nota: Apartir de aca se copiara el token para acceder a todos los servicios.
    
- 2.3. Listado de todos los usuarios
  - Metodo: get
  - Autorizacion: Si lo tiene (Con token)
  - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/usuario
  - Captura de ejemplo:
 
    
    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/8b525572-b930-417f-9527-2b68c97cb323)
- 2.4. Listado de los usuarios por id
  - Metodo: get
  - Autorizacion: Si lo tiene (Con token)
  - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/usuario/{id del usaurio a buscar}
  - Captura de ejemplo:
 
    
    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/6d3d0014-fa9a-48d3-b831-ab887fcffa01)

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

