

# Koristimo zvaničnu JDK 11 slika kao osnovu
FROM openjdk:17

# Postavljanje radnog direktorijuma unutar kontejnera
WORKDIR /app

# Kopiranje JAR fajla aplikacije u radni direktorijum
COPY ./out/artifacts/Cloud_Kolokvijum_jar/Cloud-Kolokvijum.jar /app

# Ekspozicija porta na kojem će aplikacija osluškivati zahtjeve
EXPOSE 8080

# Komanda za pokretanje Spring Boot aplikacije kada se kontejner pokrene
CMD ["java", "-jar", "Cloud-Kolokvijum.jar"]