El proyecto consiste en una api rest que permite un crud de tópicos de un foro y un token por seguridad a los tópicos.

2. Requisitos
   
   2.1. Requisitos funcionales
   
2.1.1 El sistema debe permitir la busqueda de todos los topicos por metodo GET.

2.1.2 El sistema debe permitir la creacion de nuevos topicos por metodo POST.

2.1.3 El sistema debe permitir la actualizacion de topicos por metodo PUT.

2.1.4 El sistema debe permitir la eliminacion de topicos por metodo DELETE.

2.1.5 El sistema debe permitir la busqueda de topicos por id por metodo GET.

2.1.6 El sistema debe permitir la creacion del token por usuario usando el metodo POST.

2.2. Requisitos Previos ⚙️

Antes de proceder, asegurate de tener estos programas en el equipo:

2.3. Herramientas 🛠️

2.3.1 Java: Lenguaje de programación utilizado para el desarrollo.

2.3.2 Spring Boot: Framework de Java para el desarrollo.

2.3.3 Spring Hateoas: Dependencia de Spring para la integración con APIs REST.

2.3.4 Spring Security: Dependencia de Spring para la seguridad.

2.3.5 Spring Web: Dependencia de Spring para la integración de servicios web.

2.3.6 Spring Data JPA: Dependencia de Spring para la integración con bases de datos.

2.3.7 Spring Boot DevTools: Herramienta de desarrollo (Opcional)

2.3.8 Lombok: Anotaciones para mejorar la legibilidad del código.

2.3.9 MySQL Driver: Driver de conexión con MySQL.

2.4. Función de la Aplicación 

Para ejecutar el proyecto es necesario seguir estos pasos:

3 Crear variables de entorno

3.1 DB_HOST: Host de la base de datos.

3.2 DB_PORT: Puerto de la base de datos.

3.3 DB_NAME: Nombre de la base de datos.

3.4 DB_USER: Nombre de usuario de la base de datos.

Ejecuta el proyecto desde tu IDE.


Recuerde que en el programa Insomnia en la pestaña Body que la informacion se envia en formato JSON.

Recuerde que en el programa Insomnia en la pestaña Auth debe elegir la opcion Bearer Token poner el token creado en los endpoints de los tópicos para tener autorización.

Recuerde que el token expira en 2 horas, hay que renovarlo constantemente.

4. Licencia 📝
