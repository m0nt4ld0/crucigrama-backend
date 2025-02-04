# Usa la imagen oficial de Eclipse Temurin con Java 21
FROM eclipse-temurin:21-jdk AS build

# Configura el directorio de trabajo en el contenedor
WORKDIR /app

# Copia los archivos del proyecto al contenedor
COPY . .

# Construye el proyecto y genera el JAR
RUN ./mvnw clean package -DskipTests

# Usa una nueva imagen ligera de Java 21 para ejecutar la aplicación
FROM eclipse-temurin:21-jre

# Configura el directorio de trabajo en la nueva imagen
WORKDIR /app

# Copia el JAR generado en la etapa anterior
COPY --from=build /app/target/*.jar app.jar

# Expone el puerto de la aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "app.jar"]
