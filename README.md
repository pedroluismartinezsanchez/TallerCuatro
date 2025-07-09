# 🐾 Clínica Veterinaria – Proyecto Java

### 👨‍⚕️ Sistema de gestión clínica de mascotas

Este es un proyecto académico en **Java** que simula el funcionamiento de una clínica veterinaria. 
Permite registrar propietarios, sus mascotas, las consultas realizadas y el veterinario que las atendió. 
Está basado en **programación orientada a objetos (POO)** y trabaja por consola, incluyendo validaciones robustas y generación automática de códigos para cada registro.

---

## 📦 Estructura del Proyecto
clinica/
├── Main.java # Punto de entrada del sistema
├── Propietario.java # Representa al dueño de las mascotas
├── Mascota.java # Modela una mascota y su historial
├── Consulta.java # Representa una consulta médica
├── Veterinario.java # Datos del veterinario a cargo
├── IDGenerator.java # Generador automático de códigos únicos
└── Historial.java # (Opcional) Control de historial clínico
## 🚀 Funcionalidades Principales

- ✅ Registro de propietarios con validaciones
- ✅ Registro de múltiples mascotas por propietario
- ✅ Registro de consultas médicas
- ✅ Registro de veterinarios con nombre y especialidad
- ✅ Generación automática de códigos únicos para mascotas y consultas
- ✅ Visualización de ficha clínica completa por consola

---

## 🔐 Validaciones Implementadas

| Campo               | Validación                                                        |
|--------------------|-------------------------------------------------------------------|
| Nombre propietario | Solo letras y espacios, sin estar vacío                          |
| Documento          | Numérico, entre 7 y 10 dígitos                                    |
| Teléfono           | Exactamente 10 dígitos                                            |
| Nombre mascota     | Solo letras y espacios                                            |
| Fecha consulta     | Formato `YYYY-MM-DD`, validado con `LocalDate.parse()`           |

---

## 🔁 Códigos automáticos

La clase `IDGenerator` permite crear identificadores únicos como:

- `"Consulta: N.1"`, `"Consulta: N.2"` ...
- `"Mascota: N.1"`, `"Mascota: N.2"` ...


## 🧑‍💻 Autor

**Pedro Luis Martínez Sánchez**  
🎓 Estudiante de Ingeniería de Software – EAM  
📍 Armenia, Quindío – Colombia  
📌 Proyecto académico de programación orientada a objetos

