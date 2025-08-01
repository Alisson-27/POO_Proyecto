# 🎬 POO_Proyecto – Gestor de Contenidos Audiovisuales

Este proyecto en Java permite gestionar distintos tipos de contenidos audiovisuales como **películas**, **series de TV** y **documentales** a través de un menú interactivo en consola. Los datos se pueden guardar y leer desde un archivo `.csv`.

---

## 🧠 Objetivo

Aplicar los principios de la **Programación Orientada a Objetos (POO)**:
- Herencia
- Polimorfismo
- Encapsulamiento
- Abstracción

---

## 🚀 Funcionalidades principales

✔️ Agregar contenido audiovisual  
✔️ Listar todos los contenidos  
✔️ Buscar contenido por título  
✔️ Guardar y cargar datos en un archivo CSV  
✔️ Validación de entradas del usuario

---

## 📦 Estructura del proyecto

src/
├── modelo/
│ ├── ContenidoAudiovisual.java
│ ├── Pelicula.java
│ ├── SerieDeTV.java
│ ├── Documental.java
│ ├── Actor.java
│ ├── Temporada.java
│ ├── Investigador.java
│ └── Main.java
│
├── util/
│ └── ArchivoManager.java
│
└── contenidos.csv

---

## 🖥️ Cómo ejecutar el proyecto

1. Abre el proyecto en **Eclipse**.
2. Asegúrate de tener seleccionado el JDK (por ejemplo JavaSE-21).
3. Ejecuta `Main.java` (clic derecho → Run As → Java Application).
4. Usa el menú que aparece en la consola para interactuar.

---

## 📝 Ejemplo de uso

--- Menú ---

Listar contenidos

Buscar contenido por título

Agregar contenido

Salir
Elija opción: 3

Ingrese tipo de contenido (1=Película, 2=Documental, 3=Serie): 1
Ingrese título: Alicia en el pais de las maravillas
Ingrese año: 2010
Ingrese director: Tim Burton
Cuántos actores desea agregar?: 3
Nombre del actor 1: Johnny Depp
Nombre del actor 2: Matt Lucas
Nombre del actor 3: Michael Sheen

Película agregada.

---

## 📁 Archivo de salida: `contenidos.csv`

Este archivo se genera automáticamente y contiene la información del contenido audiovisual agregado. Ejemplo:

Tipo,Titulo,Año,Director/Tema,Investigador,Especialidad,Temporadas,Actores
Pelicula,Alicia en el pais de las maravillas,2010,Tim Burton,,,,Johnny Depp;Matt Lucas;Michael Sheen
Serie,Aventura Épica,2023,,,,2,
Documental,Naturaleza Salvaje,2022,Naturaleza,Laura Ramos,Biología,,

yaml
Copiar
Editar


---

## 🧑‍💻 Autora

- **Nombre**: Alisson Alejandra  
- **Proyecto académico de Programación Orientada a Objetos**

---

## 🛠️ Tecnologías utilizadas

- Java 21
- Eclipse IDE
- Archivos CSV

---

¡Gracias por revisar mi proyecto! 💖
  
  Repositorio: git clone https://github.com/tu-usuario/tu-repo.git
