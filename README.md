## PASOS PARA EL DESPLIEGUE

### Clonar el repositorio

1. git clone 

## Edición del archivo de configuración

El archivo de configuración se encuentra en opt/data/mcs-minjus/properties/mcs-indicadores.properties. Este archivo contiene variables de conexión que deben reemplazarse antes del despliegue del contenedor (configurar según los valores de calidad/producción).

Conexión al srevicio y BD mysql de calidad/producción de la base de datos de **BD_INDICADORES**
```
### Datasource 
ip_db = IP de la base de datos.
puerto_db = Puerto de la base de datos.
nombre_db = Nombre de la base de datos.
id_usuario = Usuario de la base de datos.
contrasenia_db = Contraseña de la base de datos

name.db=Nombre de la base datos

url.servicio.wsdl=url del servicio wsdl
url.servicio= url del servicio
ip.app = codigo del aplicativo

```

El archivo de configuración se encuentra en opt/Filesystem/dgdpaj/mcs-servicio/log/mcs-indicadores/config/log4j2-mcs-indicadores.xml. Este archivo contiene variables de configuracion para el log del servicio.

## Instrucciones específicas para esta versión

Para desplegar en los ambientes de calidad/producción seguir los siguientes pasos:
```
1. Ubicarse en la carpeta **sql** y ejecutar el script contenido en dicha carpeta.
```
## Instrucciones específicas para esta versión
```
El archivo de despliegue esta en la carpeta war/mcs-indicadores.war
```