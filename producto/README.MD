# Microservicio de Productos

Este es un microservicio de gestión de productos que interactúa con un microservicio externo de gestión de pedidos.

## Requisitos previos

- Java JDK 8 o superior
- Maven
- Base de datos MySQL

## Configuración

1. Clona el repositorio de `microservicio_productos`.
2. Crear base de datos MySQL si fuera necesario con las sentencias documentadas en el archivo create.sql
3. Configura la base de datos en el archivo `application.properties`.
4. Ejecuta el comando `mvn clean install` para compilar el proyecto y descargar las dependencias.

## Ejecución

1. Ejecuta el comando `mvn spring-boot:run` para iniciar el microservicio.
2. El microservicio estará disponible en `http://localhost:9090`.

## Endpoints

- `GET /`: Obtiene la lista de productos.
- `GET /{codigoProducto}`: Obtiene los detalles de un producto específico.
- `PUT /{codigoProducto}/{stock}`: Actualiza un producto existente.


