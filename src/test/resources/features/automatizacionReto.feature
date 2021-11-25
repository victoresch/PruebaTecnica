#Author: victoresch@hotmail.com
#language:es

Característica: ver ofertas laborales de una tecnologia especifica

  como un posible candidato
  quiero ver las ofertas laborales
  para ver el detalle


  Esquema del escenario: buscar ofertas

    Dado que el actor ingresa a la pagina web
    Cuando el usuario realiza la busqueda con "<palabra>"
    Entonces el debe ver la lista de ofertas

    Ejemplos:
    |palabra|
    |Java   |