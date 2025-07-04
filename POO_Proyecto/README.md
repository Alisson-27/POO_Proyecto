# Proyecto: Sistema de Contenidos Audiovisuales 🎬

## 📌 Descripción del Proyecto

Este proyecto Java es una simulación de un sistema de gestión de contenidos audiovisuales. Utiliza principios avanzados de Programación Orientada a Objetos (POO), como:

- Herencia
- Composición
- Agregación
- Asociación

El sistema permite gestionar películas, series de TV, documentales, cortometrajes y videos de YouTube, mostrando su información de forma estructurada.

---

## 🎯 Objetivos

- Aplicar conceptos avanzados de POO en Java.
- Modelar relaciones reales entre clases (como actores, temporadas e investigadores).
- Diseñar un sistema extensible y bien estructurado.
- Subir y documentar el proyecto en GitHub.

---

## 🧱 Estructura de Clases

### Clases principales:

- `ContenidoAudiovisual` (abstracta)
  - `Pelicula`
  - `SerieDeTV`
  - `Documental`
  - `Cortometraje`
  - `VideoYouTube`

### Clases auxiliares:

- `Actor` → asociada a `Pelicula`
- `Temporada` → asociada a `SerieDeTV`
- `Investigador` → asociada a `Documental`

---

## 🖥️ Instrucciones para Clonar y Ejecutar

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/tu-repo.git
