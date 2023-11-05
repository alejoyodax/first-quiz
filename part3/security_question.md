what would you look for to make your system secure?

Para hacer más seguro el sistema:

1. Implementar buenas prácticas a la hora de crear el código, crear pruebas unitarias, implementar patrones de diseño seguros como nos informa la A04 que nos habla sobre el diseño inseguro.

2. En la base de datos es importante cifrar todos los datos sensibles de los usuarios en caso de una filtración y muy necesario impolementar controles de acceso a las peticiones realizadas a la api para evitar una fuga de datos masiva así como nos informa la A01

3. Respecto a kubernets implementar un sistema de roles o definir permisos a los ingenieros que tienen acceso a todo el sistema para que solo unos cuantos tenga acceso completo.

4. Realizar un monitoreo del sistema llevando un registro de las versiones de las dependencias, limpiar las que no se necesitan y supervisar las que no se actualizan con parches de seguridad tanto en el front como en el back.

