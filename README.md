<h1> Conversor de Monedas en Java </h1>


![_Imagen representativa del conversor de monedas, incluye simbolos de monedas, imagenes de monedas y un rascacielos](https://github.com/escordigan/ConversorDeMonedas/assets/149540525/cd08c44f-a2ff-44e9-94e0-290f5e427dd8)


<h2 align="left"> Descripcion del proyecto </h2>

Conversor de monedas hecho en Java.
En el menú principal el usuario puede elegir convertir dólares americanos a colones y viceversa, dólares americanos a dólares canadienses y viceversa, y por último, dólares americanos a yenes y viceversa.
El menú cuenta siempre con la opcion de salir, ingresando el número 7 y este menú se muestra nuevamente en cuanto finaliza una conversion.

![Menu pricncipal](https://github.com/escordigan/ConversorDeMonedas/assets/149540525/148309ed-6c37-4baf-bf3f-9d1332f618a6)

Primeramente el usuario elige el tipo de moneda que desea convertir y luego ingresa el monto.
A lo interno, se utiliza el API de un convertidor de monedas llamado "Exchangerate-Api", este es su sitio fuente o de origen (https://www.exchangerate-api.com/). De este sitio se consultan los datos en tiempo real del cambio de moneda, se consume el API y se hace un "parsing" únicamente de los datos necesarios del archivo JSON generado. 
De esta manera se muestra en pantalla la conversion de la moneda y la tasa de cambio utilizada.
![Mostrando ejemplo de conversion y resultado](https://github.com/escordigan/ConversorDeMonedas/assets/149540525/bca9676e-b741-4ac4-a6cf-04fd52b1914a)
