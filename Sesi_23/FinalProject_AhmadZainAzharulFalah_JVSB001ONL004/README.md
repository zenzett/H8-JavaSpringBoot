
# FINAL PROJECT
**Nama        : Ahmad Zain Azharul Falah**\
**Kode Peserta : JVSB001ONL004**\
**Link Github  : https://github.com/zenzett/Hacktiv8-JavaSpringBoot**

- Panduan Penggunaan Aplikasi :\
	  1. pom.xml > clean > update maven project > install\
	  2. klik folder project > run as spring boot app\
	  3. masuk ke `http://localhost:8686/swagger-ui.html` di browser\
&nbsp;

## Penjelasan
Final Project Java Spring Boot tentang pembuatan API pada sistem travel agen bus.\
Hanya user dengan role admin yang dapat melakukan proses CRUD pada sistem ini.\
&nbsp;

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
&nbsp;\
&nbsp;

## Penggunaan API menggunakan perintah dibawah pada Swagger atau Postman

### Register User / SignUp
```
  POST http://localhost:8080/api/v1/user/signup
```

### Update User
```
  PUT http://localhost:8080/api/v1/user/{id}
```

### Update Password
```
  PUT http://localhost:8080/api/v1/password/{id}
```

### Authentication / Login
```
  POST http://localhost:8080/api/auth
```
Setelah perintah di atas dijalankan, maka bearer token akan digenerate.\
Lalu gunakan bearer token tersebut pada menu authorization untuk login.\
&nbsp;

### Get All Agency
```
  GET http://localhost:8080/api/v1/agency/
```

### Get Agency By Id
```
  GET http://localhost:8080/api/v1/agency/{id}
```

### Add Agency
```
  POST http://localhost:8080/api/v1/agency/
```

### Update Agency
```
  PUT http://localhost:8080/api/v1/agency/{id}
```

### Delete Agency By Id
```
  DELETE http://localhost:8080/api/v1/agency/{id}
```

### Get All Bus
```
  GET http://localhost:8080/api/v1/bus/
```

### Get Bus By Agency Id
```
  GET http://localhost:8080/api/v1/bus/{id}
```

### Add Bus By Agency Id
```
  POST http://localhost:8080/api/v1/bus/{id}
```

### Update Bus
```
  PUT http://localhost:8080/api/v1/bus/{id}
```

### Delete Bus
```
  DELETE http://localhost:8080/api/v1/bus/{id}
```

### Get All Trip Schedule
```
  GET http://localhost:8080/api/v1/trip_schedule/
```

### Get Trip Schedule By Id
```
  GET http://localhost:8080/api/v1/trip_schedule/{id}
```

### Add Trip Schedule
```
  POST http://localhost:8080/api/v1/trip_schedule/
```

### Update Trip Schedule
```
  PUT http://localhost:8080/api/v1/trip_schedule/{id}
```

### Delete Trip Schedule
```
  DELETE http://localhost:8080/api/v1/trip_schedule/{id}
```

### Get All Trip
```
  GET http://localhost:8080/api/v1/trip/
```

### Get Trip By Agency Id
```
  GET http://localhost:8080/api/v1/trip/{id}
```

### Add Trip 
```
  POST http://localhost:8080/api/v1/trip/
```

### Update Trip
```
  PUT http://localhost:8080/api/v1/trip/{id}
```

### Delete Trip
```
  DELETE http://localhost:8080/api/v1/trip/{id}
```

### Get All Ticket
```
  GET http://localhost:8080/api/v1/ticket/
```

### Get Ticket By Id
```
  GET http://localhost:8080/api/v1/ticket/{id}
```

### Add Ticket
```
  POST http://localhost:8080/api/v1/ticket/
```

### Update Ticket
```
  PUT http://localhost:8080/api/v1/ticket/{id}
```

### Delete Ticket
```
  DELETE http://localhost:8080/api/v1/ticket/{id}
```

### Get All Stops
```
  GET http://localhost:8080/api/v1/stop/
```

### Get Stop By Code
```
  GET http://localhost:8080/api/v1/stop/code/{code}
```

### Get Stop By Name
```
  GET http://localhost:8080/api/v1/stop/name/{name}
```

### Get Stop By Id
```
  GET http://localhost:8080/api/v1/stop/{id}
```

### Add Stop
```
  POST http://localhost:8080/api/v1/stop/
```

### Delete Stop
```
  DELETE http://localhost:8080/api/v1/stop{id}
```
