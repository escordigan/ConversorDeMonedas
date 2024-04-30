<h1> Conversor de Monedas en Java </h1>


![_Imagen representativa del conversor de monedas, incluye simbolos de monedas, imagenes de monedas y un rascacielos](https://github.com/escordigan/ConversorDeMonedas/assets/149540525/cd08c44f-a2ff-44e9-94e0-290f5e427dd8)


<h2 align="left"> Descripción del proyecto </h2>

Conversor de monedas hecho en Java.
En el menú principal el usuario puede elegir convertir dólares americanos a colones y viceversa, dólares americanos a dólares canadienses y viceversa, y por último, dólares americanos a yenes y viceversa.
El menú cuenta con la opcion de salir ingresando el número 7, para terminar la sesión cuando el usuario así lo desee. Este menú se muestra al inicio del programa y en cuanto se finaliza cada conversion efectuada.

![Menu pricncipal](https://github.com/escordigan/ConversorDeMonedas/assets/149540525/148309ed-6c37-4baf-bf3f-9d1332f618a6)

Para poder hacer el intercambio de monedas, primeramente el usuario elige el tipo de moneda que desea convertir y luego ingresa el monto.
A lo interno, se llama al API de un convertidor de monedas denominado "Exchangerate-Api", este es su sitio fuente o de origen (https://www.exchangerate-api.com/). De este lugar se consultan los datos en tiempo real del cambio de moneda consultado, posterirmente se consume el API y se hace un "parsing" únicamente de los datos necesarios del archivo JSON generado. 
De esta manera se muestra en pantalla la conversion de la moneda solicitada y la tasa de cambio utilizada durante el proceso de conversión.

![Mostrando ejemplo de conversion y resultado](https://github.com/escordigan/ConversorDeMonedas/assets/149540525/bca9676e-b741-4ac4-a6cf-04fd52b1914a)

En caso de que el usuario ingrese un número que no está dentro del menú de opciones, se le recuerda que debe ingresar una opción válida y que este dato no es posible de procesar.

![Opcion invalida, mostrando ejemplo](https://github.com/escordigan/ConversorDeMonedas/assets/149540525/ee4d4778-c576-41f6-8f22-f61630f339fb)


Si el usuario decide salir ingresando el número 7, se le muestra un mensaje de salida para asegurarle que su sesión ha finalizado.

![Cierre de sesión, mostrando ejemplo](https://github.com/escordigan/ConversorDeMonedas/assets/149540525/55df8048-4b66-41f6-b61d-b6df7da3ef48)


