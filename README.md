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
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/st/empleado/3
    - Captura del resultado:
   
      
      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/bb57a19c-ca7c-4f70-8717-177a65d7aefd)
2- Usuario
  - Registro de Usuarios
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
- Login
  - Metodo: post
  - Autorizacion: No lo tiene (sin token)
  - Link: https://servicios-web-hm.azurewebsites.net/api/v01/st/auth/login
  - Json de ejemplo:
      {
        "nombre":"karlaSofia",
        "password": "123456"
      }
  - Captura del resultado:
 
    
    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/28cccc89-69f9-48db-9e42-7359612e9982)
  - Nota: Apartir de aca se copiara el token para acceder a todos los servicios.
-Listado de todos los usuarios
  - Metodo: get
  - Autorizacion: Si lo tiene (Con token)
  - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/usuario
  - Captura de ejemplo:
 
    
    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/8b525572-b930-417f-9527-2b68c97cb323)
- Listado de los usuarios por id
  - Metodo: get
  - Autorizacion: Si lo tiene (Con token)
  - Link: https://servicios-web-hm.azurewebsites.net/api/v01/ct/usuario/1
  - Captura de ejemplo:
 
    
    ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/6d3d0014-fa9a-48d3-b831-ab887fcffa01)

    



