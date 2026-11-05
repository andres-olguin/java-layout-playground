# Java Layout Playground — Interfaces con Swing

Laboratorio educativo de **gestores de distribución de Java Swing**. Incluye el ejercicio histórico `Border.java` y una galería interactiva que permite comparar el comportamiento de `BorderLayout`, `GridLayout` y `FlowLayout` al cambiar el tamaño de la ventana.

> **Estado:** herramienta de aprendizaje de escritorio, no constructor profesional de interfaces. La CI comprueba que el código compila; no certifica la apariencia ni la accesibilidad visual.

## Qué contiene

| Componente | Propósito |
|---|---|
| [`Border.java`](Border.java) | Ejemplo original de posicionamiento de componentes |
| [`examples/LayoutGallery.java`](examples/LayoutGallery.java) | Galería de tres tipos de layout |
| [`.github/workflows/java-compile.yml`](.github/workflows/java-compile.yml) | Compilación automatizada |
| [`docs/`](docs/) | Estudios de evolución y calidad |

## Ejecutar

**Requisitos:** JDK 21+ y entorno con pantalla.

```bash
javac Border.java examples/LayoutGallery.java
java Border
java -cp examples LayoutGallery
```

Abre la galería y cambia el tamaño de la ventana para observar qué elementos conservan su posición, se distribuyen en celdas o fluyen horizontalmente.

## Conceptos didácticos

- **BorderLayout:** zonas Norte, Sur, Este, Oeste y Centro.
- **GridLayout:** filas/columnas uniformes.
- **FlowLayout:** componentes distribuidos secuencialmente con adaptación al espacio disponible.
- **Event Dispatch Thread:** la galería crea la ventana con `SwingUtilities.invokeLater`, apropiado para Swing.

## Limitaciones verificadas

No tiene guardado de proyectos, editor visual, exportación de diseños, sistema de plugins ni pruebas automatizadas de interacción. Los programas requieren un escritorio gráfico; no pueden demostrarse visualmente solo mediante CI sin infraestructura adicional.

## Hoja de ruta

Incorporar `CardLayout`, `BoxLayout` y `GridBagLayout`; documentar diferencias de redimensionamiento, contraste, navegación por teclado y pruebas visuales propias antes de considerar una herramienta más compleja.

[Plan de ingeniería](docs/ESTUDIO_DE_EVOLUCION_2026-10-30.md) · [Estudio de arquitectura](docs/ARCHITECTURE_SCALABILITY_2026-11-04.md).

**Contexto y licencia:** ejercicio universitario conservado para fines didácticos; revisar derechos de autor antes de redistribuirlo comercialmente.
