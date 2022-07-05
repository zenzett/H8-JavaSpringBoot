
# FINAL PROJECT
Nama        : Ahmad Zain Azharul Falah\
Kode Peserta : JVSB001ONL004\
Link Github  : https://github.com/zenzett/Hacktiv8-JavaSpringBoot

Panduan Penggunaan Aplikasi :\
	1. pom.xml > clean > update maven project > install\
	2. klik folder project > run as spring boot app\
	3. masuk ke 'localhost:port/swagger-ui.html' di browser.


## Penjelasan
Final Project Java Spring Boot tentang pembuatan API pada sistem travel agen bus.\
Hanya user dengan role admin yang dapat melakukan proses CRUD pada sistem ini.


## Project Dependencies
- Spring Boot Starter Data JPA
- Spring Boot Starter Security
- Spring Boot Starter Web
- Spring Boot DevTools
- Spring Boot Starter Test
- Spring Boot Security Test
- MYSQL Connector Java
- JJWT ver. 0.9.1
- Springfox Swagger2 ver. 2.7.0
- Springfox SwaggerUI ver. 2.7.0
- Flyway Core


## Penggunaan API yang dilakukan pada Swagger atau Postman, dengan menggunakan url sebagai berikut:

### Register User/SignUp

```http
  POST http://localhost:8080/api/v1/user/signup
```

### UpdateUser
```http
  PUT http://localhost:8080/api/v1/user/{id}
```

### UpdatePassword
```http
  PUT http://localhost:8080/api/v1/password/{id}
```

### Authentication/Login

```http
  POST http://localhost:8080/api/auth
```
Setelah perintah di atas dijalankan, maka Bearer token akan digenerate.\
Lalu gunakan bearer token tersebut pada Authorization untuk login.

### Get All Agency
```http
  GET http://localhost:8080/api/v1/agency/
```

### Get Agency By Id
```http
  GET http://localhost:8080/api/v1/agency/{id}
```

### Add Agency
```http
  POST http://localhost:8080/api/v1/agency/
```

### Update Agency
```http
  PUT http://localhost:8080/api/v1/agency/{id}
```

### Delete Agency By Id
```http
  DELETE http://localhost:8080/api/v1/agency/{id}
```

### Get All Bus
```http
  GET http://localhost:8080/api/v1/bus/
```

### Get Bus By Agency Id
```http
  GET http://localhost:8080/api/v1/bus/{id}
```

### Add Bus By Agency Id
```http
  POST http://localhost:8080/api/v1/bus/{id}
```

### Update Bus
```http
  PUT http://localhost:8080/api/v1/bus/{id}
```

### Delete Bus
```http
  DELETE http://localhost:8080/api/v1/bus/{id}
```

### Get All Trip Schedule
```http
  GET http://localhost:8080/api/v1/trip_schedule/
```

### Get Trip Schedule By Id
```http
  GET http://localhost:8080/api/v1/trip_schedule/{id}
```

### Add Trip Schedule
```http
  POST http://localhost:8080/api/v1/trip_schedule/
```

### Update Trip Schedule
```http
  PUT http://localhost:8080/api/v1/trip_schedule/{id}
```

### Delete Trip Schedule
```http
  DELETE http://localhost:8080/api/v1/trip_schedule/{id}
```

### Get All Trip
```http
  GET http://localhost:8080/api/v1/trip/
```

### Get Trip By Agency Id
```http
  GET http://localhost:8080/api/v1/trip/{id}
```

### Add Trip 
```http
  POST http://localhost:8080/api/v1/trip/
```

### Update Trip
```http
  PUT http://localhost:8080/api/v1/trip/{id}
```

### Delete Trip
```http
  DELETE http://localhost:8080/api/v1/trip/{id}
```

### Get All Ticket
```http
  GET http://localhost:8080/api/v1/ticket/
```

### Get Ticket By Id
```http
  GET http://localhost:8080/api/v1/ticket/{id}
```

### Add Ticket
```http
  POST http://localhost:8080/api/v1/ticket/
```

### Update Ticket
```http
  PUT http://localhost:8080/api/v1/ticket/{id}
```

### Delete Ticket
```http
  DELETE http://localhost:8080/api/v1/ticket/{id}
```

### Get All Stops
```http
  GET http://localhost:8080/api/v1/stop/
```

### Get Stop By Code
```http
  GET http://localhost:8080/api/v1/stop/code/{code}
```

### Get Stop By Name
```http
  GET http://localhost:8080/api/v1/stop/name/{name}
```

### Get Stop By Id
```http
  GET http://localhost:8080/api/v1/stop/{id}
```

### Add Stop
```http
  POST http://localhost:8080/api/v1/stop/
```

### Delete Stop
```http
  DELETE http://localhost:8080/api/v1/stop{id}
```
