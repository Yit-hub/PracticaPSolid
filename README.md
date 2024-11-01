# Principios SOLID: SRP, ISP y OCP

SOLID es un conjunto de principios de diseño orientado a objetos, propuesto por Robert C. Martin, que tiene como objetivo mejorar la calidad, mantenibilidad y escalabilidad del código. A continuación se detallan tres de estos principios: SRP (Single Responsibility Principle), ISP (Interface Segregation Principle) y OCP (Open/Closed Principle).

## 1. SRP - Single Responsibility Principle (Principio de Responsabilidad Única)
**Definición:** Una clase debe tener una única responsabilidad o motivo para cambiar.

**Descripción:** Este principio establece que cada clase debe tener una responsabilidad única y exclusiva, enfocándose en cumplir una sola función. De esta manera, cualquier cambio en los requisitos que afecte esa función solo impactará a esa clase, facilitando el mantenimiento y reduciendo la complejidad.

**Ejemplo:** Una clase `Factura` debería encargarse únicamente de gestionar los datos de una factura, mientras que una clase separada, `GeneradorDeReporte`, debería manejar la generación de reportes sobre las facturas.

---

## 2. ISP - Interface Segregation Principle (Principio de Segregación de Interfaces)
**Definición:** Los clientes no deberían estar obligados a depender de interfaces que no usan.

**Descripción:** Este principio sugiere que las interfaces deben diseñarse de forma que los clientes solo implementen los métodos que realmente necesitan, evitando interfaces "pesadas" o "infladas". Esto ayuda a evitar que clases dependan de métodos innecesarios y asegura una separación más clara de responsabilidades.

**Ejemplo:** En lugar de tener una única interfaz `Animal` con métodos como `volar()`, `nadar()`, y `caminar()`, se deberían crear interfaces específicas como `Volador`, `Nadador` y `Caminante`, que solo incluyan los métodos relevantes para cada tipo de habilidad.

---

## 3. OCP - Open/Closed Principle (Principio de Abierto/Cerrado)
**Definición:** Las entidades de software (clases, módulos, funciones) deben estar abiertas para extensión pero cerradas para modificación.

**Descripción:** Este principio busca que el código pueda extenderse para nuevas funcionalidades sin necesidad de modificar su estructura original. De esta manera, se evita introducir errores en el código existente al agregar nuevas funcionalidades y se facilita la evolución del sistema.

**Ejemplo:** Una clase `OrdenDeCompra` puede ser extendida mediante la creación de clases derivadas que agreguen nuevas características, en lugar de modificar directamente la clase base.

---

Estos principios son fundamentales para la escritura de código limpio, escalable y mantenible, y ayudan a reducir la deuda técnica en proyectos de software de mediana a gran escala.

---

## Referencias
Para una descripción más detallada de los principios SOLID, consulta el libro _Clean Code_ de Robert C. Martin.

# Como Ejecutar:

Importar el documento .zip en Netbeans, este contendrá dos pacquetes, uno correciones con las soluciones propuestas, otro violaciones con las violaciones de los principios solid.
Además hay una clase Main probando las correspondientes correciones.
