**PROYECTO DE UN ADMINISTRADOR DE PROYECTOS HECHO EN SPRING FRAMEWORK CON JWT, Y SERVICIO DE MENSAJERÍA**
1. POST /auth/signup

Descripción: Crea un nuevo usuario en la base de datos.
Método HTTP: POST
Ruta: /auth/signup
Parámetros de entrada:
User objeto con los siguientes campos:
email: dirección de correo electrónico del usuario.
password: contraseña del usuario.
fullName: nombre completo del usuario.
Respuesta:
AuthResponse objeto con los siguientes campos:
message: mensaje de confirmación de registro exitoso.
jwt: token de autenticación JWT generado para el usuario.
Código de estado HTTP: 201 Created
2. POST /auth/signing

Descripción: Autentica a un usuario existente y devuelve un token de autenticación JWT.
Método HTTP: POST
Ruta: /auth/signing
Parámetros de entrada:
LoginRequest objeto con los siguientes campos:
email: dirección de correo electrónico del usuario.
password: contraseña del usuario.
Respuesta:
AuthResponse objeto con los siguientes campos:
message: mensaje de confirmación de autenticación exitosa.
jwt: token de autenticación JWT generado para el usuario.
Código de estado HTTP: 201 Created
