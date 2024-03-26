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
      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/20be6a82-d8ca-455c-8dc9-92ea17e0c1f9)
  - Listado de empleado por busqueda de ID
    - Metodo: get
    - Autorizacion: No lo tiene (sin token)
    - Link: https://servicios-web-hm.azurewebsites.net/api/v01/st/empleado/3
      ![image](https://github.com/horizonteMedic/hmWEB/assets/72226346/bb57a19c-ca7c-4f70-8717-177a65d7aefd)

