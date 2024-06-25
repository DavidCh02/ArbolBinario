# Estructuras de Datos
## Descripción

Este proyecto consiste en una interfaz gráfica de usuario (GUI) desarrollada en Java utilizando la biblioteca Swing. La aplicación permite a los usuarios interactuar con varias estructuras de datos, como listas enlazadas, árboles AVL, árboles Rojo-Negro y grafos. Los usuarios pueden agregar, eliminar y mostrar elementos en estas estructuras de datos a través de la interfaz gráfica.

## Características
- Interfaz gráfica intuitiva: La GUI está diseñada para ser fácil de usar y estéticamente agradable.
- Soporte para múltiples estructuras de datos: El proyecto incluye varias estructuras de datos comúnmente utilizadas en la informática.
- Operaciones básicas: Los usuarios pueden agregar, eliminar y mostrar elementos en las estructuras de datos.

---
## Diagramas UML

### Diagrama de Clases

A continuación se presenta el diagrama de clases general del proyecto:

![Arbol Binario UML](https://github.com/DavidCh02/ArbolBinario/assets/166523123/122dc1f9-9e7d-4f4e-8bd3-7c08b6d32d5b)



## Capturas de pantalla 
##### Menu

![d4048867-a9f6-4c18-b1fe-bff4df7219b2](https://github.com/DavidCh02/ArbolBinario/assets/166523123/c5186dc9-8289-4bf8-90cf-6f47e8c3b755)


##### Funcionamiento, ejemplo: Lista enlazada simple

![97d9515c-1ee5-4338-843f-76a7b2d2b533](https://github.com/DavidCh02/ArbolBinario/assets/166523123/b6b833b6-6833-4f48-939b-8cc5661e3404)


##### Funcionamiento de Recorrido
Anteriormente se agregaron los elementos (Valor de nodos) para amostrar los recorridos

![7a1f76dc-28d5-4c4f-9398-0c4fd3c3927d](https://github.com/DavidCh02/ArbolBinario/assets/166523123/d55db7fc-793a-4e43-a094-5de00250943f)


--------
## Instalación y Uso 
### Requisitos
- Java JDK 8 o superior.
- IDE compatible con Java (IntelliJ IDEA, Eclipse, etc.).

### Instalación
- Clonar el repositorio: Clona el repositorio desde GitHub o descarga el código fuente del proyecto.

- Copia el codigo:

       https://github.com/DavidCh02/ArbolBinario.git
  
- Abrir el proyecto en el IDE: Importa el proyecto en tu IDE favorito.

- Compilar el proyecto: Asegúrate de que tu IDE está configurado para compilar el proyecto correctamente.

- Ejecutar la aplicación: Ejecuta la clase principal Master.java.

### Uso de la Aplicación
#### Interfaz Principal
La interfaz principal de la aplicación contiene los siguientes elementos:

- ComboBox (JComboBox): Permite seleccionar la estructura de datos deseada.
- Campo de texto (JTextField): Permite ingresar el valor que se desea agregar o eliminar en la estructura de datos seleccionada.
- Botones (JButton):
	- Agregar: Agrega el valor ingresado en la estructura de datos seleccionada.
	- Eliminar: Elimina el valor ingresado de la estructura de datos seleccionada.
	- Mostrar: Muestra los elementos de la estructura de datos seleccionada en el área de texto.
- Área de texto (JTextArea): Muestra el resultado de las operaciones realizadas en las estructuras de datos.

#### Realizar Operaciones
1. Seleccionar estructura de datos: Usa el ComboBox para seleccionar la estructura de datos con la que deseas trabajar.
2. Ingresar valor: Escribe un valor en el campo de texto.
3. Agregar valor: Haz clic en el botón Agregar para agregar el valor a la estructura seleccionada.
4. Eliminar valor: Haz clic en el botón Eliminar para eliminar el valor de la estructura seleccionada.
5. Mostrar elementos: Haz clic en el botón Mostrar para ver los elementos actuales de la estructura seleccionada en el área de texto.

