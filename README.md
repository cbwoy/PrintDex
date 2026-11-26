# PrintDex

> Una Pokédex para tus impresiones 3D

Una aplicación integral para tener un control total sobre tus impresiones 3D.

## ✨ Qué hace

| Sección | Para qué sirve | Estado |
|---|---|---|
| Calculadora | Calcula todos los costes asociados a cada impresión 3D | 🚧 |
| Pedidos | Controla y gestiona con orden los pedidos que recibes | 🚧 |
| Impresiones | Gestiona tus impresiones y su estado | 🚧 |
| Inventario | Para que nunca te quedes sin tu filamento o tus extras favoritos | 🚧 |
| Registro | Añade tus clientes y tus diseños | 🚧 |
| Estadísticas | Si necesitas saber cuánto has impreso, gastado o vendido este mes, esta es tu opción | 🚧 |
| Configuración | Ajusta los valores con los que trabaja la aplicación | 🚧 |

✅ Hecho · 🚧 En construcción

## 🛠️ Tecnología

- Java 25
- Eclipse
- Aplicación de consola

## ▶️ Cómo ejecutarlo

Necesitas tener instalado el **JDK 25** o superior. Puedes comprobar tu versión con:

```bash
java -version
```

### Opción 1: con Eclipse

1. Clona este repositorio o descárgalo como ZIP (**Code → Download ZIP**) y descomprímelo.
2. En Eclipse: **File → Import → General → Existing Projects into Workspace**, y elige la carpeta del proyecto.
3. Abre `src/io/github/cbwoy/printdex/Main.java` y ejecútalo con **Run**.

### Opción 2: desde la terminal

1. Clona este repositorio o descárgalo como ZIP y descomprímelo.
2. Abre una terminal en la **raíz del proyecto** (la carpeta que contiene `src`).
3. Compila y ejecuta:

```bash
javac -d bin src/io/github/cbwoy/printdex/*.java
java -cp bin io.github.cbwoy.printdex.Main
```

## 🗂️ Estructura

```
src/io/github/cbwoy/printdex/
├── Main.java      → Inicia el programa
├── Menu.java      → Contiene los arrays y los métodos de navegación del menú
└── Entrada.java   → Lee y valida lo que escribe el usuario
```

## 🏅 Hoja de ruta

- [x] Medalla 0: diseñar antes de programar
- [x] Medalla 1: los cimientos
- [x] Medalla 2: submenús y entradas a prueba de bombas
- [ ] Medalla 3: tus primeras clases *(en curso)*
- [ ] Medalla 4: las bibliotecas
- [ ] Medalla 5: que no se pierda nada
- [ ] Medalla 6: ajustes
- [ ] Medalla 7: que la app piense
- [ ] 🏆 Copa del campeón de la Liga: base de datos y más allá

## 📚 Sobre el proyecto

Este proyecto nace de una necesidad y de una ambición: tener un mayor control sobre mi hobby de la impresión 3D y el reto de desarrollar una aplicación que se ajuste a mis necesidades. Lo que empezó como una hoja de cálculo en Excel pasó a ser una primera y primitiva calculadora de costes 3D, que escribí en mi primera semana aprendiendo Java. Hoy va camino de convertirse en una aplicación de gestión que integre y dé soporte a todas mis necesidades como maker.

Estoy aprendiendo Java en el Grado Superior en Desarrollo de Aplicaciones Web (DAW) en el IES Los Olivos, en Mejorada del Campo.

El proyecto evoluciona con retos que he llamado **medallas** (siguiendo la dinámica de un entrenador Pokémon): son mi hoja de ruta para aprender Java.

---

Hecho por cbwoy · 2026
