# Ventana con memoria

Implementar una aplicación en Java con el framework JavaFX que disponga de una ventana principal con el siguiente aspecto:

(IMAGEN)

Al desplazar los sliders ([Slider](https://docs.oracle.com/javafx/2/ui_controls/slider.htm)) correspondientes a cada componente del Color (RGB) se cambiará dinámicamente el color de fondo de la ventana.

(IMAGEN)

Asimismo, la ventana deberá contar con "memoria", de forma que cuando se cierre y se vuelva abrir se deberá encontrar tal y como la dejamos.

(IMAGEN)

Para implementar la memoria se deberá **leer un fichero de propiedades al iniciar la ventana**.

El **formato del fichero**, que deberá ser de texto, deberá ser el siguiente:

```
background.red=206
background.blue=60
background.green=63
size.width=428
size.height=278
location.x=440
location.y=244
```

El fichero **se deberá almacenar dentro del directorio ".VentanaConMemoria" en el perfil del usuario**, y deberá tener extensión ".config" (por ejemplo, en Windows 7 se guardaría en "C:\Users\Fran\.VentanaConMemoria\ventana.config").

**El fichero de propiedades deberá crearse/guardarse al cerrar la ventana**.

La primera vez que se inicie la aplicación el fichero no existirá, por lo que se partirá de una configuración por defecto.

**NOTA1: [Guía sobre cómo usar ficheros de propiedades](https://mkyong.com/java/java-properties-file-examples/).**

**NOTA2: La ruta al perfil del usuario se deberá obtener de la variable de entorno "user.home", accesible mediante el método estático "String getProperty(String)" de la clase "System"; esto es:**

```
String rutaPerfil = System.getProperty("user.home");
```

**NOTA3: Para cargar el fichero de propiedades sobreescribe el método "[init](https://docs.oracle.com/javase/8/javafx/api/javafx/application/Application.html#init--)" de Application, y para escribirlo hazlo en su método "[stop](https://docs.oracle.com/javase/8/javafx/api/javafx/application/Application.html#stop--)".**