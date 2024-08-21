<p align="center">
<a href="https://www.linkedin.com/in/soriamaximilianorodrigo/" target="_blank" rel="noopener noreferrer">
<img width="100%" height="100%" src="docs/img/banner.gif" alt="Linkedin"></a></p>


<p align="center">
  <a href="#"><img src="https://img.shields.io/badge/Quarkus-3.0.0-brightgreen" alt="Spring Boot"></a>
  <a href="#"><img src="https://img.shields.io/badge/chat-on%20Discord-7289da.svg?sanitize=true" alt="Chat"></a>
  <a href="#"><img src="https://img.shields.io/badge/Java-17-orange" alt="Chat"></a>
</p>

<br>
<br>

<p align="center">
<a href="https://www.linkedin.com/in/soriamaximilianorodrigo/" target="_blank" rel="noopener noreferrer">
<img width="100%" height="100%" src="docs/img/Observability-Circuit.png" alt="Linkedin"></a></p>

# Observability Circuit

Este es un proyecto de ejemplo que muestra cómo implementar un circuito de observabilidad en una aplicación Java con Spring Boot.

Utiliza las siguientes tecnologías:

Aquí tienes el contenido mejorado y ordenado:

---

## Índice de Herramientas y Tecnologías

- [Spring Boot](https://spring.io/projects/spring-boot)
- [OpenTelemetry](https://opentelemetry.io/)
    - [opentelemetry-collector-contrib](https://github.com/open-telemetry/opentelemetry-collector-contrib)
- [Zipkin](https://zipkin.io/)
- [Jaeger](https://www.jaegertracing.io/)
- [Tempo](https://grafana.com/oss/tempo/)
- [Loki](https://grafana.com/oss/loki/)
- [Prometheus](https://prometheus.io/)
- [Grafana](https://grafana.com/)

---

## OpenTelemetry

El `opentelemetry-collector-contrib` es una parte fundamental del ecosistema de OpenTelemetry. Proporciona un conjunto de componentes adicionales para el OpenTelemetry Collector, una herramienta diseñada para recibir, procesar y exportar datos de telemetría (trazas, métricas y logs) desde diferentes fuentes hacia múltiples destinos.

---

## Zipkin

Zipkin es una herramienta de trazado distribuido que ayuda a recopilar y visualizar datos sobre las latencias de solicitudes en un sistema distribuido. Su objetivo principal es facilitar la comprensión de cómo las solicitudes se propagan a través de diferentes servicios en una arquitectura de microservicios, identificando cuellos de botella o fallas.

### Funcionalidades Clave de Zipkin:

1. **Recolección de Trazas**: Recibe y almacena trazas distribuidas, representando cómo una solicitud fluye a través de los servicios.
2. **Visualización**: Ofrece una interfaz gráfica para explorar y analizar trazas, permitiendo identificar cuellos de botella y problemas de latencia.
3. **Seguimiento de Latencia**: Permite visualizar el tiempo que toma cada parte de una solicitud, ayudando a localizar la fuente de retrasos.
4. **Análisis de Dependencias**: Facilita la identificación de servicios críticos y posibles puntos de falla, visualizando las dependencias entre los servicios.

---

## Jaeger

Jaeger es otra herramienta de trazado distribuido que, al igual que Zipkin, se enfoca en recopilar y visualizar datos sobre las latencias en sistemas distribuidos. Es especialmente útil para monitorear y depurar transacciones en arquitecturas de microservicios.

### Funcionalidades Clave de Jaeger:

1. **Recolección de Trazas**: Recibe y almacena trazas distribuidas, mostrando cómo una solicitud fluye a través de los servicios.
2. **Visualización**: Similar a Zipkin, Jaeger permite explorar y analizar trazas para identificar problemas de latencia y cuellos de botella.
3. **Seguimiento de Latencia y Análisis de Dependencias**: Ofrece herramientas para analizar la latencia y las dependencias entre los servicios.

---

## Tempo

Tempo es una herramienta de trazado distribuido diseñada para integrarse estrechamente con Grafana. Su objetivo es ofrecer un sistema de trazado escalable que permite analizar las trazas en arquitecturas de microservicios.

### Funcionalidades Clave de Tempo:

1. **Recolección de Trazas**: Recibe y almacena trazas distribuidas, facilitando el análisis del flujo de solicitudes.
2. **Visualización**: Integrado con Grafana, Tempo permite explorar trazas para identificar cuellos de botella y problemas de latencia.
3. **Seguimiento de Latencia y Análisis de Dependencias**: Ofrece capacidades similares a Zipkin y Jaeger, pero con una escalabilidad superior.
4. **Escalabilidad**: Diseñado para manejar grandes volúmenes de trazas en sistemas distribuidos de gran tamaño.
5. **Integración con Grafana**: Se integra nativamente con Grafana, permitiendo la creación de paneles personalizados para analizar trazas.
6. **Almacenamiento Eficiente**: Utiliza un sistema de almacenamiento de bloques eficiente, optimizado para acceso rápido a datos.

---

## Loki

Loki es una herramienta de recopilación y análisis de logs, diseñada para ser eficiente y fácil de usar junto con Grafana.

### Funcionalidades Clave de Loki:

1. **Recolección de Logs**: Recibe y almacena logs de diversas fuentes, incluyendo aplicaciones, sistemas operativos y servicios en la nube.
2. **Indexación de Logs**: Indexa los logs para facilitar la búsqueda y el análisis, permitiendo encontrar rápidamente la información relevante.
3. **Consultas de Logs**: Ofrece una interfaz para buscar y filtrar logs, permitiendo realizar análisis avanzados y extraer información útil.

---

## Prometheus

Prometheus es una herramienta de monitoreo y alerta de código abierto, diseñada para recopilar métricas de sistemas y aplicaciones en tiempo real.

### Funcionalidades Clave de Prometheus:

1. **Recolección de Métricas**: Recibe y almacena métricas de sistemas y aplicaciones, reflejando el estado y rendimiento de un sistema.
2. **Almacenamiento de Series Temporales**: Almacena métricas en una base de datos de series temporales, permitiendo consultas y análisis en tiempo real.
3. **Consultas de Métricas**: Proporciona una interfaz para buscar y filtrar métricas, facilitando análisis avanzados.
4. **Alertas**: Permite configurar alertas basadas en umbrales y condiciones específicas, notificando a los usuarios cuando se detectan problemas.
5. **Visualización de Métricas**: Se integra con herramientas como Grafana, permitiendo la creación de paneles personalizados para monitoreo y análisis.

---

## Grafana

Grafana es una herramienta de visualización de datos de código abierto que permite la creación de paneles y dashboards personalizados para monitorear y analizar métricas, logs y trazas.

### Funcionalidades Clave de Grafana:

1. **Creación de Paneles**: Facilita la creación de dashboards personalizados para visualizar métricas, logs y trazas.
2. **Visualización de Datos**: Ofrece diversas opciones de visualización, como gráficos de líneas, barras y pasteles, para representar datos de manera clara.
3. **Alertas**: Permite configurar alertas basadas en condiciones específicas, notificando a los usuarios cuando se detectan problemas.
4. **Integración con Fuentes de Datos**: Se conecta con una amplia variedad de fuentes de datos como Prometheus, InfluxDB y Elasticsearch, permitiendo la visualización en tiempo real.




### ⭐ Autor
<br>

> ‍💻 **Nombre:** Maximiliano Rodrigo Soria
>
> 📧 **Email:** MaximilianoRodrigoSoria@gmail.com
>
> 🏠 **De:** Florencio Varela, Alpino
>
> 💼 **Linkedin:** [SoriaMaximilianoRodrigo](https://www.linkedin.com/in/soriamaximilianorodrigo/)
>
> 💬 **Chatear:**  [Inicia un chat](https://wa.me/1127043256)
>
> 📝 **CV:** [Link](https://www.canva.com/design/DAFxIt0xaNQ/tKTSodPQyHett1abRieMyw/view?utm_content=DAFxIt0xaNQ&utm_campaign=designshare&utm_medium=link&utm_source=publishsharelink)

<!-- Example to tags

> [!NOTE]
> Highlights information that users should take into account, even when skimming.

> [!TIP]
> Optional information to help a user be more successful.

> [!IMPORTANT]
> Crucial information necessary for users to succeed.

> [!WARNING]
> Critical content demanding immediate user attention due to potential risks.

> [!CAUTION]
> Negative potential consequences of an action.
-->

<br>