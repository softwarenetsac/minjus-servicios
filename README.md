## PASOS PARA EL DESPLIEGUE

### Clonar el repositorio

1. git clone 

## Edición del archivo de configuración

El archivo de configuración se encuentra en opt/data/mcs-minjus/properties/mcs-indicadores.properties. Este archivo contiene variables de conexión que deben reemplazarse antes del despliegue del contenedor (configurar según los valores de calidad/producción).

Conexión al srevicio y BD POSTGRESQL de calidad/producción de la base de datos de **BD_VIGILANCIA_SALUD_TRABAJO**
```
### Datasource Odoo
ip_db = IP de la base de datos.
puerto_db = Puerto de la base de datos.
nombre_db = Nombre de la base de datos.
id_usuario = Usuario de la base de datos.
contrasenia_db = Contraseña de la base de datos
```

El archivo de configuración se encuentra en opt/data/mcs-minjus/log/mcs-indicadores/config/log4j2-mcs-indicadores.xml. Este archivo contiene variables de configuracion para el log del servicio.

## Instrucciones específicas para esta versión

Para desplegar en los ambientes de calidad/producción seguir los siguientes pasos:
```
1. Ubicarse en la carpeta **sql** y ejecutar el script contenido en dicha carpeta.
```
## Instrucciones específicas para esta versión
```
El archivo de despliegue esta en la carpeta war/mcs-indicadores.war
```