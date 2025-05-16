# PROYECTO 3 DE PROGRAMACIÓN, MATRIZ ORTOGONAL
Esta es una aplicación la cual puede guardar datos de auto, estos datos son:
* Placa
* Color
* Linea
* Modelo
* Propietario
la placa del auto tiene condiciones para poder ser insertada de forma correcta, esta sigue el modelo de las placas de guatemala (
Las operaciones posibles estan en los botones, estos son:
## Insertar
Esta función inserta en la matriz los datos en los campos de texto, es necesario pedir la posicion de la matriz en la que se quiere insertar el dato o el sistema le dará una alerta
## Imprimir Matriz
Esta función hace que todos los elementos de la matriz se impriman en el textArea, si la matriz está vacia, habra una alerta indicandolo
##Buscar
Esta función imprime en el textarea datos que esten almacenados en la matriz los cuales concuerden con los datos puestos en los campos de texto, exceptuando las coordenadas, 
los datos en los campos de texto pueden estar sin llenar, y se imprimiran todas las coincidencias con los campos que esten llenos, si no se encuentra nada, 
se imprimira la carencia de resultados 
##Eliminar
Esta función eliminará de la matriz los datos que coincidan con lo escrito en los campos de texto, las condiciones son las mismas que la función de buscar

# ARCHIVOS DEL CODIGO
## AUTO
es la clase que contiene los elementos que el objeto auto va a usar 
## NODODATO
esta clase contiene los nodos que la matriz va a usar para guardar su informacion
## MATRIZDINAMICA
esta clase contiene todas las operaciones de la matriz, junto a sus filas y columnas almacenadas como listas
## VALIDARINT
esta función devuelve un falso o verdadero dependiendo si el string dado es un numero o no
## VALIDARPLACA
esta funcion devuelve un verdadero o falso basado en si la placa dada es correcta o no
